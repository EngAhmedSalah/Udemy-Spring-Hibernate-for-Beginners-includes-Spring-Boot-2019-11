package com.luv2code.springdemoannotation;

//Dependency injection (Constructor injection)
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class TennisCoach implements Coach
{
    FortuneService fortuneService;
    @Autowired
    public TennisCoach(@Qualifier("happyFortuneService") FortuneService fortuneService)
    {
        this.fortuneService = fortuneService;
    }
    @Override
    public String getDailyWorkout()
    {
        return "Tennis Coach is running ";
    }

    @Override
    public String getDailyFortune()
    {
        return "Tennis Class Daily Fortune is rinning" + fortuneService.getFortune();
    }
}
