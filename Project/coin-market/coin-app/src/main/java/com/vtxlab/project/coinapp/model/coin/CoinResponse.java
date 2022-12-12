package com.vtxlab.project.coinapp.model.coin;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.*;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

@Getter
@Setter
@ToString
@Data
@AllArgsConstructor
public class CoinResponse implements Serializable {
	
	@JsonProperty("START_ARRAY")
	List<CoinData> coinDatas;
	
	public CoinResponse() {
		coinDatas = new ArrayList<>();
	}
	
}
