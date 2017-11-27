package com.udemy.spring.basics;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class BubbleSortAlgm implements SortAlgorithm{
	Logger LOG = LoggerFactory.getLogger(BubbleSortAlgm.class);
	public int[] sort(int[] numbers) {
		//Implement bubble sort algorithm
		LOG.info(numbers.toString());
		return numbers;
	}
}
