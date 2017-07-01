package com.config;

import com.alibaba.fastjson.serializer.SerializerFeature;
import com.alibaba.fastjson.support.config.FastJsonConfig;
import com.alibaba.fastjson.support.spring.FastJsonHttpMessageConverter4;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.env.Environment;
import org.springframework.http.MediaType;
import org.springframework.http.converter.HttpMessageConverter;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;

import java.util.Arrays;
import java.util.List;

/**
 * Created by wangyong on 2017/7/1.
 */
@Configuration
public class MVConfig extends WebMvcConfigurerAdapter {

    @Autowired
    private Environment environment;


    private FastJsonHttpMessageConverter4 fastJsonHttpMessageConverter4() {
        FastJsonHttpMessageConverter4 fastJsonHttpMessageConverter4 = new FastJsonHttpMessageConverter4();
        fastJsonHttpMessageConverter4.setSupportedMediaTypes(Arrays.asList(MediaType.TEXT_HTML, MediaType.APPLICATION_JSON));

        FastJsonConfig fastJsonConfig = new FastJsonConfig();
        fastJsonConfig.setSerializerFeatures(SerializerFeature.QuoteFieldNames, SerializerFeature.WriteMapNullValue);
        fastJsonHttpMessageConverter4.setFastJsonConfig(fastJsonConfig);

        return fastJsonHttpMessageConverter4;
    }

    @Override
    public void configureMessageConverters(List<HttpMessageConverter<?>> converters) {
        converters.add(fastJsonHttpMessageConverter4());
        super.configureMessageConverters(converters);
    }
}
