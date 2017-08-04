package com.hoau.hoauapp.service;

import java.util.List;

import com.hoau.hoauapp.vo.UserCouponClippingVo;

/**
 * DC优惠券接口
 * 
 * @author 277610
 * @Date 2015-04-28
 */
public interface ICouponClippingService extends IDCCouponClippingService {

	/**
	 * 生成序列号
	 */
	public UserCouponClippingVo createCCNum(UserCouponClippingVo userCC) throws Exception;
	
	/**
	 * 获取优惠券状态
	 */
	public List<String> queryCCStatus(String startDate, String endDate);
}
