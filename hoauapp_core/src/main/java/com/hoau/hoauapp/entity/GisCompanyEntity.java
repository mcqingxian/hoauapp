/**
 * 
 */
package com.hoau.hoauapp.entity;

/**
 * @author 271755 GIS查询公司信息实体
 */
public class GisCompanyEntity {
	/**
	 * 公司编码
	 */
	private String code;
	/**
	 * 公司名称
	 */
	private String name;
	/**
	 * 地址
	 */
	private String address;
	/**
	 * 纬度
	 */
	private double lat;
	/**
	 * 经度
	 */
	private double lng;
	/**
	 * 联系人
	 */
	private String linkman;
	/**
	 * 电话
	 */
	private String phone;

	public String getCode() {
		return code;
	}

	public void setCode(String code) {
		this.code = code;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
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

	public String getLinkman() {
		return linkman;
	}

	public void setLinkman(String linkman) {
		this.linkman = linkman;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public int hashCode() {
		return this.code == null ? System.identityHashCode(this) : this.code
				.hashCode();
	}

	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}
		if (obj == null) {
			return false;
		}
		if (obj instanceof GisCompanyEntity) {
			GisCompanyEntity other = (GisCompanyEntity) obj;
			return (other.code).equals(this.code);
		}
		return false;
	}

}
