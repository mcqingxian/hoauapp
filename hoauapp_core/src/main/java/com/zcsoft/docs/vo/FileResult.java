package com.zcsoft.docs.vo;

import java.util.ArrayList;

/**
 * 文件操作反馈信息
 * @author hsw
 */
public class FileResult implements java.io.Serializable
{
	private static final long serialVersionUID = -5469429175385762954L;
	/** 是否成功 */
	private boolean success;
	/** 如果失败，则返回失败原因 */
	private String errorMsg;
	/** 文件系统分配的分组标记，是一串数字序号 */
	private String groupFlag;
	/** 重点关注FileEntity中的docID和docIndex，保证返回的集合顺序与请求的顺序一致。 */
	private ArrayList<FileEntity> storeFiles;
	/** 这一组的文件个数。增加/修改/删除/更新了以后，这一组还剩下多少文件了。 */
	private int fileCount = 0;
	
	public boolean isSuccess() {
		return success;
	}
	public void setSuccess(boolean success) {
		this.success = success;
	}
	public String getErrorMsg() {
		return errorMsg;
	}
	public void setErrorMsg(String errorMsg) {
		this.errorMsg = errorMsg;
	}
	public String getGroupFlag() {
		return groupFlag;
	}
	public void setGroupFlag(String groupFlag) {
		this.groupFlag = groupFlag;
	}
	public ArrayList<FileEntity> getStoreFiles() {
		return storeFiles;
	}
	public void setStoreFiles(ArrayList<FileEntity> storeFiles) {
		this.storeFiles = storeFiles;
	}
	public int getFileCount() {
		return fileCount;
	}
	public void setFileCount(int fileCount) {
		this.fileCount = fileCount;
	}
	
}
