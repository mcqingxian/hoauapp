/**
 * 
 */
package com.hoau.hoauapp.service.impl;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.annotation.Resource;

import org.apache.log4j.Logger;
import org.springframework.dao.CannotAcquireLockException;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.hoau.hoauapp.entity.CompanyEntity;
import com.hoau.hoauapp.job.CompanySyncJob;
import com.hoau.hoauapp.mapper.CompanySyncMapper;
import com.hoau.hoauapp.mapper.JobSyncMapper;
import com.hoau.hoauapp.si.dc.company.Company;
import com.hoau.hoauapp.si.dc.company.CompanyData;
import com.hoau.hoauapp.si.dc.company.CompanyServices;
import com.hoau.hoauapp.si.dc.company.CompanyServices_Service;

/**
 * @author 271755
 * 
 */
@Service
public class CompanySyncService {
	private Logger log = Logger.getLogger(getClass());
	@Resource
	private CompanySyncMapper companySyncMapper;
	@Resource
	private JobSyncMapper jobSyncMapper;

	@Transactional
	public void companySync() {
		if(!this.lockJob()){
			return;
		}
		URL url = null;
		try {
			url = new URL(
					"http://10.39.109.29:8080/services/CompanyServices?wsdl");
		} catch (MalformedURLException e) {
			e.printStackTrace();
		}
		CompanyServices_Service ss = new CompanyServices_Service(url);
		CompanyServices port = ss.getCompanyServicesPort();
		CompanyData companyData = port.getCompanyData();
		if (companyData.getDetails() != null
				&& companyData.getDetails().size() > 0) {
			List<CompanyEntity> companyEntitys = new ArrayList<CompanyEntity>();
			List<Company> companys = companyData.getDetails();
			for (Company company : companys) {
				CompanyEntity c = new CompanyEntity();
				c.setActive(company.getSFYX());
				c.setAddressDetail(company.getZS());
				c.setAreaCode(company.getAREACODE());
				c.setCity(company.getCSMC());
				c.setCompanyCode(company.getCSBH());
				c.setCompanyName(company.getGSJC());
				c.setCompanyNameDetail(company.getQYMC());
				c.setDeliveryDepend(company.getYTGSSHSM());
				c.setIsSpecifiedTime(company.getSFTGDRDFW());
				c.setPhone(company.getDH());
				c.setProvince(company.getSFMC());
				c.setRegion(company.getREGION());
				c.setTakeSelfDepend(company.getYTGSKHZT());
				companyEntitys.add(c);
			}
			companySyncMapper.clearCompany();
			companySyncMapper.saveCompany(companyEntitys);
			Map<String, String> map = new HashMap<String, String>();
			map.put("jobName", "CompanySyncJob");
			map.put("status", "success");
			map.put("message", "");
			saveJobLog(map);
		}
	}

	@Transactional
	public void saveJobLog(Map<String, String> map) {
		jobSyncMapper.saveJobLog(map);
	}
	
	private boolean lockJob(){
		try {
			jobSyncMapper.setSessionLockWaitTimeout();
			int jobNum = jobSyncMapper.forUpdateJobLock(CompanySyncJob.JOB_NAME);
			if(jobNum == 0){
				jobSyncMapper.saveJob(CompanySyncJob.JOB_NAME);
				jobSyncMapper.forUpdateJobLock(CompanySyncJob.JOB_NAME);
			}
			return true;
		} catch (CannotAcquireLockException e) {
			log.warn("job has start execute");
			return false;
		}
		
		
	}
	
}
