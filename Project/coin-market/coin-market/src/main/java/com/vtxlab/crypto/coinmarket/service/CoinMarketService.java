package com.vtxlab.crypto.coinmarket.service;

import com.vtxlab.crypto.coinmarket.exception.ApiException;
import com.vtxlab.crypto.coinmarket.model.CoinMarket;

import java.util.List;

public interface CoinMarketService {
	
	List<CoinMarket> getCoinMarket() throws ApiException;
	
}
