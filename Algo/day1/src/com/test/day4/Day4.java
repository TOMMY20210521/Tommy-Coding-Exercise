package com.test.day4;

public class Day4 {
	
	public Day4() {
		factorialLoop();
		factorialRecursion();
	}
	
	static void factorialLoop() {
		int testcase = 5;
		
		int result = 1;
		
		while(testcase>1) {
			result *= testcase--;
		}
		
		System.out.println(result);
		
	}
	
	static void factorialRecursion() {
		
		int testcase = 5;
		
		System.out.println(factorialRecur(testcase));
		
	}
	
	static int factorialRecur(int i) {
		
		if(i<=1) return i;
		
		return i * factorialRecur(i-1);
		
	}
	
}
