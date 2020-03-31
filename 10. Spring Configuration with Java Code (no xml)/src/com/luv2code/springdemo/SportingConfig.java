package com.luv2code.springdemo;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

@Configuration
@ComponentScan("com.luv2code.springdemo")
@PropertySource("classpath:sport.properties")
public class SportingConfig
{
    @Bean
    public FortuneService happyFortuneService()
    {
        return new HappyFortuneService();
    }
    @Bean
    public Coach trackCoach()
    {
        TrackCoach myrackCoach = new TrackCoach(happyFortuneService());
        return  myrackCoach;
    }
}
