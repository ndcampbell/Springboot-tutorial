package com.in28minutes.spring.basic.springin5steps.xml;

// @Scope(ConfigurableBeanFactory.SCOPE_PROTOTYPE)
public class XmlPersonDAO {
	
	XmlJdbcConnection xmlJdbcConnection;

	public XmlJdbcConnection getXmlJdbcConnection() {
		return xmlJdbcConnection;
	}

	public void setXmlJdbcConnection(XmlJdbcConnection jdbcCononection) {
		this.xmlJdbcConnection = jdbcCononection;
	}

	

}
