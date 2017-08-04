package com.hoau.hoauapp.vo;

import java.util.Date;

public class MobileInfoVo extends ResBaseVo{
	
	private String imei; //IMEI
	private String imsi; //IMSI
	private String mtype;//手机型号
	private String mtyb; //手机品牌
	private String androidsdk; //SDK版本
	private String androidv; //系统版本
	private Date createdate;
	private int id;
	
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public Date getCreatedate() {
		return createdate;
	}
	public void setCreatedate(Date createdate) {
		this.createdate = createdate;
	}
	public String getImei() {
		return imei;
	}
	public void setImei(String imei) {
		this.imei = imei;
	}
	public String getImsi() {
		return imsi;
	}
	public void setImsi(String imsi) {
		this.imsi = imsi;
	}
	public String getMtype() {
		return mtype;
	}
	public void setMtype(String mtype) {
		this.mtype = mtype;
	}
	public String getMtyb() {
		return mtyb;
	}
	public void setMtyb(String mtyb) {
		this.mtyb = mtyb;
	}
	public String getAndroidsdk() {
		return androidsdk;
	}
	public void setAndroidsdk(String androidsdk) {
		this.androidsdk = androidsdk;
	}
	public String getAndroidv() {
		return androidv;
	}
	public void setAndroidv(String androidv) {
		this.androidv = androidv;
	}
	
	

}
