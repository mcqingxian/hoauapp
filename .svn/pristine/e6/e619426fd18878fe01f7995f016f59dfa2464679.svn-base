package com.hoau.hoauapp.business.impl;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.hoau.hoauapp.business.INearDeptsService;
import com.hoau.hoauapp.mapper.NearDeptsMapper;
import com.hoau.hoauapp.vo.CompanyVo;

@SuppressWarnings("restriction")
@Service
public class NearDeptsService implements INearDeptsService{
	@Resource
	private NearDeptsMapper nearDeptsMapper;
	
	public List<CompanyVo> queryNearDeptsByLnglat(double lng, double lat) {
		Map<String,Object> map = new HashMap<String,Object>();
		map.put("lng", lng);
		map.put("lat", lat);
		map.put("size", 10);
		return nearDeptsMapper.queryNearDeptsByLnglat(map);
	}
	
}
