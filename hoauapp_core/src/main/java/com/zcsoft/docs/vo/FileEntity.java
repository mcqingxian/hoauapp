package com.zcsoft.docs.vo;

/**
 * �ļ������ʾ
 * @author hsw
 */
public class FileEntity implements java.io.Serializable
{
	private static final long serialVersionUID = -6778586219557304352L;
	/** �������ļ�����������׺�� */
	private String fileName;
	/** �ļ����� */
	private byte[] data;
	/** �ĵ���ţ���������һ�㲻�ô��ֶ����� */
	private String docID;
	/** =md5(docID+ groupFlag)�����ڶ��⹫����ȡ�ļ���ID�� */
	private String docIndex;
	/** ���������Ӧ�ã���Ҫ����һ���ļ��Ĳ�ͬ�������ͨ���������������֡� */
	private int classID = 0;
	
	
	public String getFileName() {
		return fileName;
	}
	public void setFileName(String fileName) {
		this.fileName = fileName;
	}
	public byte[] getData() {
		return data;
	}
	public void setData(byte[] data) {
		this.data = data;
	}
	public String getDocID() {
		return docID;
	}
	public void setDocID(String docID) {
		this.docID = docID;
	}
	public String getDocIndex() {
		return docIndex;
	}
	public void setDocIndex(String docIndex) {
		this.docIndex = docIndex;
	}
	public int getClassID() {
		return classID;
	}
	public void setClassID(int classID) {
		this.classID = classID;
	}
	
}
