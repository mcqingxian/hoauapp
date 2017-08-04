/**
 * 
 */
package com.hoau.hoauapp.business.impl;

import java.util.Date;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.hoau.hoauapp.business.IMsgService;
import com.hoau.hoauapp.constant.PropertyConstant;
import com.hoau.hoauapp.entity.SmsEntity;
import com.hoau.hoauapp.entity.ValidateCode;
import com.hoau.hoauapp.mapper.VerificationCodeMapper;
import com.hoau.hoauapp.service.IUserInfoService;
import com.hoau.hoauapp.si.newoms.QueryUserResModel;
import com.hoau.hoauapp.util.AppUtil;
import com.hoau.hoauapp.util.SMSNetUtil;
import com.hoau.hoauapp.util.UUIDUtil;
import com.hoau.hoauapp.vo.ValidateCodeVo;

/**
 * @ClassName: SMSservice
 * @Description: TODO(这里用一句话描述这个类的作用)
 * @author xujun jun.xu@hoau.net
 * @date 2015年1月9日 上午9:56:53
 * 
 */
@Service
public class MsgSservice implements IMsgService {
	
	@Resource
	private VerificationCodeMapper verificationCodeMapper;
	@Resource
	private IUserInfoService userInfoService;
	public ValidateCodeVo sendValiCode(String mobile,int apptype) {
		ValidateCodeVo msg = new ValidateCodeVo();
		String msgConteng = null;
		try {
			
			//用户查询
			QueryUserResModel userRes =userInfoService.queryUserInfo(mobile);
			//注册获取验证码时手机号已经注册过的
			if(apptype ==1 && userRes.isResult()){
				msg.setErrcode(AppUtil.EXCEPTION_STATUS_BUSINESS_ERROR);
				msg.setErrmsg("手机号已经注册过");
				return msg;
			}else if(apptype==2 && ! userRes.isResult()){
			 //找回密码时手机号未注册的
				msg.setErrcode(AppUtil.EXCEPTION_STATUS_BUSINESS_ERROR);
				msg.setErrmsg("手机号还未注册");
				return msg;
			}
//			if(apptype ==1 && userRes.getResult().getValue()){
//				msg.setErrcode(AppUtil.EXCEPTION_STATUS_BUSINESS_ERROR);
//				msg.setErrmsg("手机号已经注册过");
//				return msg;
//			}else if(apptype==2 && ! userRes.getResult().getValue()){
//			 //找回密码时手机号未注册的
//				msg.setErrcode(AppUtil.EXCEPTION_STATUS_BUSINESS_ERROR);
//				msg.setErrmsg("手机号还未注册");
//				return msg;
//			}
			
			String valiCode = ValidateCode.genCode();
			String sms_template = PropertyConstant.SMS_TEMPLATE;
			msgConteng = String.format(sms_template, valiCode);
			SmsEntity smsEntity = new SmsEntity();
			smsEntity.setContent(msgConteng);
			smsEntity.setMobile(mobile);
			smsEntity.setSearchID(UUIDUtil.getUUID());
			smsEntity.setSendTime(new Date());
			SMSNetUtil.sendMsg(smsEntity);
			msg.setValidateCode(valiCode);
			msg.setErrcode(AppUtil.EXCEPTION_STATUS_SUCCESS);
			//存储验证码数据
			ValidateCodeVo validateCodeVo = verificationCodeMapper.getValidateCodeByPhone(mobile);
			//如果此号码不存在验证码，则新增
			if(validateCodeVo == null){
				validateCodeVo = new ValidateCodeVo();
				validateCodeVo.setPhone(mobile);
				validateCodeVo.setValidateCode(valiCode);
				verificationCodeMapper.createValidateCode(validateCodeVo);
			//如果此号码存在验证码，则更新
			}else{
				validateCodeVo.setValidateCode(valiCode);
				verificationCodeMapper.modifyValidateCode(validateCodeVo);
			}
			
			
		} catch (Exception e) {
			msg.setErrcode(AppUtil.EXCEPTION_STATUS_SYSTEM_ERROR);
			e.printStackTrace();
		}
		return msg;
	}

}
