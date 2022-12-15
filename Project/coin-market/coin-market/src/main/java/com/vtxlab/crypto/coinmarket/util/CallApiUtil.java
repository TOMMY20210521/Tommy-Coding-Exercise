package com.vtxlab.crypto.coinmarket.util;

import com.vtxlab.crypto.coinmarket.exception.ApiException;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;
import org.springframework.web.util.UriComponentsBuilder;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

@Component
@Slf4j
public class CallApiUtil {
	
	@Autowired
	RestTemplate restTemplate;
	
	public <T> T invoke(String baseUrl, String serviceVersion, String serviceUrl, HashMap<String, String> pathParam, Class<T> returnType) throws ApiException {
		
		UriComponentsBuilder uriComponentsBuilder = UriComponentsBuilder
			.fromUriString(baseUrl)
			.pathSegment(serviceVersion)
			.path(serviceUrl);
		
		for(Map.Entry<String, String> entry : pathParam.entrySet()) {
			uriComponentsBuilder.queryParam(entry.getKey(), entry.getValue());
		}
		
		String url = uriComponentsBuilder.build().toString();
		
		try {
			return restTemplate.getForObject(url, returnType);
		} catch (Exception e) {
			e.printStackTrace();
			throw new ApiException(50001, "!!! Call URI failed. URI: " + url);
		}
		
	}

	
}
