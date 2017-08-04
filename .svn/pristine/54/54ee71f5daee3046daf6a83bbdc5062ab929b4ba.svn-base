package com.hoau.hoauapp.job;

import java.util.HashMap;
import java.util.Map;

import javax.annotation.Resource;

import org.apache.log4j.Logger;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

import com.hoau.hoauapp.service.impl.CompanySyncService;
import com.hoau.hoauapp.util.LogUtil;

/**
 * 
 * @author 271755
 * 迪辰公司信息同步Job
 */
@Component
public class CompanySyncJob {
	public static final String JOB_NAME = "CompanySyncJob";
	private Logger log = Logger.getLogger(getClass());
	@Resource
	private CompanySyncService companySyncService;
	/*@Scheduled(cron="0/30 * *  * * ?")*/
	@Scheduled(cron="0 0 2 * * ?" )
    public void companySync(){
		try {
			log.info("the CompanySyncJob start");
			companySyncService.companySync();
			log.info("the CompanySyncJob end");
		} catch (Exception e) {
			e.printStackTrace();
			Map<String,String> map = new HashMap<String,String>();
			map.put("jobName", "CompanySyncJob");
			map.put("status", "failed");
			map.put("message", LogUtil.logFormat(e));
			companySyncService.saveJobLog(map);
		}
    }
}
