package com.hoau.hoauapp.util.serverfile;

/**
 * <p>Title: ͨ����</p>
 * <p>Description: �����ĵ���ͼƬ������Ϣ</p>
 * <p>Copyright: Copyright (c) 2013</p>
 * <p>Company: �������������ҵ�������޹�˾</p>
 * @author ������
 * @version 1.0
 */
public class DocPic implements java.io.Serializable
{
	private static final long serialVersionUID = 6750159223408599185L;
	/** ͼƬ��ID�� */
	private String picID;
	/** ͼƬ���ƣ�������׺�� */
	private String name;
	/** ��Դ���� 0�ֹ�ͼƬ 1 PDAͼ */
	private int from = 0;
	/** ��������1 */
	private String app1;
	/** ��������2 */
	private String app2;
	/** ͼƬ���� */
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
