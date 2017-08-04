package com.hoau.hoauapp.entity;

import java.io.Serializable;
/**
 * 
 * @author 271755
 * 迪辰查询公司信息实体
 */
public class CompanyEntity implements Serializable{
	/**
	 * 公司编号.....
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
	 * 省份
	 */
	private String province;
	/**
	 * 城市
	 */
	private String city;
	/**
	 * 区县
	 */
	private String region;
	/**
	 * 区号
	 */
	private String areaCode;
	/**
	 * 详细地址
	 */
	private String addressDetail;
	/**
	 * 电话
	 */
	private String phone;
	/**
	 * 是否提供定日达
	 */
	private String isSpecifiedTime;
	/**
	 * 送货依托
	 */
	private String deliveryDepend;
	/**
	 * 自提依托
	 */
	private String takeSelfDepend;
	/**
	 * 是否激活
	 */
	private String active;
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
	public String getProvince() {
		return province;
	}
	public void setProvince(String province) {
		this.province = province;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getRegion() {
		return region;
	}
	public void setRegion(String region) {
		this.region = region;
	}
	public String getAreaCode() {
		return areaCode;
	}
	public void setAreaCode(String areaCode) {
		this.areaCode = areaCode;
	}
	public String getAddressDetail() {
		return addressDetail;
	}
	public void setAddressDetail(String addressDetail) {
		this.addressDetail = addressDetail;
	}
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	public String getIsSpecifiedTime() {
		return isSpecifiedTime;
	}
	public void setIsSpecifiedTime(String isSpecifiedTime) {
		this.isSpecifiedTime = isSpecifiedTime;
	}
	public String getDeliveryDepend() {
		return deliveryDepend;
	}
	public void setDeliveryDepend(String deliveryDepend) {
		this.deliveryDepend = deliveryDepend;
	}
	public String getTakeSelfDepend() {
		return takeSelfDepend;
	}
	public void setTakeSelfDepend(String takeSelfDepend) {
		this.takeSelfDepend = takeSelfDepend;
	}
	public String getActive() {
		return active;
	}
	public void setActive(String active) {
		this.active = active;
	}
	
}
