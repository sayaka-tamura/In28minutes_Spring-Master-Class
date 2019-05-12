/**
 * @author : Sayaka Tamura
 * May 12, 2019
 * Udemy Spring Framework Master Class
 * https://github.com/in28minutes/spring-master-class/tree/master/01-spring-in-depth
 */
package com.in28minutes.spring.basics.componentscan;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class ComponentDAO {

	@Autowired
	ComponentJdbcConnection jdbcConnection;

	public ComponentJdbcConnection getJdbcConnection() {
		return jdbcConnection;
	}

	public void setComponentJdbcConnection(ComponentJdbcConnection jdbcConnection) {
		this.jdbcConnection = jdbcConnection;
	}

}
