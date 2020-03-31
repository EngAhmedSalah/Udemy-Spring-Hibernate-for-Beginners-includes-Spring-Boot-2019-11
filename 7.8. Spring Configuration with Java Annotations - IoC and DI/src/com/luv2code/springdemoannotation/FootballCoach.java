package com.luv2code.springdemoannotation;
//Dependency injection (Method injection)
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class FootballCoach implements  Coach
{
    private  FortuneService fortuneService;

    @Autowired
    public void setterMethod(@Qualifier("happyFortuneService") FortuneService fortuneService)
    {
        this.fortuneService = fortuneService;
    }
    @Override
    public String getDailyWorkout()
    {
        return "Football Coach is running";
    }

    @Override
    public String getDailyFortune()
    {
         return "Football Class Daily Fortune is running" + fortuneService.getFortune();
    }
}