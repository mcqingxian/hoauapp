package com.hoau.hoauapp.vo;

import java.util.List;

/**
 * 用户优惠券信息实体集合
 * 
 * @author 277610
 * @Date 2015-04-02
 */
public class UserCouponClippingListVo extends ResBaseVo {

	private static final long serialVersionUID = -7559013417170285462L;

	/**
	 * 用户优惠券信息集合
	 */
	List<UserCouponClippingVo> userCouponClippingVoList;

	public List<UserCouponClippingVo> getUserCouponClippingVoList() {
		return userCouponClippingVoList;
	}

	public void setUserCouponClippingVoList(
			List<UserCouponClippingVo> userCouponClippingVoList) {
		this.userCouponClippingVoList = userCouponClippingVoList;
	}
	
}
