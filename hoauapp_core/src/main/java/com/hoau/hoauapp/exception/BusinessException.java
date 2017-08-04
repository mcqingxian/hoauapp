package com.hoau.hoauapp.exception;

import java.io.Serializable;

/**
 * 业务异常类
 * 
 * @author gaojia
 * 
 */
public class BusinessException extends RuntimeException implements IException,
		Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = -98857410022907304L;
	protected String errCode;
	private String errMsg;
	private Object[] arguments;

	public BusinessException() {
		
	}

	public BusinessException(String msg) {
		super(msg);
        this.errMsg = msg;
	}

	public BusinessException(String msg, Throwable cause) {
		super(msg, cause);
	}

	public BusinessException(String code, String msg) {
		super(msg);
        this.errMsg = msg;
		this.errCode = code;
	}



	public BusinessException(String code, Object... args) {
		this.errCode = code;
		this.arguments = args;
	}

	public BusinessException(String code, String msg, Object... args) {
		super(msg);
        this.errMsg = msg;
		this.errCode = code;
		this.arguments = args;
	}
	public String getErrMsg(){
	       return errMsg;
	}

	public String getErrorCode() {
		// TODO Auto-generated method stub
		return errCode;
	}

	public void setErrorArguments(Object... paramVarArgs) {
		// TODO Auto-generated method stub
		this.arguments = paramVarArgs;
	}

	public Object[] getErrorArguments() {
		// TODO Auto-generated method stub
		return this.arguments;
	}
}
