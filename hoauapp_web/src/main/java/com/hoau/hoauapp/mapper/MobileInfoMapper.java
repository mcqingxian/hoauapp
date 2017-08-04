package com.hoau.hoauapp.mapper;

import java.util.List;

import com.hoau.hoauapp.vo.MobileInfoEntryVo;
import com.hoau.hoauapp.vo.MobileInfoVo;

public interface MobileInfoMapper {
    /**
     * 根据IMES号查询手机设备信息
     * @param mobilevo
     * @return
     */
	public List<MobileInfoVo> findMobileInfo(MobileInfoVo mobilevo);
	/**
	 * 添加手机设备信息
	 * @param mobilevo
	 */
	public void createMobileInfo(MobileInfoVo mobilevo);
	/**
	 * 添加手机设备明细信息
	 * @param mentryvo
	 */
	public void createMobileInfoEntry(MobileInfoEntryVo mentryvo);
}
