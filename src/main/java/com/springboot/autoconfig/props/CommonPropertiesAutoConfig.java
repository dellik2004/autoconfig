package com.springboot.autoconfig.props;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
@EnableConfigurationProperties(CommonProperties.class)
public class CommonPropertiesAutoConfig {
	
	@Autowired
	private CommonProperties commonProperties;
	
	@Bean
	public CommonPropertiesConfig commonPropertiesConfig() {
		CommonPropertiesConfig propertiesConfig = new CommonPropertiesConfig();
		propertiesConfig.put("uri", commonProperties.getUri());
		return propertiesConfig;
	}
}
