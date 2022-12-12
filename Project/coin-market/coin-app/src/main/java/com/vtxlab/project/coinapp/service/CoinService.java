package com.vtxlab.project.coinapp.service;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.JsonNode;
import com.vtxlab.project.coinapp.model.coin.CoinData;
import com.vtxlab.project.coinapp.model.coin.CoinResponse;

public interface CoinService {
	
	JsonNode getCoinMarketData() throws JsonProcessingException;
	
	CoinData[] getCoinMarketData2() throws JsonProcessingException;
	
}
