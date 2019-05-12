/**
 * @author : Sayaka Tamura
 * May 12, 2019
 * Udemy Spring Framework Master Class
 * https://github.com/in28minutes/spring-master-class/tree/master/01-spring-in-depth
 */
package com.in28minutes.spring.basics.componentscan;

import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.Scope;
import org.springframework.context.annotation.ScopedProxyMode;
import org.springframework.stereotype.Component;

@Component
// Tell SCOPE_PROTOTYPE to main method. in main, JdbcConneciton class is not be called, and beans does not use prototype.
@Scope(value = ConfigurableBeanFactory.SCOPE_PROTOTYPE, proxyMode = ScopedProxyMode.TARGET_CLASS)
public class ComponentJdbcConnection {
	public ComponentJdbcConnection() {
		System.out.println("JDBC Connction");
	}
}
