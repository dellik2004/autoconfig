package com.springboot.autoconfig.props;

import org.springframework.boot.context.properties.ConfigurationProperties;

@ConfigurationProperties(prefix = "springbootex.autoconfig.configserver")
public class CommonProperties {
	
	private String uri="";

	public String getUri() {
		return uri;
	}

	public void setUri(String uri) {
		this.uri = uri;
	} 
	
	
		
}
