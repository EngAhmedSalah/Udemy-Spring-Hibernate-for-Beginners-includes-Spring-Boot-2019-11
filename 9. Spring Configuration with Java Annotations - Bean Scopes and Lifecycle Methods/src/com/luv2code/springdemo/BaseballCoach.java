package com.luv2code.springdemo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope ("prototype")
public class BaseballCoach implements Coach
{

    // define a private field for the dependency
    private FortuneService fortuneService;

    // define a constructor for dependency injection
    @Autowired
    public BaseballCoach(FortuneService fortuneService)
    {
        this.fortuneService = fortuneService;
    }

    @Override
    public String getDailyWorkout()
    {
        return "Spend 30 minutes on batting practice";
    }

    @Override
    public String getFortune()
    {
        // use my fortuneService to get a fortune
        return "the daily fortune = " + fortuneService.getFortune();
    }
}








