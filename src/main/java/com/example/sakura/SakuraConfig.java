package com.example.sakura;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan("com.example.sakura")
public class SakuraConfig {

    @Bean
    public chenyang getCy(){
        return new chenyang();
    }
}
