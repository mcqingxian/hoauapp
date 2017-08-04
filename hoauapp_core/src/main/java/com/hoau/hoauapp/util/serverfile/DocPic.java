package com.hoau.hoauapp.util.serverfile;

/**
 * <p>Title: 通用类</p>
 * <p>Description: 基于文档的图片基本信息</p>
 * <p>Copyright: Copyright (c) 2013</p>
 * <p>Company: 苏州市至诚软件业服务有限公司</p>
 * @author 韩少文
 * @version 1.0
 */
public class DocPic implements java.io.Serializable
{
	private static final long serialVersionUID = 6750159223408599185L;
	/** 图片的ID号 */
	private String picID;
	/** 图片名称，包含后缀名 */
	private String name;
	/** 来源类型 0手工图片 1 PDA图 */
	private int from = 0;
	/** 额外属性1 */
	private String app1;
	/** 额外属性2 */
	private String app2;
	/** 图片数据 */
	private byte[] bytes;
	
	public DocPic(byte[] bytes)
	{
		this.bytes = bytes;
	}
	
	public String getPicID() {
		return picID;
	}
	public void setPicID(String picID) {
		this.picID = picID;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	public int getFrom() {
		return from;
	}

	public void setFrom(int from) {
		this.from = from;
	}

	public String getApp1() {
		return app1;
	}

	public void setApp1(String app1) {
		this.app1 = app1;
	}

	public String getApp2() {
		return app2;
	}

	public void setApp2(String app2) {
		this.app2 = app2;
	}

	public byte[] getBytes() {
		return bytes;
	}
	public void setBytes(byte[] bytes) {
		this.bytes = bytes;
	}
}
