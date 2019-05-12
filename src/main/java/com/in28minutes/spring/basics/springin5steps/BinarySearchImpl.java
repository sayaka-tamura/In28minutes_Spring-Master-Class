/**
 * @author : Sayaka Tamura
 * May 11, 2019
 * Udemy Spring Framework Master Class
 * Spring Level 1 - Introduction to Spring Framework in 10 Steps
 */
package com.in28minutes.spring.basics.springin5steps;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

// Java Bean : a software component that has been designed to be reusable in a variety of different environments. 

@Component // tells Spring "This is a bean that has to manage"
public class BinarySearchImpl {

	@Autowired // tells Spring "that is a dependency"
	// "Regular Auto-wiring": Do not forget put @Primary to either beans
	private SortAlgorithm sortAlgorithm;
	// "Auto-wiring by name" : Do not forget remove @Primary from either beans
	// private SortAlgorithm bubbleSortAlgorithm;

	// Constructor Injection > Setter Injection when you need to use

	public int binarySearch(int[] numbers, int numberToSearchFor) {

		int[] sortedNumbers = sortAlgorithm.sort(numbers);
		System.out.println(sortAlgorithm);

		return 3;
	};
}
