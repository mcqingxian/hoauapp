package com.hoau.hoauapp.business;

import java.util.List;

import com.hoau.hoauapp.vo.VersionUpdateSubInfoVo;

/**
 * 
 *
 * @作者： wangmingzhao
 * @Title: IVersionsManageService.java
 * @Package com.hoau.hoauapp.business
 * @Description: 后台版本管理服务接口类
 * @Date: 2015-4-14 上午9:24:08
 */
public interface IVersionsManageService {
	public void addVersion(VersionUpdateSubInfoVo vo) throws Exception;
	public List<VersionUpdateSubInfoVo> findVersions(VersionUpdateSubInfoVo vo,int start,int size) throws Exception;
	public long getCount(VersionUpdateSubInfoVo vo)throws Exception;
	
	
}
