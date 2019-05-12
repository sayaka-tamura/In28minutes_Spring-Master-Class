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

import com.in28minutes.spring.basics.springin5steps.scope.PersonDAO;

@SpringBootApplication
public class SpringIn5StepsScopeApplication {

	private static Logger LOGGER = LoggerFactory.getLogger(SpringIn5StepsScopeApplication.class);

	public static void main(String[] args) {

		// Application Context: to use for getting the beans
		ApplicationContext applicationContext = SpringApplication.run(SpringIn5StepsScopeApplication.class, args);
		// Get beans from PersonDAO class
		PersonDAO personDao = applicationContext.getBean(PersonDAO.class);
		PersonDAO personDao2 = applicationContext.getBean(PersonDAO.class);

		LOGGER.info("{}", personDao);
		LOGGER.info("{}", personDao.getJdbcConnection());
		LOGGER.info("{}", personDao2);
		LOGGER.info("{}", personDao2.getJdbcConnection());
	}

}
