package com.hoau.hoauapp.job;

import java.util.HashMap;
import java.util.Map;

import javax.annotation.Resource;

import org.apache.log4j.Logger;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

import com.hoau.hoauapp.service.impl.DcCCStatusSyncService;
import com.hoau.hoauapp.util.LogUtil;
/**
 * 
 * @author 277610
 * 优惠券状态同步Job
 */
@Component
public class DcCCStatusSyncJob {
	public static final String JOB_NAME = "DcCCStatusSyncJob";
	private Logger log = Logger.getLogger(getClass());
	@Resource
	private DcCCStatusSyncService dcCCStatusSyncService;
	@Scheduled(cron="0 0 0/4 * * ?" )
	//@Scheduled(cron="0/30 * *  * * ?")
    public void gisCompanySync(){
		try {
			log.info("the DcCCStatusSyncJob start");
			dcCCStatusSyncService.ccStatusSync();
			log.info("the DcCCStatusSyncJob end");
		} catch (Exception e) {
			e.printStackTrace();
			Map<String,String> map = new HashMap<String,String>();
			map.put("jobName", "DcCCStatusSyncJob");
			map.put("status", "failed");
			map.put("message",LogUtil.logFormat(e));
			dcCCStatusSyncService.saveJobLog(map);
		}
    }
}
