package com.hoau.hoauapp.mapper;

import java.util.List;

import org.springframework.stereotype.Repository;

@Repository
public interface DcCCStatusSyncMapper {

	void updateCCStatus(List<String> vList);
}
