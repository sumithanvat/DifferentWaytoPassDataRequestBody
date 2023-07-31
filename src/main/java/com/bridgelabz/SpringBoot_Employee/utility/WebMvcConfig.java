package com.bridgelabz.SpringBoot_Employee.utility;

import org.springframework.context.annotation.Configuration;
import org.springframework.http.converter.HttpMessageConverter;
import org.springframework.http.converter.json.MappingJackson2HttpMessageConverter;
import org.springframework.http.converter.xml.MappingJackson2XmlHttpMessageConverter;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

import java.util.List;

@Configuration
public class WebMvcConfig implements WebMvcConfigurer {

    @Override
    public void extendMessageConverters(List<HttpMessageConverter<?>> converters) {
        // Add the XML converter
        converters.add(new MappingJackson2XmlHttpMessageConverter());

        // Add the JSON converter
        converters.add(new MappingJackson2HttpMessageConverter());
    }
}
