package com.hoau.hoauapp.vo;

import java.io.File;

/**
 * 头像上传实体
 * 
 * @author 277610
 * @Date 2015-02-05
 */
public class HeadVo extends ResBaseVo {

	private static final long serialVersionUID = 2651283100788478154L;

	/**
	 * 主键
	 */
	private String id;

	/**
	 * 用户ID
	 */
	private String userId;

	/**
	 * 图片文件名
	 */
	private String imgName;

	/**
	 * 图片路径
	 */
	private String fileUrl;

	/**
	 * 图片内容
	 */
	private byte[] imgContent;

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getUserId() {
		return userId;
	}

	public void setUserId(String userId) {
		this.userId = userId;
	}

	public String getFileUrl() {
		return fileUrl;
	}

	public void setFileUrl(String fileUrl) {
		this.fileUrl = fileUrl;
	}

	public String getImgName() {
		return imgName;
	}

	public void setImgName(String imgName) {
		this.imgName = imgName;
	}

	public byte[] getImgContent() {
		return imgContent;
	}

	public void setImgContent(byte[] imgContent) {
		this.imgContent = imgContent;
	}

}
