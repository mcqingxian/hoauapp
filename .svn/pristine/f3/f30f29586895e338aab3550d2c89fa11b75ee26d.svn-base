package com.zcsoft.docs.vo;

/**
 * 文件对象表示
 * @author hsw
 */
public class FileEntity implements java.io.Serializable
{
	private static final long serialVersionUID = -6778586219557304352L;
	/** 完整的文件名，包含后缀名 */
	private String fileName;
	/** 文件内容 */
	private byte[] data;
	/** 文档序号，是主键。一般不用此字段请求。 */
	private String docID;
	/** =md5(docID+ groupFlag)，用于对外公开获取文件的ID号 */
	private String docIndex;
	/** 对于特殊的应用，需要区分一组文件的不同类别。这里通过分类来进行区分。 */
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
