package com.hoau.hoauapp.mapper;


import org.springframework.stereotype.Repository;

import com.hoau.hoauapp.entity.OperateRecord;

@Repository
public interface OperateRecordMapper {
	void saveRecord(OperateRecord record);
}
