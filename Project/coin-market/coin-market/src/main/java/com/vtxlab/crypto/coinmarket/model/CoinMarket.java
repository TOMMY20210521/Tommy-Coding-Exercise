package com.vtxlab.crypto.coinmarket.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.PropertyNamingStrategies;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.databind.annotation.JsonNaming;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import com.fasterxml.jackson.datatype.jsr310.deser.LocalDateDeserializer;
import com.fasterxml.jackson.datatype.jsr310.deser.LocalDateTimeDeserializer;
import com.fasterxml.jackson.datatype.jsr310.ser.LocalDateSerializer;
import com.fasterxml.jackson.datatype.jsr310.ser.LocalDateTimeSerializer;
import lombok.*;

import java.io.Serializable;
import java.math.BigDecimal;
import java.time.LocalDateTime;

@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString
@JsonNaming(value = PropertyNamingStrategies.SnakeCaseStrategy.class)
public class CoinMarket implements Serializable {
	
	String id;
	
	String symbol;
	
	String name;
	
	String image;
	
	@JsonProperty("current_price")
	BigDecimal currentPrice;
	
	@JsonProperty("market_cap")
	BigDecimal marketCap;
	
	@JsonProperty("market_cap_rank")
	BigDecimal marketCapRank;
	
	@JsonProperty("fully_diluted_valuation")
	BigDecimal fullyDilutedValuation;
	
	@JsonProperty("total_volume")
	BigDecimal totalVolume;
	
	@JsonProperty("high_24h")
	BigDecimal highIn24Hours;
	
	@JsonProperty("low_24h")
	BigDecimal lowIn24Hours;
	
	@JsonProperty("price_change_24h")
	BigDecimal priceChangeIn24Hours;
	
	@JsonProperty("price_change_percentage_24h")
	BigDecimal priceChangePercentageIn24Hours;
	
	@JsonProperty("market_cap_change_24h")
	BigDecimal marketCapChangeIn24Hours;
	
	@JsonProperty("market_cap_change_percentage_24h")
	BigDecimal marketCapChangePercentageIn24Hours;
	
	@JsonProperty("circulating_supply")
	BigDecimal circulatingSupply;
	
	@JsonProperty("total_supply")
	BigDecimal totalSupply;
	
	@JsonProperty("max_supply")
	BigDecimal maxSupply;
	
	BigDecimal ath;
	
	@JsonProperty("ath_change_percentage")
	BigDecimal athChangePercentage;
	
	@JsonProperty("ath_date")
	@JsonDeserialize(using = LocalDateTimeDeserializer.class)
	@JsonSerialize(using = LocalDateTimeSerializer.class)
	LocalDateTime athDate;
	
	BigDecimal atl;
	
	@JsonProperty("atl_change_percentage")
	BigDecimal atlChangePercentage;
	
	@JsonProperty("atl_date")
	@JsonDeserialize(using = LocalDateTimeDeserializer.class)
	@JsonSerialize(using = LocalDateTimeSerializer.class)
	LocalDateTime atlDate;
	
	Roi roi;
	
	@JsonProperty("last_updated")
	@JsonDeserialize(using = LocalDateTimeDeserializer.class)
	@JsonSerialize(using = LocalDateTimeSerializer.class)
	LocalDateTime lastUpdated;
	
	@Data
	@AllArgsConstructor
	@NoArgsConstructor
	@ToString
	public static class Roi implements Serializable {
		
		BigDecimal times;
		
		String currency;
		
		BigDecimal percentage;
		
	}

}
