package com.vtxlab.project.coinapp;

import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;
import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.HashMap;

@SpringBootApplication
@Slf4j
public class CoinAppApplication {

	public static void main(String[] args) {
		SpringApplication.run(CoinAppApplication.class, args);
		
		ObjectMapper objectMapper = new ObjectMapper();
		
		HashMap<String, String> test = new HashMap<>();
		
		test.put("a", "1");
		test.put("b", "2");
		test.put("c", "3");
		test.put("d", "4");
		
		try {
			log.info("######## hashmap json = {}", objectMapper.writeValueAsString(test));
		} catch (Exception e) {
			log.info("######## hashmap json fail!!!!!");
		}
		
	}

}
