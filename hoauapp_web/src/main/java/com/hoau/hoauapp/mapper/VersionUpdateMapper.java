package com.hoau.hoauapp.mapper;

import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Repository;

import com.hoau.hoauapp.vo.VersionUpdateInfoVo;
import com.hoau.hoauapp.vo.VersionUpdateSubInfoVo;

@Repository
public interface VersionUpdateMapper {

	public VersionUpdateInfoVo getVersionInfo(VersionUpdateInfoVo vo);
	
	public void addVersionInfo(VersionUpdateSubInfoVo vo);
	
	public int updateToHistory(VersionUpdateSubInfoVo vo);

	public List<VersionUpdateSubInfoVo> findVersionsList(Map map);

	public long getCount(VersionUpdateSubInfoVo vo);
	
}