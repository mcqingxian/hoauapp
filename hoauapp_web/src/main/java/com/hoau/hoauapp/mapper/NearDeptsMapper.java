package com.hoau.hoauapp.mapper;

import java.util.List;
import java.util.Map;

import com.hoau.hoauapp.vo.CompanyVo;

public interface NearDeptsMapper {

	List<CompanyVo> queryNearDeptsByLnglat(Map<String, Object> map);
	
}
