package com.example.databasedevelopmenttechnology.utils;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class MybatisPlusConfig {
    @Bean
    public SqlInjector sqlInjector() {
        return new SqlInjector();
    }
}
