package com.hoau.hoauapp.job;

import java.util.HashMap;
import java.util.Map;

import javax.annotation.Resource;

import org.apache.log4j.Logger;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

import com.hoau.hoauapp.service.impl.GisCompanySyncService;
import com.hoau.hoauapp.util.LogUtil;
/**
 * 
 * @author 271755
 * GIS公司信息同步Job
 */
@Component
public class GisCompanySyncJob {
	public static final String JOB_NAME = "GisCompanySyncJob";
	private Logger log = Logger.getLogger(getClass());
	@Resource
	private GisCompanySyncService gisCompanySyncService;
	@Scheduled(cron="0 0 0/4 * * ?" )
	/*@Scheduled(cron="0/30 * *  * * ?")*/
    public void gisCompanySync(){
		try {
			log.info("the GisCompanySyncJob start");
			gisCompanySyncService.gisCompanySync();
			log.info("the GisCompanySyncJob end");
		} catch (Exception e) {
			e.printStackTrace();
			Map<String,String> map = new HashMap<String,String>();
			map.put("jobName", "GisCompanySyncJob");
			map.put("status", "failed");
			map.put("message",LogUtil.logFormat(e));
			gisCompanySyncService.saveJobLog(map);
		}
    }
}
