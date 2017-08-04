package com.hoau.hoauapp.facade;

import java.security.SignatureException;

import javax.annotation.Resource;
import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;

import org.springframework.stereotype.Service;

import com.hoau.hoauapp.business.IMsgService;
import com.hoau.hoauapp.business.IUserService;
import com.hoau.hoauapp.common.Signature;
import com.hoau.hoauapp.constant.HttpConstant;
import com.hoau.hoauapp.entity.User;
import com.hoau.hoauapp.util.AppUtil;
import com.hoau.hoauapp.vo.FeedBackVo;
import com.hoau.hoauapp.vo.HeadVo;
import com.hoau.hoauapp.vo.IntegralInfoVo;
import com.hoau.hoauapp.vo.LoginVo;
import com.hoau.hoauapp.vo.MessageInfoVo;
import com.hoau.hoauapp.vo.MessageOtherVo;
import com.hoau.hoauapp.vo.MobileInfoVo;
import com.hoau.hoauapp.vo.PushUserVo;
import com.hoau.hoauapp.vo.RegisterVo;
import com.hoau.hoauapp.vo.ResBaseVo;
import com.hoau.hoauapp.vo.UserCouponClippingVo;
import com.hoau.hoauapp.vo.ValidateCodeVo;
import com.hoau.hoauapp.vo.VersionUpdateInfoVo;

/** 
* @ClassName: UserFacade 
* @Description: 用户服务
* @author xujun jun.xu@hoau.net
* @date 2015年1月12日 下午3:12:38 
*  
*/
@Service
@Path("/users")
@Consumes(HttpConstant.DATATYPE)
@Produces(HttpConstant.DATATYPE)
public class UserFacade {
	
	@Resource
	private IUserService userService;
	
	@Resource
	private IMsgService msgService;
	
	@GET
	@Path("valicode/{phoneNum}/{appType}")
	public ResBaseVo sendValicode(@PathParam("phoneNum")String phoneNum ,@PathParam("appType")int appType) {
		//System.out.println("=====type:"+appType+" :"+phoneNum);
		return msgService.sendValiCode(phoneNum ,appType);
	}
	
	/*
	 * added by liji 2016-01-08
	 * start
	 */
	@GET
	@Path("valicode/{phoneNum}/{appType}/{time}/{key}")
	public ResBaseVo sendValicodeWithKey(@PathParam("phoneNum")String phoneNum ,@PathParam("appType")int appType, 
			@PathParam("time")String time, @PathParam("key")String key) {
		String sign = null;
		try {
			sign = Signature.calculateRFC2104HMAC((phoneNum + String.valueOf(appType) + time), AppUtil.AUTHENTICATION_KEY);
		} catch (SignatureException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		if(!sign.equals(key)){
			ResBaseVo r = new ResBaseVo();
			r.setErrcode(AppUtil.EXCEPTION_STATUS_AUTHENTICATION_ERROR);
			r.setErrmsg(AppUtil.EXCEPTION_STATUS_AUTHENTICATION_MESSAGE);
			return r;
		}else{
			ValidateCodeVo vo = (ValidateCodeVo)msgService.sendValiCode(phoneNum ,appType);
			// validate code 不再返回
			vo.setValidateCode("");
			return vo;
		}
	}
	/*
	 * end
	 */
	
	
	
	@POST
	@Path("register")
	public ResBaseVo register(RegisterVo registerVo) {
		return userService.register(registerVo);
	}
	
	@POST
	@Path("login")
	public ResBaseVo login(LoginVo loginVo) {
		System.out.println("===============>>>>>>>>>>>>>>>>>>>>>>>>>> login");
		return userService.login(loginVo);
	}
	
	@POST
	@Path("resetpwd")
	public ResBaseVo resetpwd(RegisterVo registerVo) {
		return userService.resetpwd(registerVo);
	}
	
	@POST
	@Path("userinfomodify")
	public ResBaseVo userInfoModify(User userinfo) {
		
		return userService.userInfoModify(userinfo );
	}
	
	@POST
	@Path("mobileinfo")
	public ResBaseVo mobileInfo(MobileInfoVo mobilevo) {
		System.out.println("===============>>>>>>>>>>>>>>>>>>>>>>>>>> mobileinfo");
		return userService.mobileInfo(mobilevo );
	}
	
	
	@POST
	@Path("findgoodsmsg")
	public ResBaseVo findGoodsMessage(MessageInfoVo msgvo) {
		System.out.println("----------->>>>>>>>>>>userid："+msgvo.getUserid());
		return userService.findGoodsMsg(msgvo);
		
	}
	
	@POST
	@Path("findothermsg")
	public ResBaseVo findOtherMessage(MessageOtherVo msgothervo) {
		//System.out.println("------------->>userid:"+msgothervo.getUserid());		
		return userService.findOtherMsg(msgothervo);				
	}
	
	@POST
	@Path("modilygoodsmsg")
	public ResBaseVo modilyGoodsMessage(MessageInfoVo msgvo) {
		
		return userService.modilyGoodsMsg(msgvo);
		
	}
	
	@POST
	@Path("modilyothermsg")
	public ResBaseVo modilyOtherMessage(MessageOtherVo msgothervo) {
		//System.out.println("------------->>userid:"+msgothervo.getUserid());		
		return userService.modilyOtherMsg(msgothervo);				
	}
	


	@POST
	@Path("pushlogin")
	public ResBaseVo pushUserLogin(PushUserVo pushUserVo) {	
		
		return userService.pushUserLogin(pushUserVo);	
						
	}
	
	@POST
	@Path("pushlogout")
	public ResBaseVo pushUserLogout(PushUserVo pushUserVo) {	
		return userService.pushUserLogout(pushUserVo);						
	}
	
	@GET
	@Path("updateVersion")
	public VersionUpdateInfoVo updateVersion() {
		VersionUpdateInfoVo vo = new VersionUpdateInfoVo();
		vo.setApptype(1);
		return userService.getVersionInfo(vo);
	}
	
	@GET
	@Path("iosVersion")
	public VersionUpdateInfoVo getIosVersion() {
		VersionUpdateInfoVo vo = new VersionUpdateInfoVo();
		vo.setApptype(2);
		return userService.getVersionInfo(vo);
	}
	
	@POST
	@Path("feedbackInfo")
	public FeedBackVo feedbackInfo(FeedBackVo feedBackVo){
		return userService.feedbackInfo(feedBackVo);
	}
	
	@POST
	@Path("addIntegral")
	public IntegralInfoVo addIntegral(IntegralInfoVo integralInfoVo) {
		return userService.addIntegral(integralInfoVo);
	}

	@POST
	@Path("messagecount")
	public ResBaseVo messageCount(User user) {
		return userService.getMessageCount(user);
	}
	
	@POST
	@Path("getUserHead")
	public HeadVo getUserHead(HeadVo headVo) {
		return userService.getUploadHead(headVo);
	}
	
	@POST
	@Path("getCouponClipping")
	public ResBaseVo getCouponClipping(User user) {
		return userService.getCouponClipping(user);
	}
	
	@POST
	@Path("exchangeCC")
	public ResBaseVo exchangeCC(UserCouponClippingVo userCC) {
		return userService.exchangeCC(userCC);
	}
	
	@POST
	@Path("getCCInfo")
	public ResBaseVo getCCInfo(User user) {
		return userService.getCCInfo(user);
	}
	
	@POST
	@Path("getUnUserCCInfo")
	public ResBaseVo getUnUserCCInfo(User user) {
		return userService.getUnUserCCInfo(user);
	}
	
	@POST
	@Path("headUpload")
	public HeadVo headUpload(HeadVo headVo){
		return userService.headUpload(headVo);
	}
	
	@POST
	@Path("pushSound")
	public ResBaseVo modifyPushSound(PushUserVo pushvo){
		
		return userService.modifyPushSound(pushvo);
	}
	@POST
	@Path("pushSendState")
	public ResBaseVo modifyPushSendState(PushUserVo pushvo){
		
		return userService.modifyPushSendState(pushvo);
	}
	
	@GET
	@Path("getpushstate/{userid}/{baiduuserid}")
	public ResBaseVo getpushstate(@PathParam("userid")String userid ,@PathParam("baiduuserid")String baiduuserid ){
		
		return userService.findPushState( userid,baiduuserid);
	}
	
	
}	
