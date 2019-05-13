/**
 * @author : Sayaka Tamura
 * May 13, 2019
 * Udemy Spring Framework Master Class
 * https://github.com/in28minutes/spring-master-class/tree/master/01-spring-in-depth
 */
package com.in28minutes.spring.basics.springin5steps.cdi;

import javax.inject.Inject;
import javax.inject.Named;

@Named
public class SomeCdiBusiness {
	@Inject
	SomeCdiDao someCdiDao;

	public SomeCdiDao getSomeCdiDao() {
		return someCdiDao;
	}

	// Setter Injection
	public void setSomeCdiDao(SomeCdiDao someCdiDao) {
		this.someCdiDao = someCdiDao;
	}

}
