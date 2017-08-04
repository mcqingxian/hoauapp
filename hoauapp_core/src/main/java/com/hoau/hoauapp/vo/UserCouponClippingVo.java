package com.hoau.hoauapp.vo;

import java.util.Date;

/**
 * 用户优惠券信息实体
 * 
 * @author 277610
 * @Date 2015-04-02
 */
public class UserCouponClippingVo extends ResBaseVo {

	/**
	 * 序列化
	 */
	private static final long serialVersionUID = -4110250006836834413L;
	
	/**
	 * 用户ID
	 */
	private String userId;
	
	/**
	 * 优惠券表主键
	 */
	private int ccId;

	/**
	 * 优惠券金额
	 */
	private int amount;

	/**
	 * 积分数
	 */
	private int integral;
	
	/**
	 * 优惠券序号
	 */
	private String ccOrder;
	
	/**
	 * 优惠券状态
	 */
	private String ccStatus;
	
	/**
	 * 过期时间
	 */
	private Date deadLine;
	
	/**
	 * 兑换时间
	 */
	private Date createDate;

	public int getAmount() {
		return amount;
	}

	public void setAmount(int amount) {
		this.amount = amount;
	}

	public int getIntegral() {
		return integral;
	}

	public void setIntegral(int integral) {
		this.integral = integral;
	}

	public int getCcId() {
		return ccId;
	}

	public void setCcId(int ccId) {
		this.ccId = ccId;
	}

	public String getCcOrder() {
		return ccOrder;
	}

	public void setCcOrder(String ccOrder) {
		this.ccOrder = ccOrder;
	}

	public String getCcStatus() {
		return ccStatus;
	}

	public void setCcStatus(String ccStatus) {
		this.ccStatus = ccStatus;
	}

	public Date getDeadLine() {
		return deadLine;
	}

	public void setDeadLine(Date deadLine) {
		this.deadLine = deadLine;
	}

	public String getUserId() {
		return userId;
	}

	public void setUserId(String userId) {
		this.userId = userId;
	}

	public Date getCreateDate() {
		return createDate;
	}

	public void setCreateDate(Date createDate) {
		this.createDate = createDate;
	}

}
