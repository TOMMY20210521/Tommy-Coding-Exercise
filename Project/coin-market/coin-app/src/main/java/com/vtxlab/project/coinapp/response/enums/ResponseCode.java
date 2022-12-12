package com.vtxlab.project.coinapp.response.enums;

public enum ResponseCode {
	
	OK(20000, "Ok."),
	FAILED(50000, "Failed.");
	
	int code;
	String message;
	
	ResponseCode(int code, String message) {
		this.code = code;
		this.message = message;
	}
	
	public int getCode() {
		return code;
	}
	
	public String getMessage() {
		return message;
	}
}
