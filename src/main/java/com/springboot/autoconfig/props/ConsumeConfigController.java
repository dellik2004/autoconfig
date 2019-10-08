package com.springboot.autoconfig.props;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ConsumeConfigController {
	
	@Autowired
    private CommonPropertiesConfig commonConfig;
    
	@RequestMapping(value = "/getCommonMessage" )
    public String getMessage() {
        return "Message from commonConfig: "+commonConfig.get("uri");
    }


}
