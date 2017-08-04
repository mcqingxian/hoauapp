package com.hoau.hoauapp.mapper;

import java.util.Map;

import org.springframework.stereotype.Repository;
@Repository
public interface JobSyncMapper {

	void saveJobLog(Map<String, String> map);
	
	void setSessionLockWaitTimeout();
	
	int forUpdateJobLock(String jobName);

	void saveJob(String jobName);
}
