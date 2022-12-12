package com.vtxlab.project.coinapp.service.impl;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.vtxlab.project.coinapp.model.coin.CoinData;
import com.vtxlab.project.coinapp.model.coin.CoinResponse;
import com.vtxlab.project.coinapp.service.CoinService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;
import org.springframework.web.util.UriComponentsBuilder;

import java.util.Arrays;
import java.util.List;

@Service
@Slf4j
public class CoinServiceImpl implements CoinService {
	
	@Autowired
	RestTemplate restTemplate;
	
	@Value("${coingecko-api.base-url}")
	String coinGeckoBaseUrl;
	
	@Value("${coingecko-api.version}")
	String coinGeckoApiVersion;
	
	@Value("${coingecko-api.path-url}")
	String coinGeckoApiPathUrl;
	
	@Value("${coingecko-api.attributes.currency}")
	String coinGeckoApiCurrency;
	
	@Value("${coingecko-api.attributes.order}")
	String coinGeckoApiOrder;
	
	@Value("${coingecko-api.attributes.per-page}")
	String coinGeckoApiPerPage;
	
	@Value("${coingecko-api.attributes.page}")
	String coinGeckoApiPage;
	
	@Value("${coingecko-api.attributes.sparkline}")
	String coinGeckoApiSparkline;
	
	@Override
	public JsonNode getCoinMarketData() throws JsonProcessingException {
		
		String url = UriComponentsBuilder.fromUriString(coinGeckoBaseUrl)
			.pathSegment(coinGeckoApiVersion)
			.path(coinGeckoApiPathUrl)
			.queryParam("vs_currency", coinGeckoApiCurrency)
			.queryParam("order", coinGeckoApiOrder)
			.queryParam("per_page", coinGeckoApiPerPage)
			.queryParam("page", coinGeckoApiPage)
			.queryParam("sparkline", coinGeckoApiSparkline)
			.build()
			.toString();
		
		log.info("########## Url String = {}", url);
		
		String result = restTemplate.getForObject(url, String.class);
		
		ObjectMapper objectMapper = new ObjectMapper();
		
		JsonNode resultNode = objectMapper.readTree(result);
		
		return resultNode;
	}
	
	@Override
	public CoinData[] getCoinMarketData2() throws JsonProcessingException {
		
		String url = UriComponentsBuilder.fromUriString(coinGeckoBaseUrl)
			.pathSegment(coinGeckoApiVersion)
			.path(coinGeckoApiPathUrl)
			.queryParam("vs_currency", coinGeckoApiCurrency)
			.queryParam("order", coinGeckoApiOrder)
			.queryParam("per_page", coinGeckoApiPerPage)
			.queryParam("page", coinGeckoApiPage)
			.queryParam("sparkline", coinGeckoApiSparkline)
			.build()
			.toString();
		
		log.info("########## Url String = {}", url);
		
//		CoinResponse result =  restTemplate.getForObject(url, CoinResponse.class);
		
		CoinData[] result = restTemplate.getForObject(url, CoinData[].class);
		
//		CoinResponse response = restTemplate.getForObject(url, CoinResponse.class);
//		CoinResponse response = new CoinResponse(Arrays.stream(result).toList());
		
		return result;
	}
}
