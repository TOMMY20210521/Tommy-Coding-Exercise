package com.vtxlab.crypto.coinmarket.exception;

import com.vtxlab.crypto.coinmarket.model.CoinMarket;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

import java.util.ArrayList;
import java.util.List;

@ControllerAdvice
public class GlobalExceptionHandler {

	@ExceptionHandler({ ApiException.class })
	public List<CoinMarket> handleApiException() {
		return new ArrayList<>();
	}
	
}
