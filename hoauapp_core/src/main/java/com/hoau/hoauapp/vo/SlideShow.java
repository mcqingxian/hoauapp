package com.hoau.hoauapp.vo;

import java.io.Serializable;
import java.util.Date;


/**
 * 首页显示的图片
 * Created by xu on 2015-01-09.
 */
public class SlideShow implements Serializable
{
	private String title;
	private String imageUrl;    // 图片地址
	private String link;    // 点击链接。http:// or hoau:程序定义
	private int resId;    // 资源ID。R.drawable.*
	
	private int version; //版本号
	private Date createtime; //添加日期
	private int id;//主键ID
	
	public static final String LocalScheme = "hoau:";    // 程序定义

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getImageUrl() {
		return imageUrl;
	}

	public void setImageUrl(String imageUrl) {
		this.imageUrl = imageUrl;
	}

	public String getLink() {
		return link;
	}

	public void setLink(String link) {
		this.link = link;
	}

	public int getResId() {
		return resId;
	}

	public void setResId(int resId) {
		this.resId = resId;
	}

	public int getVersion() {
		return version;
	}

	public void setVersion(int version) {
		this.version = version;
	}

	public Date getCreatetime() {
		return createtime;
	}

	public void setCreatetime(Date createtime) {
		this.createtime = createtime;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}
	
	
	
}
