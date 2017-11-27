package com.udemy.spring.basics;


public class BinarySearchImpl{
	
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
