package com.vtxlab.project.coinapp.service.impl;

import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.node.ObjectNode;
import com.vtxlab.project.coinapp.service.DiscordService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class DiscordServiceImpl implements DiscordService {
	
	@Autowired
	ObjectMapper objectMapper;
	
	@Autowired
	RestTemplate restTemplate;
	
	@Override
	public boolean postDiscordMessage() {
		
		ObjectNode objectNode = objectMapper.createObjectNode();
		
		objectNode.put("name", "blep")
			.put("type", 1)
			.put("description", "Sendn a random adorable animal photo")
			.put("options", new byte[0]);
		
//		restTemplate.po
		
		return true;
	}
}
