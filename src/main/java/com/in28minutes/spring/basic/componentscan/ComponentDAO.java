package com.in28minutes.spring.basic.componentscan;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class ComponentDAO {
	
	@Autowired
	ComponentJdbcConnection jdbcCononection;

	public ComponentJdbcConnection getJdbcCononection() {
		return jdbcCononection;
	}

	public void setComponentJdbcCononection(ComponentJdbcConnection jdbcCononection) {
		this.jdbcCononection = jdbcCononection;
	}

	

}
