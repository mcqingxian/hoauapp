package com.hoau.hoauapp.mapper;

import java.util.List;

import com.hoau.hoauapp.entity.User;
import com.hoau.hoauapp.vo.CouponClippingVo;
import com.hoau.hoauapp.vo.IntegralInfoVo;
import com.hoau.hoauapp.vo.ResBaseVo;
import com.hoau.hoauapp.vo.UserCouponClippingVo;

public interface UserInfoMapper {
	/**
	 * 用过用户ID查询用户信息
	 * @param userid
	 * @return
	 */
	public User getUserInfo(String userid);
	
	/**
	 * 根据手机或用户ID查询用户信息
	 * @param userinfo
	 * @return
	 */
	public User findUserInfo(User userinfo);
	
	/**
	 * 创建用户信息
	 * @param userinfo
	 */
	public void createUserInfo(User userinfo);
	/**
	 * 修改用户信息
	 * @param userinfo
	 */
	public void modifyUserInfo(User userinfo);
	
	/**
	 * 修改用户积分
	 */
	public void updateUserIntegral(IntegralInfoVo integralInfoVo);
	
	/**
	 * 查询优惠券
	 */
	public List<CouponClippingVo> queryCouponClipping();
	
	/**
	 * 根据ID查询优惠券信息
	 */
	public CouponClippingVo queryCouponClippingById(int ccId);
	
	/**
	 * 新增优惠券
	 */
	public void exchangeCC(UserCouponClippingVo userCC);
	
	/**
	 * 查询优惠券
	 */
	public List<UserCouponClippingVo> getCCInfo(User user);
	
	/**
	 * 查询未使用未过期优惠券
	 */
	public List<UserCouponClippingVo> getUnUserCCInfo(User user);
	
	/**
	 * 查询未使用优惠券
	 */
	public int getUnUseCCCount(User user);

}
