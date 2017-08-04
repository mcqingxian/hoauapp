package com.hoau.hoauapp.service.impl;

import org.springframework.stereotype.Service;

import com.hoau.hoauapp.entity.User;
import com.hoau.hoauapp.service.IUserInfoService;
import com.hoau.hoauapp.si.newoms.QueryUserResModel;
import com.hoau.hoauapp.si.newoms.ResetPwdReqModel;
import com.hoau.hoauapp.si.newoms.ResetPwdResModel;
import com.hoau.hoauapp.si.oms.LoginUserReqModel;
import com.hoau.hoauapp.si.oms.LoginUserResModel;
import com.hoau.hoauapp.si.oms.RegisterUserReqModel;
import com.hoau.hoauapp.si.oms.RegisterUserResModel;
import com.hoau.hoauapp.util.AppUtil;
import com.hoau.hoauapp.vo.LoginVo;
import com.hoau.hoauapp.vo.RegisterVo;

@SuppressWarnings("restriction")
@Service
public class UserInfoService implements IUserInfoService {

	public User login(LoginVo loginVo) {
		LoginUserReqModel LoginUserReqModel = objectFactory.createLoginUserReqModel();
		LoginUserReqModel.setLoginName(loginVo.getUsername());
		LoginUserReqModel.setPassword(loginVo.getPassword());
		LoginUserResModel loginUserResModel = portType.loginByPhone(LoginUserReqModel);
		User user = new User();
		if (loginUserResModel != null && loginUserResModel.isResult()) {
			user.setId(loginUserResModel.getUserId());
			user.setErrcode(AppUtil.EXCEPTION_STATUS_SUCCESS);
		} else {
			user.setErrmsg(loginUserResModel.getResultInfo());
			user.setErrcode(AppUtil.EXCEPTION_STATUS_BUSINESS_ERROR);
		}
//		LoginUserReqModel LoginUserReqModel = new LoginUserReqModel();
//		LoginUserReqModel.setLoginName(objectFactory
//				.createLoginUserReqModelLoginName(loginVo.getUsername()));
//		LoginUserReqModel.setPassword(objectFactory
//				.createLoginUserReqModelPassword(loginVo.getPassword()));
//		LoginUserResModel loginUserResModel = portType
//				.loginByPhone(LoginUserReqModel);
//		User user = new User();
//		if (loginUserResModel != null
//				&& loginUserResModel.getResult().getValue()) {
//			user.setId(loginUserResModel.getUserId().getValue());
//			user.setErrcode(AppUtil.EXCEPTION_STATUS_SUCCESS);
//		} else {
//			user.setErrmsg(loginUserResModel.getResultInfo().getValue());
//			user.setErrcode(AppUtil.EXCEPTION_STATUS_BUSINESS_ERROR);
//		}
		return user;
	}

	public User register(RegisterVo registerVo) {
		User registuser = new User();
		try {

			RegisterUserReqModel registerUserReqModel = objectFactory.createRegisterUserReqModel();
			registerUserReqModel.setMobile(registerVo.getPhoneNum());
			registerUserReqModel.setPassword(registerVo.getPassword());
			RegisterUserResModel registerUserResModel = portType.registerUser(registerUserReqModel);
			
//			RegisterUserReqModel registerUserReqModel = new RegisterUserReqModel();
//			registerUserReqModel.setMobile(objectFactory
//							.createRegisterUserReqModelMobile(registerVo
//									.getPhoneNum()));
//			registerUserReqModel.setPassword(objectFactory
//					.createRegisterUserReqModelPassword(registerVo
//							.getPassword()));
//			RegisterUserResModel registerUserResModel = portType
//					.registerUser(registerUserReqModel);
			// System.out.println("---------------->>>>>>>>>>>>>" +
			// registerUserResModel.getUserId().getValue());
			// System.out.println("---------------->>>>>>>>>>>>>" +
			// registerUserResModel.getResult().getValue());
			// System.out.println("---------------->>>>>>>>>>>>>" +
			// registerUserResModel.getResultCode().getValue());
			// System.out.println("---------------->>>>>>>>>>>>>" +
			// registerUserResModel.getResultInfo().getValue());

			// 注册是否成功
			if (registerUserResModel.isResult()) {
				registuser.setId(registerUserResModel.getUserId());// 用户ID
				registuser.setMobile(registerVo.getPhoneNum()); //注册手机
				registuser.setUsername(registerVo.getPhoneNum());//用户名
				registuser.setErrcode(AppUtil.EXCEPTION_STATUS_SUCCESS);
				registuser.setErrmsg(registerUserResModel.getResultInfo());
			} else {
				registuser.setErrcode(AppUtil.EXCEPTION_STATUS_BUSINESS_ERROR);
				registuser.setErrmsg(registerUserResModel.getResultInfo());
			}
//			if (registerUserResModel.getResult().getValue()) {
//				registuser.setId(registerUserResModel.getUserId().getValue());// 用户ID
//				registuser.setMobile(registerVo.getPhoneNum()); //注册手机
//				registuser.setUsername(registerVo.getPhoneNum());//用户名
//				registuser.setErrcode(AppUtil.EXCEPTION_STATUS_SUCCESS);
//				registuser.setErrmsg(registerUserResModel.getResultInfo()
//						.getValue());
//			} else {
//				registuser.setErrcode(AppUtil.EXCEPTION_STATUS_BUSINESS_ERROR);
//				registuser.setErrmsg(registerUserResModel.getResultInfo()
//						.getValue());
//			}

		} catch (Exception e) {
			registuser.setErrcode(AppUtil.EXCEPTION_STATUS_SYSTEM_ERROR);
			registuser.setErrmsg("用户注册失败");
			e.printStackTrace();
		}

		return registuser;
	}

	public User resetPwd(RegisterVo registerVo) {
		ResetPwdReqModel resetPwdReqModel = nomsObjectFactory.createResetPwdReqModel();
		resetPwdReqModel.setMobile(registerVo.getPhoneNum());
		resetPwdReqModel.setPassword(registerVo.getPassword());
		
//		ResetPwdReqModel resetPwdReqModel = new ResetPwdReqModel();
//		resetPwdReqModel.setMobile(nomsObjectFactory
//				.createResetPwdReqModelMobile(registerVo.getPhoneNum()));
//		resetPwdReqModel.setPassword(nomsObjectFactory
//				.createResetPwdReqModelPassword(registerVo.getPassword()));
		ResetPwdResModel resetPwdResModel = nomsPortType.resetPwd(resetPwdReqModel);
		
		
		User user = new User();
		if (resetPwdResModel != null
				&& resetPwdResModel.isResult()) {
			user.setId("" + resetPwdResModel.getUserId());
			user.setErrcode(AppUtil.EXCEPTION_STATUS_SUCCESS);
		} else {
			user.setErrmsg(resetPwdResModel.getResultInfo());
			user.setErrcode(AppUtil.EXCEPTION_STATUS_BUSINESS_ERROR);
		}
//		if (resetPwdResModel != null
//				&& resetPwdResModel.getResult().getValue()) {
//			user.setId("" + resetPwdResModel.getUserId().getValue());
//			user.setErrcode(AppUtil.EXCEPTION_STATUS_SUCCESS);
//		} else {
//			user.setErrmsg(resetPwdResModel.getResultInfo().getValue());
//			user.setErrcode(AppUtil.EXCEPTION_STATUS_BUSINESS_ERROR);
//		}
		System.out.println("---------------->>>>>>>>>>>>>"
				+ resetPwdResModel.isResult());
		System.out.println("---------------->>>>>>>>>>>>>"
				+ resetPwdResModel.getResultCode());
		System.out.println("---------------->>>>>>>>>>>>>"
				+ resetPwdResModel.getResultInfo());
		return user;
	}

	public QueryUserResModel queryUserInfo(String phone) {
		
		QueryUserResModel userRes =nomsPortType.queryUserInfo(phone);
//		System.out.println("----->>>>>>"+ phone);
//		System.out.println("----->>>>>>"+ userRes.getResult().getValue());
//		System.out.println("----->>>>>>"+ userRes.getResultCode().getValue());
//		System.out.println("----->>>>>>"+ userRes.getResultInfo().getValue());
//		System.out.println("----->>>>>>"+ userRes.getUserId().getValue());

		return userRes;
	}

}
