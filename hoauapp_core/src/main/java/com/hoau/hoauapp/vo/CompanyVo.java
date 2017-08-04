package com.hoau.hoauapp.vo;

public class CompanyVo{
	/**
	 * 公司编号
	 */
	private String companyCode;
	/**
	 * 公司简称
	 */
	private String companyName;
	/**
	 * 公司详细名称
	 */
	private String companyNameDetail;
	/**
	 * 详细地址
	 */
	private String addressDetail;
	/**
	 * 纬度
	 */
	private double lat;
	/**
	 * 经度
	 */
	private double lng;
	/**
	 * 电话
	 */
	private String phone;
	/**
	 * 是否提供定日达
	 */
	private boolean isSpecifiedTime;
	/**
	 * 是否可出发
	 */
	private boolean isDepart;
	/**
	 * 是否可自提
	 */
	private boolean isTakeSelf;
	/**
	 * 是否可送货
	 */
	private boolean isDeliver;
	public String getCompanyCode() {
		return companyCode;
	}
	public void setCompanyCode(String companyCode) {
		this.companyCode = companyCode;
	}
	public String getCompanyName() {
		return companyName;
	}
	public void setCompanyName(String companyName) {
		this.companyName = companyName;
	}
	public String getCompanyNameDetail() {
		return companyNameDetail;
	}
	public void setCompanyNameDetail(String companyNameDetail) {
		this.companyNameDetail = companyNameDetail;
	}
	public String getAddressDetail() {
		return addressDetail;
	}
	public void setAddressDetail(String addressDetail) {
		this.addressDetail = addressDetail;
	}
	public double getLat() {
		return lat;
	}
	public void setLat(double lat) {
		this.lat = lat;
	}
	public double getLng() {
		return lng;
	}
	public void setLng(double lng) {
		this.lng = lng;
	}
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	public boolean isSpecifiedTime() {
		return isSpecifiedTime;
	}
	public void setSpecifiedTime(boolean isSpecifiedTime) {
		this.isSpecifiedTime = isSpecifiedTime;
	}
	public boolean isDepart() {
		return isDepart;
	}
	public void setDepart(boolean isDepart) {
		this.isDepart = isDepart;
	}
	public boolean isTakeSelf() {
		return isTakeSelf;
	}
	public void setTakeSelf(boolean isTakeSelf) {
		this.isTakeSelf = isTakeSelf;
	}
	public boolean isDeliver() {
		return isDeliver;
	}
	public void setDeliver(boolean isDeliver) {
		this.isDeliver = isDeliver;
	}
	
	

}
