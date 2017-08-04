package com.hoau.hoauapp.vo;

import java.io.Serializable;

/** 
* @ClassName: ResponseMsg 
* @Description: web 响应基本参数
* @author xujun jun.xu@hoau.net
* @date 2015年1月9日 上午8:50:24 
*  
*/
public class ResBaseVo implements Serializable{
	
	/** 
	* @Fields serialVersionUID : TODO(用一句话描述这个变量表示什么) 
	*/
	private static final long serialVersionUID = 1L;
	private String errcode;
	private String errmsg;
	public String getErrcode() {
		return errcode;
	}
	public void setErrcode(String errcode) {
		this.errcode = errcode;
	}
	public String getErrmsg() {
		return errmsg;
	}
	public void setErrmsg(String errmsg) {
		this.errmsg = errmsg;
	}
}
