package com.hoau.hoauapp.mapper;

import java.util.Map;

import org.springframework.stereotype.Repository;

import com.hoau.hoauapp.vo.IntegralInfoVo;

/**
 * 积分管理
 * 
 * @author 277610
 * @Date 2015-01-22
 */
@Repository
public interface IntegralMapper {
	
	/**
	 * 查询积分类型对应的积分
	 */
	public int queryIntegral(int itype);

	/**
	 * 用户增加积分
	 */
	public IntegralInfoVo addIntegral(IntegralInfoVo integralInfoVo);
	
	/**
	 * 判断今天是否已经“签到”增加积分
	 */
	public int getSignedLists(IntegralInfoVo integralInfoVo);

	/**
	 * 查询当前签到用户昨天是否也签到
	 */
	public IntegralInfoVo findIntegral(Map<String, Object> params);

}