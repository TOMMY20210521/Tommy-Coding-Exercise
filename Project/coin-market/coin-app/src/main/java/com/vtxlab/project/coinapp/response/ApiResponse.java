package com.vtxlab.project.coinapp.response;

import lombok.*;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
@ToString
public class ApiResponse<T> {

	Integer code;
	
	String message;
	
	T data;

}
