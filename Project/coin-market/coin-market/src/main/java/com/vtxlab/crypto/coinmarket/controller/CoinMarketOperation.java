package com.vtxlab.crypto.coinmarket.controller;

import com.vtxlab.crypto.coinmarket.exception.ApiException;
import com.vtxlab.crypto.coinmarket.model.CoinMarket;
import com.vtxlab.crypto.coinmarket.model.dto.ChannelDTO;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

@CrossOrigin
public interface CoinMarketOperation {
	
	@GetMapping("/coin/market")
	ResponseEntity<List<CoinMarket>> getCoinMarket() throws ApiException;
	
//	@GetMapping("/coingecko/simple-price")
//	ChannelDTO getSimplePrices(List<String> cryptos, List<String> currencies);

//	List<String> stringToList(List<String> coins);
	
}
