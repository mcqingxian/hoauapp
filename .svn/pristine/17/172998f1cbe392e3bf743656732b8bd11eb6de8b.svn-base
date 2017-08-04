package com.hoau.hoauapp.mapper;

import java.util.List;

import com.hoau.hoauapp.entity.User;
import com.hoau.hoauapp.vo.MessageInfoVo;
import com.hoau.hoauapp.vo.MessageOtherVo;
import com.hoau.hoauapp.vo.PushUserVo;

public interface MessageInfoMapper {
    /**
     * 添加货物消息
     * @param msgvo
     */
	public void createMessage(MessageInfoVo msgvo);
	/**
	 * 根据用户ID查询货物消息
	 * @param msgvo
	 * @return
	 */
	public List<MessageInfoVo> findMessageInfo(MessageInfoVo msgvo);
	/**
	 * 添加其他消息
	 * @param msgothervo
	 */
	public void createMessageOther(MessageOtherVo msgothervo);
	/**
	 * 根据用户ID查询用户其他消息
	 * @param msgothervo
	 * @return
	 */
	public List<MessageOtherVo> findMessageOther(MessageOtherVo msgothervo);
	/**
	 * 修改货物消息已读
	 * @param mesvo
	 */
	public void modifyGoodsMsgRead(MessageInfoVo msgvo);
	/**
	 * 修改其他消息已读
	 * @param othermsg
	 */
	public void modifyOherMsgRead(MessageOtherVo othermsg);
	/**
	 * 新增百度推送用户信息
	 * @param pushuservo
	 */
	public void createPushUser(PushUserVo pushuservo);
	/**
	 * 查询百度推送用户信息
	 * @param pushuservo
	 * @return
	 */
	public List<PushUserVo> findPushUser(PushUserVo pushuservo);
	/**
	 * 注销百度推送用户信息
	 * @param pushuservo
	 */
	public void modifyPushUser(PushUserVo pushuservo);
	
	/**
	 * 根据用户ID查询未读货物消息总数
	 * @param user
	 * @return
	 */
	public long getMessageCount(User user);
	
	
	/**
	 * 
	 * 方法体说明：推送消息声音设置
	 * 作者：wangmingzhao
	 * 日期：2015-5-7 下午5:04:58
	 * 
	 * @param pushvo
	 */
	public void modifyPushSound(PushUserVo pushvo);
	/**
	 * 
	 * 方法体说明：推送接收状态设置
	 * 作者：wangmingzhao
	 * 日期：2015-5-7 下午5:04:26
	 * 
	 * @param pushvo
	 */
	public void modifyPushSendState(PushUserVo pushvo);
	
	
	
	
}
