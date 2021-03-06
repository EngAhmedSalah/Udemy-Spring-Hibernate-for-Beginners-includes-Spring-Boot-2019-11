package com.luv2code.springdemo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

//Dependency injection (setter injection)
//@Component("trackCoach")
@Component
public class TrackCoach implements Coach {
    private FortuneService fortuneService;
    
    @Value("${foo.username}")
    private String username;
    
    @Value("${foo.team}")
    private String team;

    public TrackCoach(FortuneService happyFortuneService) { }

    public String getUsername() { return username; }

    public String getTeam() { return team; }

    @PostConstruct
    public void initMethod() {
        System.out.println("Init method is invoked");
    }

    @PreDestroy
    public void destroyMethod() {
        System.out.println("Destroy method is invoked");
    }

    @Override
    public String getDailyWorkout() {
        return "TrackCoach is running";
    }

    @Override
    public String getFortune() {
        return "TrackCoach Class Daily Fortune is running" + fortuneService.getFortune();
    }

    @Autowired
    public void setterMethod(FortuneService fortuneService) {
        this.fortuneService = fortuneService;
    }
}