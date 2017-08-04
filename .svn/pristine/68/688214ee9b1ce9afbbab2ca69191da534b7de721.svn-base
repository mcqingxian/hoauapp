package com.hoau.hoauapp.business.impl;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.hoau.hoauapp.business.IVersionsManageService;
import com.hoau.hoauapp.mapper.VersionUpdateMapper;
import com.hoau.hoauapp.vo.VersionUpdateSubInfoVo;
/**
 * 
 *
 * @作者： wangmingzhao
 * @Title: VersionsManageService.java
 * @Package com.hoau.hoauapp.business.impl
 * @Description: 后台版本管理服务实现类
 * @Date: 2015-4-14 上午9:33:50
 */
@Service
public class VersionsManageService implements IVersionsManageService {

	@Resource
	private VersionUpdateMapper versionUpdateMapper;
	
	@Transactional
	public void addVersion(VersionUpdateSubInfoVo vo) throws Exception {
		
		versionUpdateMapper.updateToHistory(vo);
		versionUpdateMapper.addVersionInfo(vo);

	}

	public List<VersionUpdateSubInfoVo> findVersions(VersionUpdateSubInfoVo vo,
			int start, int size) throws Exception {
		Map m =new HashMap();
		m.put("start", start);
		m.put("limit", size);
		return versionUpdateMapper.findVersionsList(m);
	}

	public long getCount(VersionUpdateSubInfoVo vo) throws Exception {
		// TODO Auto-generated method stub
		return versionUpdateMapper.getCount(vo);
	}

}
