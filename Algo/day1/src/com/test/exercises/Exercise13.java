package com.test.exercises;

import java.util.Arrays;

public class Exercise13 {

	public Exercise13() {
		
		String[] testcase = {"h","e","l","l","o"};
		
		System.out.println(Arrays.toString(reverse(testcase)));
	}
	
	static String[] reverse(String[] strings) {
		
		if(strings.length<=1) return strings;
		
		for(int i=0 ; i<strings.length/2 ; i++) {
			String temp = strings[i];
			int swapPlace = strings.length-i-1;
			strings[i] = strings[swapPlace];
			strings[swapPlace] = temp;
		}
		
		return strings;
		
	}

}
