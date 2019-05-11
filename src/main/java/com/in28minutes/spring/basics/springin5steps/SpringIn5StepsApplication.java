/**
 * @author : Sayaka Tamura
 * May 11, 2019
 * Udemy Spring Framework Master Class
 * Spring Level 1 - Introduction to Spring Framework in 10 Steps
 */

package com.in28minutes.spring.basics.springin5steps;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication // automatically scan package and its sub-packages
						// (in this case "com.in28minutes.spring.basics.springin5steps")
public class SpringIn5StepsApplication {

	public static void main(String[] args) {
//		BinarySearchImpl binarySearch = new BinarySearchImpl(new QuickSortAlgorithm());
//		"alternative part of above sentence is as below"

		// Application Context: to use for getting the beans
		ConfigurableApplicationContext applicationContext = SpringApplication.run(SpringIn5StepsApplication.class,
				args);
		// Get beans from BinarySearchImpl class
		BinarySearchImpl binarySearch = applicationContext.getBean(BinarySearchImpl.class);
		int result = binarySearch.binarySearch(new int[] { 12, 4, 6 }, 3);
		System.out.println(result); // 3
	}

}