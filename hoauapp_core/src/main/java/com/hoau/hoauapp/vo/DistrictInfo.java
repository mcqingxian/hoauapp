package com.hoau.hoauapp.vo;
/**
 * 
 * @author 271755
 * 省份
 */
public class  DistrictInfo {
	private String id;
	
	private String  districtCode;
	
	private String  districtName;
	/**
	 * 简称
	 */
	private String  districtShortName;
	/**
	 * 上级id
	 */
	private String  districtParentId;
	
	private boolean hasChild;
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
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
	public String getDistrictShortName() {
		return districtShortName;
	}
	public void setDistrictShortName(String districtShortName) {
		this.districtShortName = districtShortName;
	}
	public String getDistrictParentId() {
		return districtParentId;
	}
	public void setDistrictParentId(String districtParentId) {
		this.districtParentId = districtParentId;
	}
	public boolean isHasChild() {
		return hasChild;
	}
	public void setHasChild(boolean hasChild) {
		this.hasChild = hasChild;
	}
	
}
