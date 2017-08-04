package com.hoau.hoauapp.entity;

public class PushMessageEntity extends PushMegBas {

	
	private Object custom_content;
	//客户端自定义通知样式
	private int notification_basic_style;	//5：响铃 3:振动   1:无声音无振动  7:响铃加振动
	private int notification_builder_id; //0时有效
	
	
	public int getNotification_basic_style() {
		return notification_basic_style;
	}
	public void setNotification_basic_style(int notification_basic_style) {
		this.notification_basic_style = notification_basic_style;
	}
	public int getNotification_builder_id() {
		return notification_builder_id;
	}
	public void setNotification_builder_id(int notification_builder_id) {
		this.notification_builder_id = notification_builder_id;
	}
	
	public Object getCustom_content() {
		return custom_content;
	}
	public void setCustom_content(Object custom_content) {
		this.custom_content = custom_content;
	}
	
}
