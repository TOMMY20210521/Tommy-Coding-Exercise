package com.vtxlab.crypto.coinmarket.controller.impl;

import com.vtxlab.crypto.coinmarket.controller.CoinMarketOperation;
import com.vtxlab.crypto.coinmarket.exception.ApiException;
import com.vtxlab.crypto.coinmarket.model.CoinMarket;
import com.vtxlab.crypto.coinmarket.service.CoinMarketService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/crypto/api/v1")
public class CoinMarketController implements CoinMarketOperation {
	
	@Autowired
	CoinMarketService coinMarketService;
	
	@Override
	public ResponseEntity<List<CoinMarket>> getCoinMarket() throws ApiException {
		return ResponseEntity.ok().body(coinMarketService.getCoinMarket());
	}
	
}
