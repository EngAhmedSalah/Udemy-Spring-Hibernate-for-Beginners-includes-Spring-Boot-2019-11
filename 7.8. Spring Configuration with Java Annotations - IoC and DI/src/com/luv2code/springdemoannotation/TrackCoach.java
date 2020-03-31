package com.luv2code.springdemoannotation;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

//Dependency injection (setter injection)
//@Component("trackCoach")
@Component
public class TrackCoach implements Coach
{
    private FortuneService fortuneService;
    @Override
    public String getDailyWorkout()
    {
        return "TrackCoach is running";
    }

    @Autowired
    public void setFortuneService(@Qualifier("happyFortuneService") FortuneService fortuneService)
    {
        this.fortuneService = fortuneService;
    }

    @Override
    public String getDailyFortune()
    {
        return "TrackCoach Class Daily Fortune is running" + fortuneService.getFortune();
    }
}
