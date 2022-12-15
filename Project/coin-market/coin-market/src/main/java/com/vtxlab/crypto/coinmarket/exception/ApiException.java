package com.vtxlab.crypto.coinmarket.exception;

public class ApiException extends Exception {
	
	Integer code;
	
	public ApiException(Integer code, String message) {
		super(message);
		this.code = code;
	}
	
}
