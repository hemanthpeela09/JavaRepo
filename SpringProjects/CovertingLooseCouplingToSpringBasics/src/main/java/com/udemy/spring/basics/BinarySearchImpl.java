package com.udemy.spring.basics;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class BinarySearchImpl{
	
	@Autowired
	private SortAlgorithm algorithm;

	public BinarySearchImpl(SortAlgorithm algorithm) {
		super();
		this.algorithm = algorithm;
	}
	
	public int binarySearch(int [] numbers, int number) {
		//Implement search and sorting logic. 
		int[] result = algorithm.sort(numbers);
		//Just returning index 3
		return 3;
	}
}
