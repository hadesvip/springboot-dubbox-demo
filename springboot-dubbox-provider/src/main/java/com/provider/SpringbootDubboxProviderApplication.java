package com.provider;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.PropertySource;

@SpringBootApplication
@PropertySource("classpath:config/dubbox-provider-app.properties")
//@ImportResource("classpath:spring/spring-*.xml")
public class SpringbootDubboxProviderApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringbootDubboxProviderApplication.class, args);
    }
}
