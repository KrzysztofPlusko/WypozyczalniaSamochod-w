package com.sda.carsharing.config;

import com.sda.carsharing.converters.ClientConverter;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.format.FormatterRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@Configuration
public class WebLayerConfiguration implements WebMvcConfigurer {

    @Bean
    public ClientConverter clientConverter() {
        return new ClientConverter();
    }

    @Override
    public void addFormatters(FormatterRegistry registry) {
        registry.addConverter(clientConverter());
    }
}
