package com.luv2code.springdemo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class CricketCoach implements Coach
{
    @Autowired
    private FortuneService fortuneService;

    @Value("${foo.username}")
    private String username;
    @Value("${foo.team}")
    private String team;


    // create a no-arg constructor
    public CricketCoach()
    {
        System.out.println("CricketCoach: inside no-arg constructor");
    }

    public String getUsername() {
        return username;
    }

    public String getTeam()
    {
        return team;
    }


    @Override
    public String getDailyWorkout()
    {
        return "Practice fast bowling for 15 minutes";
    }

    @Override
    public String getFortune()
    {
        return fortuneService.getFortune();
    }
}
