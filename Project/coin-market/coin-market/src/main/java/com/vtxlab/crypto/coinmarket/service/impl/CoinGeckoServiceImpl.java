package com.vtxlab.crypto.coinmarket.service.impl;

import com.vtxlab.crypto.coinmarket.exception.ApiException;
import com.vtxlab.crypto.coinmarket.model.CoinMarket;
import com.vtxlab.crypto.coinmarket.service.CoinMarketService;
import com.vtxlab.crypto.coinmarket.util.CallApiUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;
import org.springframework.web.util.UriComponentsBuilder;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

@Service
public class CoinGeckoServiceImpl implements CoinMarketService {
	
	@Autowired
	CallApiUtil callApiUtil;
	
	@Value("${coingecko-api.base-url}")
	String baseUrl;
	
	@Value("${coingecko-api.version}")
	String version;
	
	@Value("${coingecko-api.coin-market.path}")
	String coinApiPath;
	
	@Value("${coingecko-api.coin-market.vs_currency}")
	String currency;
	
	@Value("${coingecko-api.coin-market.order}")
	String order;
	
	@Value("${coingecko-api.coin-market.per_page}")
	String perPage;
	
	@Value("${coingecko-api.coin-market.page}")
	String page;
	
	@Value("${coingecko-api.coin-market.sparkline}")
	String sparkline;
	
	@Override
	public List<CoinMarket> getCoinMarket() throws ApiException {
		
		HashMap<String, String> pathParams = new HashMap<>();
		
		pathParams.put("vs_currency", currency);
		pathParams.put("order", order);
		pathParams.put("per_page", perPage);
		pathParams.put("page", page);
		pathParams.put("sparkline", sparkline);
		
		CoinMarket[] callResult = callApiUtil.invoke(baseUrl, version, coinApiPath, pathParams, CoinMarket[].class);
		
		return Arrays.asList(callResult);
	}
}
