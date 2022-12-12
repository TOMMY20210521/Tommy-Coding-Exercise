package com.vtxlab.project.coinapp.controller;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.JsonNode;
import com.vtxlab.project.coinapp.model.coin.CoinData;
import com.vtxlab.project.coinapp.model.coin.CoinResponse;
import com.vtxlab.project.coinapp.response.ApiResponse;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;

@CrossOrigin("*")
public interface CoinMarketOperation {
	
	@GetMapping("/coin/market")
	ResponseEntity<JsonNode> getCoinMarketData() throws JsonProcessingException;
	
	@GetMapping("/coin/market2")
	ResponseEntity<ApiResponse<JsonNode>> getCoinMarketData2() throws JsonProcessingException;
	
//	@CrossOrigin("*")
	@GetMapping("/coin/market3")
	ResponseEntity<CoinData[]> getCoinMarketData3() throws JsonProcessingException;
	
}
