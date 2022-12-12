package com.vtxlab.project.coinapp.exception;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.vtxlab.project.coinapp.response.ApiResponse;
import com.vtxlab.project.coinapp.response.enums.ResponseCode;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

@ControllerAdvice
public class AppExceptionHandler {
	
	@ExceptionHandler({ JsonProcessingException.class })
	ResponseEntity<ApiResponse<?>> handleJsonProcessingException(JsonProcessingException e) {

		ApiResponse<Object> apiResponse = ApiResponse.builder()
			.code(ResponseCode.FAILED.getCode())
			.message(ResponseCode.FAILED.getMessage())
			.data(e.getMessage())
			.build();
		
		ResponseEntity<ApiResponse<Object>> responseEntity = ResponseEntity.badRequest().body(apiResponse);

		return responseEntity;
	}
	
}
