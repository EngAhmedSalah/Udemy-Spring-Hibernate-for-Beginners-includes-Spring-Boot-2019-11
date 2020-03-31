package com.luv2code.springdemoannotation;

////Dependency injection (Field injection)

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class BasketballCoach implements  Coach
{
    @Qualifier("happyFortuneService")
    @Autowired
    private  FortuneService fortuneService;
    @Override
    public String getDailyWorkout()
    {
        return "Basketball Coach is running";
    }

    @Override
    public String getDailyFortune()
    {
        return "Basketball Class Daily Fortune is running" + fortuneService.getFortune();
    }
}

