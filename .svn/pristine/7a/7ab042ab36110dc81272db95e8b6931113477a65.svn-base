package com.hoau.hoauapp.business.impl;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.hoau.hoauapp.business.IUserService;
import com.hoau.hoauapp.constant.PropertyConstant;
import com.hoau.hoauapp.entity.PushMessageEntity;
import com.hoau.hoauapp.entity.PushMessageIOSEntity;
import com.hoau.hoauapp.entity.User;
import com.hoau.hoauapp.mapper.FeedbackMapper;
import com.hoau.hoauapp.mapper.IntegralMapper;
import com.hoau.hoauapp.mapper.MessageInfoMapper;
import com.hoau.hoauapp.mapper.MobileInfoMapper;
import com.hoau.hoauapp.mapper.UserInfoMapper;
import com.hoau.hoauapp.mapper.VerificationCodeMapper;
import com.hoau.hoauapp.mapper.VersionUpdateMapper;
import com.hoau.hoauapp.service.IUserInfoService;
import com.hoau.hoauapp.service.impl.CouponClippingService;
import com.hoau.hoauapp.si.dc.mq.entity.WaybillStatusEntity;
import com.hoau.hoauapp.util.AppUtil;
import com.hoau.hoauapp.util.AttachmentRootPath;
import com.hoau.hoauapp.util.JsonUtils;
import com.hoau.hoauapp.util.PushUtil;
import com.hoau.hoauapp.util.StringUtil;
import com.hoau.hoauapp.vo.BaseCountVo;
import com.hoau.hoauapp.vo.CouponClippingListVo;
import com.hoau.hoauapp.vo.CouponClippingVo;
import com.hoau.hoauapp.vo.FeedBackVo;
import com.hoau.hoauapp.vo.HeadVo;
import com.hoau.hoauapp.vo.IntegralInfoVo;
import com.hoau.hoauapp.vo.LoginVo;
import com.hoau.hoauapp.vo.MessageInfoListVo;
import com.hoau.hoauapp.vo.MessageInfoVo;
import com.hoau.hoauapp.vo.MessageOtherListVo;
import com.hoau.hoauapp.vo.MessageOtherVo;
import com.hoau.hoauapp.vo.MobileInfoEntryVo;
import com.hoau.hoauapp.vo.MobileInfoVo;
import com.hoau.hoauapp.vo.OrderListVo;
import com.hoau.hoauapp.vo.OrderVo;
import com.hoau.hoauapp.vo.PushAPS;
import com.hoau.hoauapp.vo.PushUserVo;
import com.hoau.hoauapp.vo.RegisterVo;
import com.hoau.hoauapp.vo.ResBaseVo;
import com.hoau.hoauapp.vo.UserCouponClippingListVo;
import com.hoau.hoauapp.vo.UserCouponClippingVo;
import com.hoau.hoauapp.vo.ValidateCodeVo;
import com.hoau.hoauapp.vo.VersionUpdateInfoVo;

@Service
public class UserService implements IUserService {

	@Resource
	private VerificationCodeMapper verificationCodeMapper;
	@Resource
	private UserInfoMapper userInfoMapper;
	@Resource
	private IUserInfoService userInfoService;
	@Resource
	private MobileInfoMapper mobileInfoMapper;
	@Resource
	private MessageInfoMapper messageInfoMapper;
	@Resource
	private VersionUpdateMapper versionUpdateMapper;
	@Resource
	private FeedbackMapper feedbackMapper;
	@Resource
	private IntegralMapper integralMapper;
	@Resource
	private OrderService orderService;
	@Resource
	private CouponClippingService couponClippingService;

	public User findUser(String id) {
		User user = new User();
		user.setId(id);
		user.setUsername("xujun");
		return user;
	}

	/**
	 * 登录验证
	 */
	public User login(LoginVo loginVo) {
		User user = null;
		try {
			// 验证用户名、密码
			String mobile = loginVo.getUsername();
			user = userInfoService.login(loginVo);
			user.setMobile(mobile);

			/*
			 * user = new User(); user.setId("150"); user.setMobile(mobile);
			 * user.setErrcode(AppUtil.EXCEPTION_STATUS_SUCCESS);
			 */

			if (user.getId() != null && !user.getId().equals("")) {
				// 查询用户相关信息
				User userinfo = userInfoMapper.getUserInfo(user.getId());
				// 如果查询到了用户信息
				if (userinfo != null && userinfo.getId() != null) {
					userinfo.setErrcode(AppUtil.EXCEPTION_STATUS_SUCCESS);
					return userinfo;
				} else {
					User u = new User();
					u.setId(user.getId());
					u.setMobile(mobile);
					u.setUsername(mobile);
					userInfoMapper.createUserInfo(u);

				}

			}

		} catch (Exception e) {
			user = new User();
			user.setErrcode(AppUtil.EXCEPTION_STATUS_SYSTEM_ERROR);
		}

		return user;
	}

	/**
	 * 重置密码
	 */
	public User resetpwd(RegisterVo registerVo) {
		User user = new User();
		try {
			// 验证码验证
			if (registerVo != null && registerVo.getValiCode() != null
					&& !registerVo.getValiCode().equals("")
					&& registerVo.getPhoneNum() != null
					&& !registerVo.getPhoneNum().equals("")
					&& registerVo.getPassword() != null
					&& !registerVo.getPassword().equals("")) {
				ValidateCodeVo vc = verificationCodeMapper
						.getValidateCodeByPhone(registerVo.getPhoneNum());
				if (vc == null
						|| vc.getModifyDate() == null
						|| vc.getValidateCode() == null
						|| !vc.getValidateCode().equals(
								registerVo.getValiCode())) {
					user.setErrcode(AppUtil.EXCEPTION_STATUS_BUSINESS_ERROR);
					user.setErrmsg(AppUtil.REQUEST_VALIDATECODE_EXCEPTION);
				} else {
					// 修改密码
					user = userInfoService.resetPwd(registerVo);
					if (user.getId() != null && !user.getId().equals("")) {
						// 查询用户相关信息
						User userinfo = userInfoMapper
								.getUserInfo(user.getId());
						// 如果查询到了用户信息
						if (userinfo != null && userinfo.getId() != null) {
							userinfo.setErrcode(AppUtil.EXCEPTION_STATUS_SUCCESS);
							return userinfo;
						} else {
							user.setMobile(registerVo.getPhoneNum());
							user.setUsername(registerVo.getPhoneNum());
							userInfoMapper.createUserInfo(user);
						}
					}
				}
			} else {
				user = new User();
				user.setErrcode(AppUtil.EXCEPTION_STATUS_BUSINESS_ERROR);
				user.setErrmsg(AppUtil.REQUEST_PARAMETERS_EXCEPTION);
			}
		} catch (Exception e) {
			user = new User();
			user.setErrcode(AppUtil.EXCEPTION_STATUS_SYSTEM_ERROR);
		}
		return user;
	}

	/**
	 * 用户注册
	 */
	public User register(RegisterVo registerVo) {
		User user = new User();
		try {
			// 验证码验证
			if (registerVo != null && registerVo.getValiCode() != null
					&& !registerVo.getValiCode().equals("")
					&& registerVo.getPhoneNum() != null
					&& !registerVo.getPhoneNum().equals("")
					&& registerVo.getPassword() != null
					&& !registerVo.getPassword().equals("")) {
				ValidateCodeVo validateCodeVo = verificationCodeMapper
						.getValidateCodeByPhone(registerVo.getPhoneNum());
				if (validateCodeVo == null
						|| validateCodeVo.getModifyDate() == null
						|| validateCodeVo.getValidateCode() == null
						|| !validateCodeVo.getValidateCode().equals(
								registerVo.getValiCode())) {
					user.setErrcode(AppUtil.EXCEPTION_STATUS_BUSINESS_ERROR);
					user.setErrmsg(AppUtil.REQUEST_VALIDATECODE_EXCEPTION);
					return user;
				}
			} else {
				user = new User();
				user.setErrcode(AppUtil.EXCEPTION_STATUS_BUSINESS_ERROR);
				user.setErrmsg(AppUtil.REQUEST_PARAMETERS_EXCEPTION);
				return user;
			}

			// OMS注册
			user = userInfoService.register(registerVo);

		} catch (Exception e) {
			user = new User();
			user.setErrcode(AppUtil.EXCEPTION_STATUS_SYSTEM_ERROR);
			user.setErrmsg(AppUtil.CALL_INTERFACE_EXCEPTION);
		}

		// OMS注册成功后不管用户信息插入是否成功都不能影响OMS注册成功结果返回
		try {
			// 用户信息添加
			if (AppUtil.EXCEPTION_STATUS_SUCCESS.equals(user.getErrcode())) {
				userInfoMapper.createUserInfo(user);
					//创建优惠券对象，生成优惠券
					UserCouponClippingVo userCC=new UserCouponClippingVo();
					userCC.setUserId(user.getId());
					userCC.setCcId(1);
					userCC.setAmount(10);
					userCC.setIntegral(100);
					// 生成优惠券
					UserCouponClippingVo usercc = couponClippingService.createCCNum(userCC);
					if (usercc != null) {
						userInfoMapper.exchangeCC(userCC);
					}
					user.setErrcode(AppUtil.EXCEPTION_STATUS_SUCCESS);
					user.setErrmsg(AppUtil.REQUEST_REGISTER_SUCCESS);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}

		return user;

	}

	/**
	 * 个人资料修改
	 */
	public User userInfoModify(User userinfo) {
		User user = null;
		try {
			if (userinfo.getId() != null && !"".equals(userinfo.getId().trim())) {
				user = userInfoMapper.getUserInfo(userinfo.getId());
				if (user == null || user.getId() == null
						|| "".equals(user.getId().trim())) {
					userInfoMapper.createUserInfo(userinfo);
				} else {
					userInfoMapper.modifyUserInfo(userinfo);
				}
				userinfo.setErrcode(AppUtil.EXCEPTION_STATUS_SUCCESS);
				return userinfo;
			} else {
				user = new User();
				user.setErrcode(AppUtil.EXCEPTION_STATUS_BUSINESS_ERROR);
				user.setErrmsg("更新失败");
			}

		} catch (Exception e) {
			user = new User();
			user.setErrcode(AppUtil.EXCEPTION_STATUS_SYSTEM_ERROR);
			user.setErrmsg("保存失败");
			e.printStackTrace();
		}

		return user;
	}

	/**
	 * 用户反馈
	 * 
	 * @return
	 */
	public String feedbackInfo() {
		return null;
	}

	/**
	 * 手机信息添加
	 */
	@Transactional
	public User mobileInfo(MobileInfoVo mobilevo) {
		User user = new User();
		if (mobilevo == null) {
			user.setErrcode(AppUtil.EXCEPTION_STATUS_BUSINESS_ERROR);
			user.setErrmsg("参数无效");
		}
		List<MobileInfoVo> moinf = mobileInfoMapper.findMobileInfo(mobilevo);
		if (moinf == null || moinf.size() == 0) {
			mobileInfoMapper.createMobileInfo(mobilevo);
		}
		MobileInfoEntryVo mentryinfo = new MobileInfoEntryVo();
		mentryinfo.setImei(mobilevo.getImei());
		mentryinfo.setImsi(mobilevo.getImsi());
		mobileInfoMapper.createMobileInfoEntry(mentryinfo);

		user.setErrcode(AppUtil.EXCEPTION_STATUS_SUCCESS);
		user.setErrmsg("添加成功");
		return user;
	}

	/**
	 * 用户货物消息添加
	 */
	@Transactional
	public ResBaseVo goodsMsg(WaybillStatusEntity waybill) {
		ResBaseVo rb = new ResBaseVo();
		MessageInfoVo mvo = new MessageInfoVo();
		if (waybill != null && waybill.getShipperMobile() != null
				&& !"".equals(waybill.getShipperMobile().trim())) {
			// 手机号
			mvo.setMobile(waybill.getShipperMobile());
			User userinfo = new User();
			try {
				userinfo.setMobile(waybill.getShipperMobile());
				userinfo = userInfoMapper.findUserInfo(userinfo);
				if (userinfo != null && userinfo.getId() != null) {
					// 用户ID
					mvo.setUserid(userinfo.getId());
				}
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
		if (waybill != null) {
			// 运单状态
			mvo.setStatus(waybill.getWaybillStatus());
			// 运单号
			mvo.setOrdernum(waybill.getWaybillNo());
			// 操作时间
			mvo.setOperationdate(waybill.getOperateDate());
			// 收件人
			mvo.setRecipients(waybill.getConsigneeName());
			// 订单号
			mvo.setOrderid(waybill.getOrderNo());
		}
		try {
			// 添加货物信息
			messageInfoMapper.createMessage(mvo);
			// 发送货物消息
			sendMessge(mvo);
			rb.setErrcode(AppUtil.EXCEPTION_STATUS_SUCCESS);
		} catch (Exception e) {
			rb.setErrcode(AppUtil.EXCEPTION_STATUS_SYSTEM_ERROR);
			rb.setErrmsg("货物信息添加异常");
			e.printStackTrace();
		}

		return rb;
	}

	/**
	 * 推送货物消息
	 * 
	 * @param mvo
	 */
	private void sendMessge(MessageInfoVo mvo) {
		try {
			PushUserVo pushvo = new PushUserVo();
			pushvo.setUserid(mvo.getUserid());
			pushvo.setCancel(0);
			List<PushUserVo> pushlist = messageInfoMapper.findPushUser(pushvo);
			for (PushUserVo ps : pushlist) {
				if (ps.getBaidu_userid() != null
						&& !"".equals(ps.getBaidu_userid().trim())) {
					String operdate ="";
					if(mvo.getOperationdate()!=null){
						SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
						operdate = format.format(mvo.getOperationdate());
					}
					

					String descStr ="您的运单"+mvo.getOrdernum()+ "当前状态为："+mvo.getStatus() +",操作时间："+operdate;

					//判断消息接收状态 
					if(ps.getSendstate()==3){
						continue;
					}else if(ps.getSendstate()==2){
						//当前日期    时
						int nowhour =Calendar.getInstance().get(Calendar.HOUR_OF_DAY);
						//判断当前时是否在接收时间段内
						if(nowhour<ps.getBeginhour() || nowhour >ps.getEndhour()){
							continue;
						}
					}
					//判断是否 ios客户端
					if("IOS".equals(ps.getAppid())){
						PushMessageIOSEntity iospe = new PushMessageIOSEntity();
						iospe.setTitle(PropertyConstant.PUSH_TITLEMSG);
						iospe.setDescription(descStr);
						iospe.setIoskeyid(mvo.getId());//货物消息ID
						iospe.setIoskeyorderNo(mvo.getOrderid());//订单号
						iospe.setIoskeywaybill(mvo.getOrdernum());//运单编号
						iospe.setIoskeyrecipients(mvo.getRecipients());//收货人
						iospe.setIoskeystatus(mvo.getStatus());//货物状态
						iospe.setIoskeyuserid(mvo.getUserid());//用户ID
						PushAPS iosaps = new PushAPS();
						iosaps.setAlert(descStr);
						iosaps.setBadge(ps.getBadge());
						iosaps.setSound(ps.getSound());
						iospe.setAps(iosaps);					
						String msg = JsonUtils.toJson(iospe);
						
						PushUtil.pushUnicastMessage(PropertyConstant.APIKEY_IOS,
								PropertyConstant.SECRETKEY_IOS, 1, msg, ps.getBaidu_userid(),4,PropertyConstant.PUSH_STATE_IOS);
					}else{
						PushMessageEntity pe = new PushMessageEntity();
						
						pe.setTitle(PropertyConstant.PUSH_TITLEMSG);
						pe.setDescription(descStr);
						pe.setCustom_content(mvo);
						pe.setNotification_basic_style(ps.getNotification_basic_style());
						pe.setNotification_builder_id(ps.getNotification_builder_id());
						String msg = JsonUtils.toJson(pe);
						
						PushUtil.pushUnicastMessage(PropertyConstant.APIKEY_ANDROID,
								PropertyConstant.SECRETKEY_ANDROID, 1, msg, ps.getBaidu_userid(),3,0);
					}
					
				}

			}

		} catch (Exception e) {
			e.printStackTrace();
		}

	}

	/**
	 * 根据用户ID获取货物消息
	 */
	public MessageInfoListVo findGoodsMsg(MessageInfoVo msgvo) {
		MessageInfoListVo msglistvo = new MessageInfoListVo();
		List<MessageInfoVo> msglist = messageInfoMapper.findMessageInfo(msgvo);
		msglistvo.setMsglist(msglist);
		msglistvo.setErrcode(AppUtil.EXCEPTION_STATUS_SUCCESS);

		return msglistvo;
	}

	/**
	 * 根据用户ID获取用户其他消息
	 */
	public MessageOtherListVo findOtherMsg(MessageOtherVo msgothervo) {
		MessageOtherListVo msglistvo = new MessageOtherListVo();
		List<MessageOtherVo> msglist = messageInfoMapper
				.findMessageOther(msgothervo);
		msglistvo.setMsgotherlist(msglist);
		msglistvo.setErrcode(AppUtil.EXCEPTION_STATUS_SUCCESS);

		return msglistvo;
	}

	/**
	 * 修改货物消息已读
	 */
	public MessageInfoVo modilyGoodsMsg(MessageInfoVo msgvo) {
		if (msgvo != null) {
			messageInfoMapper.modifyGoodsMsgRead(msgvo);
			msgvo.setErrcode(AppUtil.EXCEPTION_STATUS_SUCCESS);
		} else {
			msgvo = new MessageInfoVo();
			msgvo.setErrcode(AppUtil.EXCEPTION_STATUS_BUSINESS_ERROR);
			msgvo.setErrmsg("消息为空");
		}

		return msgvo;
	}

	/**
	 * 修改其他消息已读
	 */
	public MessageOtherVo modilyOtherMsg(MessageOtherVo msgothervo) {
		if (msgothervo != null) {
			messageInfoMapper.modifyOherMsgRead(msgothervo);
			msgothervo.setErrcode(AppUtil.EXCEPTION_STATUS_SUCCESS);
		} else {
			msgothervo = new MessageOtherVo();
			msgothervo.setErrcode(AppUtil.EXCEPTION_STATUS_BUSINESS_ERROR);
			msgothervo.setErrmsg("消息为空");
		}

		return msgothervo;
	}

	/**
	 * 用户登录百度推送信息处理
	 * 
	 * @param pushuservo
	 */
	public PushUserVo pushUserLogin(PushUserVo pushuservo) {
		if (pushuservo == null || pushuservo.getUserid()==null || "".equals(pushuservo.getUserid())) {
			pushuservo = new PushUserVo();
			pushuservo.setErrcode(AppUtil.EXCEPTION_STATUS_BUSINESS_ERROR);
			pushuservo.setErrmsg("参数信息无效");
			return pushuservo;
		}
		
		PushUserVo pvo = new PushUserVo();
		pvo.setBaidu_userid(pushuservo.getBaidu_userid());
		pvo.setCancel(3);
		List<PushUserVo> pushlist = messageInfoMapper.findPushUser(pvo);
		boolean intert =true;
		for(int i=0;i<pushlist.size();i++){
			PushUserVo pv = pushlist.get(i);
			//比较是否为当前用户ID绑定信息
			if(pv !=null && pushuservo.getUserid().equals(pv.getUserid())){
				intert = false;
				//是否已注销绑定
				if(pv.getCancel() !=0){
					pv.setCancel(0);
					messageInfoMapper.modifyPushUser(pv);
				}
			}else{
				//是否其他用户已经绑定推送消息且没有注销
				if(pv.getCancel() ==0){
					pv.setCancel(1);
					messageInfoMapper.modifyPushUser(pv);
				}
			}
		}
		//如果没有绑定过推送消息则新增
		if(intert && pushuservo.getBaidu_userid()!=null && !"".equals(pushuservo.getBaidu_userid())){
			messageInfoMapper.createPushUser(pushuservo);
		}
		
		pushuservo.setErrcode(AppUtil.EXCEPTION_STATUS_SUCCESS);
		return pushuservo;
	}

	/**
	 * 注销百度推送用户信息绑定
	 */
	public PushUserVo pushUserLogout(PushUserVo pushuservo) {
		if (pushuservo == null || pushuservo.getUserid() == null
				|| pushuservo.getBaidu_userid() == null) {
			pushuservo = new PushUserVo();
			pushuservo.setErrcode(AppUtil.EXCEPTION_STATUS_BUSINESS_ERROR);
			pushuservo.setErrmsg("参数信息无效");
			return pushuservo;
		}
		pushuservo.setCancel(0);
		List<PushUserVo> pushlist = messageInfoMapper.findPushUser(pushuservo);
		// 是否已有推送信息，且为未注销状态
		if (pushlist != null && pushlist.size() > 0) {
			pushuservo = pushlist.get(0);
			// 为注销状态需修改为 注销状态 1
			if (pushuservo.getCancel() == 0) {
				pushuservo.setCancel(1);
				messageInfoMapper.modifyPushUser(pushuservo);
			}
		}
		pushuservo.setErrcode(AppUtil.EXCEPTION_STATUS_SUCCESS);
		return pushuservo;
	}

	/**
	 * 获取APP版本信息
	 */
	public VersionUpdateInfoVo getVersionInfo(VersionUpdateInfoVo vo) {
		VersionUpdateInfoVo versionUpdateInfoVo = versionUpdateMapper
				.getVersionInfo(vo);
		if (versionUpdateInfoVo == null) {
			versionUpdateInfoVo = new VersionUpdateInfoVo();
		}
		versionUpdateInfoVo.setErrcode(AppUtil.EXCEPTION_STATUS_SUCCESS);
		return versionUpdateInfoVo;
	}

	/**
	 * 反馈信息
	 * 
	 * @param feedBackVo
	 * @return
	 */
	public FeedBackVo feedbackInfo(FeedBackVo feedBackVo) {
		FeedBackVo result = new FeedBackVo();
		feedbackMapper.userFeedBack(feedBackVo);
		result.setErrcode(AppUtil.EXCEPTION_STATUS_SUCCESS);
		return result;
	}

	/**
	 * 增加用户积分
	 */
	@Transactional
	public IntegralInfoVo addIntegral(IntegralInfoVo integralInfoVo) {
		try {
			if(integralInfoVo.getType() != null && !integralInfoVo.getType().equals("")){
				//查询对应的积分值
				int num = integralMapper.queryIntegral(Integer.parseInt(integralInfoVo.getType()));
				integralInfoVo.setIntegral(num);
				// 如果是签到
				if (integralInfoVo.getType().equals(AppUtil.USER_INTEGRAL_SIGNIN)) {
					int count = integralMapper.getSignedLists(integralInfoVo);
					if (count > 0) {
						integralInfoVo
						.setErrcode(AppUtil.EXCEPTION_STATUS_BUSINESS_ERROR);
						integralInfoVo.setErrmsg("您今天已经签到");
					} else {
						//在新增积分表之前，查该用户昨天有没有签到
						
						//获取昨天的年月日
						Calendar cal=Calendar.getInstance();
						cal.add(Calendar.DATE,-1);
						String yesterday=new SimpleDateFormat( "yyyy-MM-dd").format(cal.getTime());
						//封装参数，查询前一天该用户是否签到
						Map<String, Object> params = new HashMap<String, Object>();
						params.put("userId", integralInfoVo.getUserId());
						params.put("createDate",yesterday);
						IntegralInfoVo integralInfoVo1=integralMapper.findIntegral(params); 
						//如果该用户昨天签到取出他昨天的days值，加1并赋值给当前要保存的对象；如果昨天没签到，将要新增的对象days值设为1
						if(integralInfoVo1 !=null){
							int day=integralInfoVo1.getDays();
							integralInfoVo.setDays(day+1);
						}else {
							integralInfoVo.setDays(1);
						}
						// 用户积分表增加明细记录
						integralMapper.addIntegral(integralInfoVo);
						//修改用户积分表总数之前，判断该用户有没有连续签到；如果连续10天签到送10积分，如果连续20天签到送20积分，如果连续30天签到送30积分；
						if(integralInfoVo.getDays()==10){
							integralInfoVo.setType(AppUtil.USER_INTEGRAL_SIGNINDAYS);
							integralInfoVo.setIntegral(10);
							integralInfoVo.setDesc("连续签到10天，赠送10积分");
							// 用户积分表增加明细记录
							integralMapper.addIntegral(integralInfoVo);
							integralInfoVo.setIntegral(integralInfoVo.getIntegral()+num);
						}
						if(integralInfoVo.getDays()==20){
							integralInfoVo.setType(AppUtil.USER_INTEGRAL_SIGNINDAYS);
							integralInfoVo.setIntegral(20);
							integralInfoVo.setDesc("连续签到20天，赠送20积分");
							// 用户积分表增加明细记录
							integralMapper.addIntegral(integralInfoVo);
							integralInfoVo.setIntegral(integralInfoVo.getIntegral()+num);
						}
						if(integralInfoVo.getDays()==30){
							integralInfoVo.setType(AppUtil.USER_INTEGRAL_SIGNINDAYS);
							integralInfoVo.setIntegral(30);
							integralInfoVo.setDesc("连续签到30天，赠送30积分");
							// 用户积分表增加明细记录
							integralMapper.addIntegral(integralInfoVo);
							integralInfoVo.setIntegral(integralInfoVo.getIntegral()+num);
						}
						// 修改用户积分表总分数
						userInfoMapper.updateUserIntegral(integralInfoVo);
						integralInfoVo.setErrcode(AppUtil.EXCEPTION_STATUS_SUCCESS);
					}
				} else {
					// 用户积分表增加明细记录
					integralMapper.addIntegral(integralInfoVo);
					// 修改用户积分表总分数
					userInfoMapper.updateUserIntegral(integralInfoVo);
					integralInfoVo.setErrcode(AppUtil.EXCEPTION_STATUS_SUCCESS);
				}
			}else{
				integralInfoVo
				.setErrcode(AppUtil.EXCEPTION_STATUS_BUSINESS_ERROR);
				integralInfoVo.setErrmsg("积分类型为空");
			}
		} catch (Exception e) {
			// 返回异常信息
			integralInfoVo.setErrcode(AppUtil.EXCEPTION_STATUS_SYSTEM_ERROR);
		}
		return integralInfoVo;
	}

	/**
	 * 根据用户ID未读货物消息总数
	 */
	public ResBaseVo getMessageCount(User user) {
		BaseCountVo bcv = new BaseCountVo();
		bcv.setErrcode(AppUtil.EXCEPTION_STATUS_SUCCESS);
		// 待评价订单数据查询
		try {
			OrderListVo orderlist = orderService.queryOrder(user.getId());
			if (AppUtil.EXCEPTION_STATUS_SUCCESS.equals(orderlist.getErrcode())) {
				ArrayList<OrderVo> list = orderlist.getList();
				long tal = 0;
				for (OrderVo o : list) {
					// 总评分为空则为未评价的订单
					if ( "DELIVER".equals(o.getOrderStatus()) && (o.getEvaluate() == null || "".equals(o.getEvaluate())) ) {
						tal++;
					}
				}
				bcv.setOrderTotal(tal);
			} else {
				bcv.setOrderTotal(0);
			}
		} catch (Exception e) {
			bcv.setOrderTotal(0);
			e.printStackTrace();
		} catch (Error e) {
			bcv.setOrderTotal(0);
			e.printStackTrace();
		}
		// 信息总数查询
		try {

			if (user != null && user.getId() != null
					&& !"".equals(user.getId().trim())) {
				bcv.setMsgTotal(messageInfoMapper.getMessageCount(user));
			} else {
				bcv.setMsgTotal(0);
			}
		} catch (Exception e) {
			bcv.setMsgTotal(0);
			e.printStackTrace();
		}
		// 积分查询
		try {
			User userinfo = userInfoMapper.findUserInfo(user);
			if (userinfo != null) {
				bcv.setScoreTotal(userinfo.getUserIntegral());
			}
		} catch (Exception e) {
			bcv.setScoreTotal(0);
			e.printStackTrace();
		}
		// 优惠券
		try {
			int count = userInfoMapper.getUnUseCCCount(user);
			bcv.setCouponTotal(count);
		} catch (Exception e) {
			bcv.setCouponTotal(0);
			e.printStackTrace();
		}
		return bcv;
	}

	/**
	 * 获取头像信息
	 * 
	 * @Title: uploadHead
	 * @return HeadVo 返回类型
	 * @throws
	 */
	public HeadVo getUploadHead(HeadVo headVo) {
		try {
			if(headVo != null && headVo.getUserId() != null){
				// 文件上传根目录
				String rootPath = AttachmentRootPath.getAttachRootPath() + "/" + headVo.getUserId();
				File dir = new File(rootPath);
				if(dir.exists()  && dir.isDirectory()){
					File[] files = dir.listFiles();
					// 判断是否图片
					for(int i=0; i<files.length; i++)
					{
						if(files[i].getName().startsWith(AttachmentRootPath.cacheFilePrefix)){
							VersionUpdateInfoVo vo = new VersionUpdateInfoVo();
							vo.setApptype(1);
							//查询全局的图片路径
							VersionUpdateInfoVo versionUpdateInfoVo = versionUpdateMapper
									.getVersionInfo(vo);
							if (versionUpdateInfoVo != null) {
								headVo.setFileUrl(versionUpdateInfoVo.getUserHeadUrl() + "/" + headVo.getUserId() + "/");
							}
							headVo.setImgName(files[0].getName());
							break;
						}
					}
				}
				headVo.setErrcode(AppUtil.EXCEPTION_STATUS_SUCCESS);
			}else{
				headVo.setErrcode(AppUtil.EXCEPTION_STATUS_BUSINESS_ERROR);
			}
		} catch (Exception e) {
			// 返回异常信息
			headVo.setErrcode(AppUtil.EXCEPTION_STATUS_SYSTEM_ERROR);
		}
		return headVo;
	}
	
	/**
	 * 查找优惠券信息
	 * @Title: getCouponClipping 
	 * @return     ResBaseVo
	 * @throws
	 */
	public ResBaseVo getCouponClipping(User user){
		CouponClippingListVo couponClippingListVo = new CouponClippingListVo();
		try {
			//查找优惠券信息
			List<CouponClippingVo> couponClippingVoList = userInfoMapper.queryCouponClipping();
			if(couponClippingVoList != null){
				couponClippingListVo.setCouponClippingVoList(couponClippingVoList);
			}else{
				couponClippingListVo.setCouponClippingVoList(new ArrayList<CouponClippingVo>());
			}
			//统计用户积分
			User userinfo = userInfoMapper.findUserInfo(user);
			couponClippingListVo.setUser(userinfo);
			couponClippingListVo.setErrcode(AppUtil.EXCEPTION_STATUS_SUCCESS);
		} catch (Exception e) {
			// 返回异常信息
			couponClippingListVo.setErrcode(AppUtil.EXCEPTION_STATUS_SYSTEM_ERROR);
		}
		return couponClippingListVo;
	}
	
	/**
	 * 
	 * @Title: exchangeCC 
	 * @param userCC
	 * @return ResBaseVo
	 * @throws
	 */
	public ResBaseVo exchangeCC(UserCouponClippingVo userCC){
		try {
			//获取用户积分
			User user = new User();
			user.setId(userCC.getUserId());
			User userinfo = userInfoMapper.findUserInfo(user);
			int integral = userinfo.getUserIntegral();
			//查询活动积分
			CouponClippingVo ccInfo = userInfoMapper.queryCouponClippingById(userCC.getCcId());
			if(ccInfo != null){
				//活动积分赋值到本次兑换积分字段
				userCC.setIntegral(ccInfo.getIntegral());
				userCC.setAmount(ccInfo.getAmount());
				//判断用户积分是否足够
				if(integral >= userCC.getIntegral()){
					//生成优惠券
					UserCouponClippingVo usercc = couponClippingService.createCCNum(userCC);
					if(usercc != null){
						userInfoMapper.exchangeCC(userCC);
						// 修改用户积分表总分数
						IntegralInfoVo integralInfoVo = new IntegralInfoVo();
						integralInfoVo.setUserId(userCC.getUserId());
						integralInfoVo.setIntegral(userCC.getIntegral() * -1);
						userInfoMapper.updateUserIntegral(integralInfoVo);
						userCC.setErrcode(AppUtil.EXCEPTION_STATUS_SUCCESS);
					}else{
						// 返回异常信息
						userCC.setErrcode(AppUtil.EXCEPTION_STATUS_BUSINESS_ERROR);
						userCC.setErrmsg("生成优惠券异常");
					}
				}else{
					userCC.setErrcode(AppUtil.EXCEPTION_STATUS_BUSINESS_ERROR);
					userCC.setErrmsg("您的积分不足");
				}
			}
		} catch (Exception e) {
			// 返回异常信息
			userCC.setErrcode(AppUtil.EXCEPTION_STATUS_SYSTEM_ERROR);
		}
		return userCC;
	}
	
	/**
	 * 
	 * @Title: getCCInfo 
	 * @Description: 查询用户兑换优惠券信息
	 * @param @param user
	 * @throws
	 */
	public ResBaseVo getCCInfo(User user){
		UserCouponClippingListVo UserCouponClippingListVo = new UserCouponClippingListVo();
		try {
			List<UserCouponClippingVo> userCouponClippingVoList = userInfoMapper.getCCInfo(user);
			if(userCouponClippingVoList != null){
				UserCouponClippingListVo.setUserCouponClippingVoList(userCouponClippingVoList);
			}else{
				UserCouponClippingListVo.setUserCouponClippingVoList(new ArrayList<UserCouponClippingVo>());
			}
			UserCouponClippingListVo.setErrcode(AppUtil.EXCEPTION_STATUS_SUCCESS);
		} catch (Exception e) {
			// 返回异常信息
			UserCouponClippingListVo.setErrcode(AppUtil.EXCEPTION_STATUS_SYSTEM_ERROR);
		}
		return UserCouponClippingListVo;
	}
	
	/**
	 * 
	 * @Title: getUnUserCCInfo 
	 * @Description: 查询用户兑换的未使用未过期优惠券信息
	 * @param @param user
	 * @throws
	 */
	public ResBaseVo getUnUserCCInfo(User user){
		UserCouponClippingListVo UserCouponClippingListVo = new UserCouponClippingListVo();
		try {
			List<UserCouponClippingVo> userCouponClippingVoList = userInfoMapper.getUnUserCCInfo(user);
			if(userCouponClippingVoList != null){
				UserCouponClippingListVo.setUserCouponClippingVoList(userCouponClippingVoList);
			}else{
				UserCouponClippingListVo.setUserCouponClippingVoList(new ArrayList<UserCouponClippingVo>());
			}
			UserCouponClippingListVo.setErrcode(AppUtil.EXCEPTION_STATUS_SUCCESS);
		} catch (Exception e) {
			// 返回异常信息
			UserCouponClippingListVo.setErrcode(AppUtil.EXCEPTION_STATUS_SYSTEM_ERROR);
		}
		return UserCouponClippingListVo;
	}
	
	/**
	 * 用户头像图片上传
	 */
	public HeadVo headUpload(HeadVo headVo){
		try {
			if(headVo != null && headVo.getUserId() != null && !headVo.getUserId().equals("") 
					&& headVo.getImgName() != null && !headVo.getImgName().equals("")
					&& headVo.getImgContent() != null && headVo.getImgContent().length > 0
					){
				if(headVo.getImgName().indexOf("/") != 0){
					headVo.setImgName("/" + headVo.getImgName());
				}
				//文件上传
				fileUpload(headVo);
				headVo.setErrcode(AppUtil.EXCEPTION_STATUS_SUCCESS);
			}else{
				headVo.setErrcode(AppUtil.EXCEPTION_STATUS_BUSINESS_ERROR);
				headVo.setErrmsg(AppUtil.REQUEST_PARAMETERS_EXCEPTION);
			}
		} catch (Exception e) {
			// 返回异常信息
			headVo.setErrcode(AppUtil.EXCEPTION_STATUS_SYSTEM_ERROR);
		}
		return headVo;
	}
	
	/**
	 * 文件上传
	 * 
	 * @Title: fileUpload
	 * @throws
	 */
	private void fileUpload(HeadVo headVo) {
		OutputStream os = null;
		try {
			// 此用户头像上传根目录
			String rootPath = AttachmentRootPath.getAttachRootPath() + "/" + headVo.getUserId();
			String xdfilePath = headVo.getImgName();
			String newAttachPath = rootPath + xdfilePath;
			// 判断用户目录是否存在，没有则创建
			File fileDirectory = new File(rootPath);
			if  (!fileDirectory.exists()  && !fileDirectory.isDirectory())      
			{       
				// 创建目录
				fileDirectory.mkdir();    
			} else 
			{
				// 删除老文件
				File[] listFile = fileDirectory.listFiles();
				for(int i=0; i<listFile.length; i++){
					listFile[i].delete();
				}
			}
			// 获取前台传输文件流并写入后台文件
			os = new FileOutputStream(new File(newAttachPath));
			os.write(headVo.getImgContent());
		} catch (Exception e) {
			e.printStackTrace();
		} finally{
			if(os != null){
				try {
					os.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
		}
	}
	/**
	 * 
	 * 方法体说明：修改消息声音状态
	 * 作者：wangmingzhao
	 * 日期：2015-5-7 下午5:11:51
	 * 
	 * @param pushvo
	 * @return
	 */
	public ResBaseVo modifyPushSound(PushUserVo pushvo) {
		ResBaseVo bv = new ResBaseVo();
		if(pushvo ==null || StringUtil.isEmpty(pushvo.getUserid()) || StringUtil.isEmpty(pushvo.getBaidu_userid()) ){
			bv.setErrcode(AppUtil.EXCEPTION_STATUS_BUSINESS_ERROR);
			bv.setErrmsg("参数信息不完整！");
			return bv;
		}
		if("IOS".equals(pushvo.getAppid())){
			pushvo.setNotification_basic_style(7);
			if(!"msg.wav".equals(pushvo.getSound())){
				pushvo.setSound("");
			}
		}else if ("ANDROID".equals(pushvo.getAppid())){
			pushvo.setSound("msg.wav");
			
			// 5：响铃 3:振动   1:无声音无振动  7:响铃加振动
			if(1>pushvo.getNotification_basic_style() || 7<pushvo.getNotification_basic_style()){
				pushvo.setNotification_basic_style(7);
			}
			
		}else{
			bv.setErrcode(AppUtil.EXCEPTION_STATUS_BUSINESS_ERROR);
			bv.setErrmsg("客户端应用标识错误！");
			return bv;
		}
		try {
			messageInfoMapper.modifyPushSound(pushvo);
			bv.setErrcode(AppUtil.EXCEPTION_STATUS_SUCCESS);
			bv.setErrmsg("修改成功");
		} catch (Exception e) {
			e.printStackTrace();
			bv.setErrcode(AppUtil.EXCEPTION_STATUS_BUSINESS_ERROR);
			bv.setErrmsg("数据修改异常");
		}

		return bv;
	}
	/**
	 * 
	 * 方法体说明：修改接收消息状态
	 * 作者：wangmingzhao
	 * 日期：2015-5-7 下午5:12:04
	 * 
	 * @param pushvo
	 * @return
	 */
	public ResBaseVo modifyPushSendState(PushUserVo pushvo) {
		ResBaseVo bv = new ResBaseVo();
		
		if(pushvo ==null || StringUtil.isEmpty(pushvo.getUserid()) || StringUtil.isEmpty(pushvo.getBaidu_userid()) ){
			bv.setErrcode(AppUtil.EXCEPTION_STATUS_BUSINESS_ERROR);
			bv.setErrmsg("参数信息不完整！");
			return bv;
		}
		//消息接收控制状态  1:全天接收 2:时间段接收 3:不接收
		if(pushvo.getSendstate()<1 || pushvo.getSendstate()>3){
			bv.setErrcode(AppUtil.EXCEPTION_STATUS_BUSINESS_ERROR);
			bv.setErrmsg("接收状态参数错误！");
			return bv;
		}
		// 2:按时间段发送
		if(pushvo.getSendstate()!=2){
			pushvo.setBeginhour(0);
			pushvo.setEndhour(24);
		}
				
		try {
			messageInfoMapper.modifyPushSendState(pushvo);
			bv.setErrcode(AppUtil.EXCEPTION_STATUS_SUCCESS);
			bv.setErrmsg("修改成功");
		} catch (Exception e) {
			e.printStackTrace();
			bv.setErrcode(AppUtil.EXCEPTION_STATUS_BUSINESS_ERROR);
			bv.setErrmsg("数据修改异常");
		}
		
		
		return bv;
		
	}

	/**
	 * 
	 * 方法体说明： 根据用户id和百度用户id 查询绑定消息
	 * 
	 * 作者：wangmingzhao
	 * 日期：2015-5-8 下午1:48:33
	 * 
	 * @param userid
	 * @param baiduuserid
	 * @return
	 */
	public PushUserVo findPushState(String userid, String baiduuserid) {
		PushUserVo pv = new PushUserVo();
		if(StringUtil.isEmpty(userid) || StringUtil.isEmpty(baiduuserid)){
			pv.setErrcode(AppUtil.EXCEPTION_STATUS_BUSINESS_ERROR);
			pv.setErrmsg("查询参数信息错误");
			return pv;
		}
		pv.setUserid(userid);
		pv.setBaidu_userid(baiduuserid);
		pv.setCancel(3);
		try {
			List<PushUserVo> listvo =messageInfoMapper.findPushUser(pv);
			if(listvo.size()>0){
				PushUserVo pushvo =listvo.get(0);
				pushvo.setErrcode(AppUtil.EXCEPTION_STATUS_SUCCESS);
				return pushvo;
			}else{
				pv.setErrcode(AppUtil.EXCEPTION_STATUS_BUSINESS_ERROR);
				pv.setErrmsg("查询无结果");
			}
		} catch (Exception e) {
			pv.setErrcode(AppUtil.EXCEPTION_STATUS_BUSINESS_ERROR);
			pv.setErrmsg("查询异常");
		}
		return pv;
	}

	
	
}
