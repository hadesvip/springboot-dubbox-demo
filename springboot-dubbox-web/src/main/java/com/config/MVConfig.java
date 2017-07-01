package com.config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.env.Environment;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;

/**
 * Created by wangyong on 2017/7/1.
 */
@Configuration
public class MVConfig extends WebMvcConfigurerAdapter {

    @Autowired
    private Environment environment;



}
