/**
 * @author : Sayaka Tamura
 * May 11, 2019
 * Udemy Spring Framework Master Class
 * Spring Level 1 - Introduction to Spring Framework in 10 Steps
 */
package com.in28minutes.spring.basics.springin5steps;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
@Primary // to use the beans primary
public class QuickSortAlgorithm implements SortAlgorithm {
	public int[] sort(int[] numbers) {
		// Logic for Quick Sort
		return numbers;
	}
}