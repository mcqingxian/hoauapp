package com.hoau.hoauapp.service.impl;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.annotation.Resource;

import org.apache.log4j.Logger;
import org.springframework.dao.CannotAcquireLockException;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.hoau.hoauapp.job.DcCCStatusSyncJob;
import com.hoau.hoauapp.mapper.DcCCStatusSyncMapper;
import com.hoau.hoauapp.mapper.JobSyncMapper;

@Service
public class DcCCStatusSyncService {
	private Logger log = Logger.getLogger(getClass());
	@Resource
	private DcCCStatusSyncMapper dcCCStatusSyncMapper;
	@Resource
	private CouponClippingService couponClippingService;
	@Resource
	private JobSyncMapper jobSyncMapper;

	// 同步数据的天数
	private static int day = -2;

	@Transactional
	public void ccStatusSync() {
		if (!this.lockJob()) {
			return;
		}
		// 获取同步时间
		SimpleDateFormat df = new SimpleDateFormat("yyyy/MM/dd 00:00");
		// 获取优惠券信息
		List<String> vList = couponClippingService.queryCCStatus(
				df.format(getStartDate()), df.format(getEndDate()));
		//判断是否有使用的优惠券
		if (vList != null && vList.size() > 0) {
			dcCCStatusSyncMapper.updateCCStatus(vList);
		}
		// 保存日志信息
		Map<String, String> map = new HashMap<String, String>();
		map.put("jobName", DcCCStatusSyncJob.JOB_NAME);
		map.put("status", "success");
		map.put("message", "");
		saveJobLog(map);
	}

	// 获得开始时间
	public Date getStartDate() {
		Calendar cal = Calendar.getInstance();
		cal.add(Calendar.DATE, day);
		cal.set(Calendar.HOUR_OF_DAY, 24);
		cal.set(Calendar.SECOND, 0);
		cal.set(Calendar.MINUTE, 0);
		cal.set(Calendar.MILLISECOND, 0);
		return cal.getTime();
	}

	// 获得当天24点时间
	public Date getEndDate() {
		Calendar cal = Calendar.getInstance();
		cal.set(Calendar.HOUR_OF_DAY, 24);
		cal.set(Calendar.SECOND, 0);
		cal.set(Calendar.MINUTE, 0);
		cal.set(Calendar.MILLISECOND, 0);
		return cal.getTime();
	}

	@Transactional
	public void saveJobLog(Map<String, String> map) {
		jobSyncMapper.saveJobLog(map);
	}

	private boolean lockJob() {
		try {
			jobSyncMapper.setSessionLockWaitTimeout();
			int jobNum = jobSyncMapper
					.forUpdateJobLock(DcCCStatusSyncJob.JOB_NAME);
			if (jobNum == 0) {
				jobSyncMapper.saveJob(DcCCStatusSyncJob.JOB_NAME);
				jobSyncMapper.forUpdateJobLock(DcCCStatusSyncJob.JOB_NAME);
			}
			return true;
		} catch (CannotAcquireLockException e) {
			log.warn("job has start execute");
			return false;
		}

	}
}
