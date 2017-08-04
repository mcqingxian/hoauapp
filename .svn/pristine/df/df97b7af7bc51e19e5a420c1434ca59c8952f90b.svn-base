package com.hoau.hoauapp.job;

import java.util.HashMap;
import java.util.Map;

import javax.annotation.Resource;

import org.apache.log4j.Logger;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

import com.hoau.hoauapp.service.impl.DistrictSyncService;
import com.hoau.hoauapp.util.LogUtil;

/**
 * 
 * @author 271755
 * 省市区同步Job
 */
@Component
public class DistrictSyncJob {
	private Logger log = Logger.getLogger(getClass());
	@Resource
	private DistrictSyncService districtSyncService;
	/*@Scheduled(cron="0 0 0/2 * * ?" )*/
    public void districtSync(){
		try {
			log.info("the DistrictSyncJob start");
			districtSyncService.districtSync();
			log.info("the DistrictSyncJob end");
		} catch (Exception e) {
			e.printStackTrace();
			Map<String,String> map = new HashMap<String,String>();
			map.put("jobName", "DistrictSyncJob");
			map.put("status", "failed");
			map.put("message", LogUtil.logFormat(e));
			districtSyncService.saveJobLog(map);
		}
    }
}
