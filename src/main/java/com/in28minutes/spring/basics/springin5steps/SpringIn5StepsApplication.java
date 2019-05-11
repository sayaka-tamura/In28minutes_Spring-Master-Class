/**
 * @author : Sayaka Tamura
 * May 11, 2019
 * Udemy Spring Framework Master Class
 * Spring Level 1 - Introduction to Spring Framework in 10 Steps
 */

package com.in28minutes.spring.basics.springin5steps;

import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SpringIn5StepsApplication {

	public static void main(String[] args) {
		BinarySearchImpl binarySearchImpl = new BinarySearchImpl(new QuickSortAlgorithm());
		int result = binarySearchImpl.binarySearch(new int[] { 12, 4, 6 }, 3);
		System.out.println(result);

		// SpringApplication.run(SpringIn5StepsApplication.class, args);
	}

}
