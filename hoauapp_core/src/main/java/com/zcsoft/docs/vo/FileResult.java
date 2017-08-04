package com.zcsoft.docs.vo;

import java.util.ArrayList;

/**
 * �ļ�����������Ϣ
 * @author hsw
 */
public class FileResult implements java.io.Serializable
{
	private static final long serialVersionUID = -5469429175385762954L;
	/** �Ƿ�ɹ� */
	private boolean success;
	/** ���ʧ�ܣ��򷵻�ʧ��ԭ�� */
	private String errorMsg;
	/** �ļ�ϵͳ����ķ����ǣ���һ��������� */
	private String groupFlag;
	/** �ص��עFileEntity�е�docID��docIndex����֤���صļ���˳���������˳��һ�¡� */
	private ArrayList<FileEntity> storeFiles;
	/** ��һ����ļ�����������/�޸�/ɾ��/�������Ժ���һ�黹ʣ�¶����ļ��ˡ� */
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
