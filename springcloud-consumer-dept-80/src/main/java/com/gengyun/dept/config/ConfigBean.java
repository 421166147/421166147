package com.gengyun.dept.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;

@Configuration
public class ConfigBean {//@Configuration=spring的 application.xml

    @Bean
    public RestTemplate getRestTemplate() {
        return new RestTemplate();
    }
}