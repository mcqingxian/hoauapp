package com.hoau.hoauapp.util.serverfile;

import java.util.Vector;

/**
 * <p>Title: 通用类</p>
 * <p>Description: 基于文档的图片操作信息</p>
 * @author 田育林
 * @version 1.0
 */

public class DocPicture implements java.io.Serializable
{
	private static final long serialVersionUID = -928847541109069542L;
	/** 业务类型，定义了图片所属的业务类型：
	 * 01--卸车异常图片 02--拆笼异常图片 03--始发车装车图片 04--途经地发车装车图片
	 * 05-签收人签名图片 06-客户账务登记卡 07-理赔扫描图片 08-投诉一级公司复议图片
	 * 09-丢货查找图片 10-质检图片(*) 19-质检复议*/
	private String ywlx;
	/** 文件系统分配的分组标记，是一串数字序号 */
	private String groupFlag;
	/** 业务主键 */
	private String bh;
	/** 图片集，里面存放的是Pic对象 */
	private Vector<DocPic> pics;
	/** 待删除的图片ID集合 */
	private Vector<String> delPicIds;
	/** 最新的图片个数 */
	private int picCnt;
	/** 获取图片首张缩略图，指定的行高，用于计算缩放后的图片大小 */
	private int rowHeight = 100;

	public DocPicture(){}

	public String getYwlx() {
		return ywlx;
	}

	public void setYwlx(String ywlx) {
		this.ywlx = ywlx;
	}

	public String getGroupFlag() {
		return groupFlag;
	}

	public void setGroupFlag(String groupFlag) {
		this.groupFlag = groupFlag;
	}

	public String getBh() {
		return bh;
	}

	public void setBh(String bh) {
		this.bh = bh;
	}

	public Vector<DocPic> getPics() {
		return pics;
	}

	public void setPics(Vector<DocPic> pics) {
		this.pics = pics;
	}

	public Vector<String> getDelPicIds() {
		return delPicIds;
	}

	public void setDelPicIds(Vector<String> delPicIds) {
		this.delPicIds = delPicIds;
	}

	public int getPicCnt() {
		return picCnt;
	}

	public void setPicCnt(int picCnt) {
		this.picCnt = picCnt;
	}

	public int getRowHeight() {
		return rowHeight;
	}

	public void setRowHeight(int rowHeight) {
		this.rowHeight = rowHeight;
	}
	
}