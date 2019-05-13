/**
 * @author : Sayaka Tamura
 * May 11, 2019
 * Udemy Spring Framework Master Class
 * Spring Level 1 - Introduction to Spring Framework in 10 Steps
 */

package com.in28minutes.spring.basics.springin5steps;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.ComponentScan;

import com.in28minutes.spring.basics.springin5steps.cdi.SomeCdiBusiness;

@SpringBootApplication
@ComponentScan
public class SpringIn5StepsCdiApplication {

	private static Logger LOGGER = LoggerFactory.getLogger(SpringIn5StepsCdiApplication.class);

	public static void main(String[] args) {

		// Application Context: to use for getting the beans
		ApplicationContext applicationContext = SpringApplication.run(SpringIn5StepsCdiApplication.class, args);
		// Get beans from PersonDAO class
		SomeCdiBusiness business = applicationContext.getBean(SomeCdiBusiness.class);

		LOGGER.info("{}, dao-{}", business, business.getSomeCdiDao());
	}

}
