package com.hoau.hoauapp.vo;

import java.io.Serializable;

public class AccidentType implements Serializable{
	private String AccidentTypeName;
	
	private String AccidentTypeValue;

	public String getAccidentTypeName() {
		return AccidentTypeName;
	}

	public void setAccidentTypeName(String accidentTypeName) {
		AccidentTypeName = accidentTypeName;
	}

	public String getAccidentTypeValue() {
		return AccidentTypeValue;
	}

	public void setAccidentTypeValue(String accidentTypeValue) {
		AccidentTypeValue = accidentTypeValue;
	}
	
}
