package com.hoau.hoauapp.vo;

/**
 * 
 * @author zhangchao 2016年5月5日下午1:38:50 省市区的接口
 */
public class MDMDistrictInfo {
	private String districtCode;
	private String districtName;
	private String districtType;
	private String short_name; // 省市区的简写
	private String pinyin;

	public String getDistrictCode() {
		return districtCode;
	}

	public void setDistrictCode(String districtCode) {
		this.districtCode = districtCode;
	}

	public String getDistrictName() {
		return districtName;
	}

	public void setDistrictName(String districtName) {
		this.districtName = districtName;
	}

	public String getDistrictType() {
		return districtType;
	}

	public void setDistrictType(String districtType) {
		this.districtType = districtType;
	}

	public String getShort_name() {
		return short_name;
	}

	public void setShort_name(String short_name) {
		this.short_name = short_name;
	}

	public String getPinyin() {
		return pinyin;
	}

	public void setPinyin(String pinyin) {
		this.pinyin = pinyin;
	}

}
