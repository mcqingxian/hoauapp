package com.hoau.hoauapp.mapper;

import org.springframework.stereotype.Repository;

import com.hoau.hoauapp.vo.FeedBackVo;

@Repository
public interface FeedbackMapper {

	/**
	 * 查询某个手机号是否已生成验证码
	 */
	public FeedBackVo userFeedBack(FeedBackVo feedBackVo);
	
}