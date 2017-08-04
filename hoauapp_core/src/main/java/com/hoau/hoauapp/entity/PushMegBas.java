package com.hoau.hoauapp.entity;

/**
 * 消息通知推送基础类
 *
 * @作者： wangmingzhao
 * @Title: PushMegBas.java
 * @Package com.hoau.hoauapp.entity
 * @Description: 
 * @Date: 2015-5-7 下午3:09:52
 */
public class PushMegBas {

	private String title;//标题
	private String description; //通知内容
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	
	
}
