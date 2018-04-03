package com.in28minutes.spring.basic.springin5steps.scope;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
// @Scope(ConfigurableBeanFactory.SCOPE_PROTOTYPE)
public class PersonDAO {
	
	@Autowired
	JdbcConnection jdbcCononection;

	public JdbcConnection getJdbcCononection() {
		return jdbcCononection;
	}

	public void setJdbcCononection(JdbcConnection jdbcCononection) {
		this.jdbcCononection = jdbcCononection;
	}

	

}
