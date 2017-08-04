package com.hoau.hoauapp.business;

import java.util.List;

import com.hoau.hoauapp.entity.User;
import com.hoau.hoauapp.vo.FeedBackVo;
import com.hoau.hoauapp.vo.IntegralInfoVo;
import com.hoau.hoauapp.si.dc.mq.entity.WaybillStatusEntity;
import com.hoau.hoauapp.vo.HeadVo;
import com.hoau.hoauapp.vo.LoginVo;
import com.hoau.hoauapp.vo.MessageInfoListVo;
import com.hoau.hoauapp.vo.MessageInfoVo;
import com.hoau.hoauapp.vo.MessageOtherListVo;
import com.hoau.hoauapp.vo.MessageOtherVo;
import com.hoau.hoauapp.vo.MobileInfoVo;
import com.hoau.hoauapp.vo.PushUserVo;
import com.hoau.hoauapp.vo.RegisterVo;
import com.hoau.hoauapp.vo.ResBaseVo;
import com.hoau.hoauapp.vo.UserCouponClippingVo;
import com.hoau.hoauapp.vo.ValidateCodeVo;
import com.hoau.hoauapp.vo.VersionUpdateInfoVo;

public interface IUserService {
	public User findUser(String id);
	
	public User login(LoginVo loginVo);
	
	public User register(RegisterVo registerVo);
	
	public User resetpwd(RegisterVo registerVo);
	
	public User userInfoModify(User userinfo);
	
	public User mobileInfo(MobileInfoVo mobilevo);

	public ResBaseVo goodsMsg(WaybillStatusEntity waybillstatus);
	
	public MessageInfoListVo findGoodsMsg(MessageInfoVo msgvo);

	public MessageOtherListVo findOtherMsg(MessageOtherVo msgothervo);

	public MessageInfoVo modilyGoodsMsg(MessageInfoVo msgvo);

	public MessageOtherVo modilyOtherMsg(MessageOtherVo msgothervo);

	public PushUserVo pushUserLogin(PushUserVo pushuservo);

	public PushUserVo pushUserLogout(PushUserVo pushUserVo);
	
	public VersionUpdateInfoVo getVersionInfo(VersionUpdateInfoVo vo);
	
	public FeedBackVo feedbackInfo(FeedBackVo feedBackVo);

	public IntegralInfoVo addIntegral(IntegralInfoVo integralInfoVo);

	public ResBaseVo getMessageCount(User user);
	
	public HeadVo getUploadHead(HeadVo headVo);
	
	public ResBaseVo getCouponClipping(User user);
	
	public ResBaseVo exchangeCC(UserCouponClippingVo userCC);
	
	public ResBaseVo getCCInfo(User user);
	
	public ResBaseVo getUnUserCCInfo(User user);
	
	public HeadVo headUpload(HeadVo headVo);

	public ResBaseVo modifyPushSound(PushUserVo pushvo);

	public ResBaseVo modifyPushSendState(PushUserVo pushvo);

	public PushUserVo findPushState(String userid, String baiduuserid);

	
	
	
}
