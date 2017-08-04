package com.hoau.hoauapp.exception;

public interface IException {
	String getErrorCode();

	void setErrorArguments(Object... paramVarArgs);

	Object[] getErrorArguments();

}
