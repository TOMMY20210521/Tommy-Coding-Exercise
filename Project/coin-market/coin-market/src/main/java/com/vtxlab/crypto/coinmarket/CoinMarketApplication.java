package com.vtxlab.crypto.coinmarket;

import com.vtxlab.crypto.coinmarket.model.CoinMarket;
import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@Slf4j
public class CoinMarketApplication {

	public static void main(String[] args) {
		SpringApplication.run(CoinMarketApplication.class, args);
		
		log.info("########## Array[].class = {}", String[].class.toString());
		log.info("########## Object.class = {}", String.class.toString());
		log.info("########## Array[].class = {}", CoinMarket[].class.toString());
		log.info("########## Object.class = {}", CoinMarket.class.toString());
	}

}
