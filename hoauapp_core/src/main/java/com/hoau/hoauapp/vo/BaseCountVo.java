package com.hoau.hoauapp.vo;

public class BaseCountVo extends ResBaseVo{
	//我的未读消息总数
	private long msgTotal;
	//我的积分
	private long scoreTotal;
	//我的优惠券
	private long couponTotal;
	//代评价订单数量 
	private long orderTotal;
	public long getMsgTotal() {
		return msgTotal;
	}
	public void setMsgTotal(long msgTotal) {
		this.msgTotal = msgTotal;
	}
	public long getScoreTotal() {
		return scoreTotal;
	}
	public void setScoreTotal(long scoreTotal) {
		this.scoreTotal = scoreTotal;
	}
	public long getCouponTotal() {
		return couponTotal;
	}
	public void setCouponTotal(long couponTotal) {
		this.couponTotal = couponTotal;
	}
	public long getOrderTotal() {
		return orderTotal;
	}
	public void setOrderTotal(long orderTotal) {
		this.orderTotal = orderTotal;
	}
	
	
	
	
}
