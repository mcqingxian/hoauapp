package com.hoau.hoauapp.vo;

import java.util.Date;

public class ResourceVo extends ResBaseVo{

	private static final long serialVersionUID = 1L;
	public static final String RESOURCE_SLIDER="RESOURCE_SLIDER";
	private int id; //主键ID
	private int resourceversion; //版本号
	private String resourcetype;//资源类型     //RESOURCE_SLIDER  主页广告资源
	private Date createtime; //创建时间
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public int getResourceversion() {
		return resourceversion;
	}
	public void setResourceversion(int resourceversion) {
		this.resourceversion = resourceversion;
	}
	public String getResourcetype() {
		return resourcetype;
	}
	public void setResourcetype(String resourcetype) {
		this.resourcetype = resourcetype;
	}
	public Date getCreatetime() {
		return createtime;
	}
	public void setCreatetime(Date createtime) {
		this.createtime = createtime;
	}
	
	


}
