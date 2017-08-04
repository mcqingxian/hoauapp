package com.hoau.hoauapp.vo;

import java.util.Date;

public class ValidateCodeVo extends ResBaseVo {

	/**
	 * 主键
	 */
	private Integer id;

	/**
	 * 手机号
	 */
	private String phone;

	/**
	 * 验证码
	 */
	private String validateCode;

	/**
	 * 修改时间
	 */
	private Date modifyDate;

	public String getValidateCode() {
		return validateCode;
	}

	public void setValidateCode(String validateCode) {
		this.validateCode = validateCode;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public Date getModifyDate() {
		return modifyDate;
	}

	public void setModifyDate(Date modifyDate) {
		this.modifyDate = modifyDate;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

}
