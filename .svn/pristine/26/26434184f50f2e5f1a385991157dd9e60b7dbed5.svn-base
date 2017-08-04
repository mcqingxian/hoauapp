package com.hoau.hoauapp.mapper;

import org.springframework.stereotype.Repository;

import com.hoau.hoauapp.vo.ValidateCodeVo;

@Repository
public interface VerificationCodeMapper {

	/**
	 * 查询某个手机号是否已生成验证码
	 */
	public ValidateCodeVo getValidateCodeByPhone(String phone);
	
	/**
	 * 创建验证码
	 */
	public void createValidateCode(ValidateCodeVo validateCodeVo);
	
	/**
	 * 修改验证码
	 */
	public void modifyValidateCode(ValidateCodeVo validateCodeVo);
}