package com.test.exercises;

import java.util.ArrayList;
import java.util.LinkedList;

public class Exercise14 {

}

class MinStack {
	
	LinkedList<Integer> elements = new LinkedList<>();
	int size = 0;
	int minPosition = -1;
	
	void push(int i) {
		
		if(size == 0) {
			minPosition = 0;
		} else if(i<elements.get(minPosition)) {
			minPosition = 0;
		} else {
			minPosition++;
		}
		
		elements.push(i);
		
	}
	
	
	
}

