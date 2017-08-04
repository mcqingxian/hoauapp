package com.hoau.hoauapp.service.impl;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

import javax.annotation.Resource;

import org.apache.log4j.Logger;
import org.springframework.dao.CannotAcquireLockException;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.hoau.hoauapp.entity.GisCompanyEntity;
import com.hoau.hoauapp.job.CompanySyncJob;
import com.hoau.hoauapp.job.GisCompanySyncJob;
import com.hoau.hoauapp.mapper.GisCompanySyncMapper;
import com.hoau.hoauapp.mapper.JobSyncMapper;
import com.hoau.hoauapp.si.gis.gismapper.GisCompanyMapper;
import com.hoau.hoauapp.util.LatLngConvertUtil;
@Service
public class GisCompanySyncService {
	private Logger log = Logger.getLogger(getClass());
	@Resource
	private GisCompanySyncMapper gisCompanySyncMapper;
	@Resource
	private GisCompanyMapper gisCompanyMapper;
	@Resource
	private JobSyncMapper jobSyncMapper;
	@Transactional
	public void gisCompanySync() {
		if(!this.lockJob()){
			return;
		}
		List<GisCompanyEntity> companys = gisCompanyMapper.queryGisCompanys();
		if(companys!=null&&companys.size()>0){
			/**
			 * 通过List转换set，再转换成list去除重复数据
			 */
			Set<GisCompanyEntity> set = new HashSet<GisCompanyEntity>(companys);
			companys = new ArrayList<GisCompanyEntity>(set);
			for (GisCompanyEntity company : companys) {
				company.setCode("N"+company.getCode());
				company.setName("N"+company.getName());
				company.setLat(LatLngConvertUtil.latG2B(company.getLat()));
				company.setLng(LatLngConvertUtil.lngG2B(company.getLng()));
			}
			gisCompanySyncMapper.clearGisCompany();
			gisCompanySyncMapper.saveGisCompany(companys);
			Map<String, String> map = new HashMap<String, String>();
			map.put("jobName", "GisCompanySyncJob");
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
			int jobNum = jobSyncMapper.forUpdateJobLock(GisCompanySyncJob.JOB_NAME);
			if(jobNum == 0){
				jobSyncMapper.saveJob(GisCompanySyncJob.JOB_NAME);
				jobSyncMapper.forUpdateJobLock(GisCompanySyncJob.JOB_NAME);
			}
			return true;
		} catch (CannotAcquireLockException e) {
			log.warn("job has start execute");
			return false;
		}
		
	}
}
