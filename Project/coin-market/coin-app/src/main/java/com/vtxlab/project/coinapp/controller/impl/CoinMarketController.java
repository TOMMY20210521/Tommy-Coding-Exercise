package com.vtxlab.project.coinapp.controller.impl;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.JsonNode;
import com.vtxlab.project.coinapp.controller.CoinMarketOperation;
import com.vtxlab.project.coinapp.model.coin.CoinData;
import com.vtxlab.project.coinapp.model.coin.CoinResponse;
import com.vtxlab.project.coinapp.response.ApiResponse;
import com.vtxlab.project.coinapp.response.enums.ResponseCode;
import com.vtxlab.project.coinapp.service.CoinService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/crypto/api/v1")
@Slf4j
public class CoinMarketController implements CoinMarketOperation {
	
	@Autowired
	CoinService coinService;
	
	@Override
	public ResponseEntity<JsonNode> getCoinMarketData() throws JsonProcessingException {
		
		JsonNode result = coinService.getCoinMarketData();
		
		ApiResponse<JsonNode> apiResponse = ApiResponse.<JsonNode>builder()
			.code(ResponseCode.OK.getCode())
			.message(ResponseCode.OK.getMessage())
			.data(result)
			.build();
		
		ResponseEntity<JsonNode> responseEntity = ResponseEntity.ok().body(result);
		
		
		
//		log.info("########## ResponseEntity = {}", responseEntity);
		
		return responseEntity;
	}
	
	@Override
	public ResponseEntity<ApiResponse<JsonNode>> getCoinMarketData2() throws JsonProcessingException {
		
		JsonNode result = coinService.getCoinMarketData();
		
		ApiResponse<JsonNode> apiResponse = ApiResponse.<JsonNode>builder()
			.code(ResponseCode.OK.getCode())
			.message(ResponseCode.OK.getMessage())
			.data(result)
			.build();
		
		ResponseEntity<ApiResponse<JsonNode>> responseEntity = ResponseEntity.ok().body(apiResponse);
		
//		log.info("########## ResponseEntity = {}", responseEntity);
		
		return responseEntity;
	}
	
	@Override
	public ResponseEntity<CoinData[]> getCoinMarketData3() throws JsonProcessingException {
		
		CoinData[] result = coinService.getCoinMarketData2();
		
		ResponseEntity<CoinData[]> responseEntity = ResponseEntity.ok().body(result);
		
		return responseEntity;
	}
	
	@Override
	public ResponseEntity<ApiResponse<String>> postDiscordMessage() {
		
		
		
		return ResponseEntity.ok().body(
			ApiResponse.<String>builder()
				.code(ResponseCode.OK.getCode())
				.message(ResponseCode.OK.getMessage())
				.message("Success")
				.build()
		);
	}
}
