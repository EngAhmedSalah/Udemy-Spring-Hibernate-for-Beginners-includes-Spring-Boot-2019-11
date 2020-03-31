package com.luv2code.springdemo;

public class CricketCoach implements Coach
{

    private FortuneService fortuneService;

    // add new fields for emailAddress and team
    private String emailAddress;
    private String team;
    private String userName;
    private String password;


    // create a no-arg constructor
    public CricketCoach()
    {
        System.out.println("CricketCoach: inside no-arg constructor");
    }

    public String getEmailAddress()
    {
        return emailAddress;
    }

    public void setEmailAddress(String emailAddress)
    {
        System.out.println("CricketCoach: inside setter method - setEmailAddress");
        this.emailAddress = emailAddress;
    }

    public String getTeam()
    {
        return team;
    }

    public void setTeam(String team)
    {
        System.out.println("CricketCoach: inside setter method - setTeam");
        this.team = team;
    }

    // our setter method
    public void setFortuneService(FortuneService fortuneService)
    {
        System.out.println("CricketCoach: inside setter method - setFortuneService");
        this.fortuneService = fortuneService;
    }

    @Override
    public String getDailyWorkout()
    {
        return "Practice fast bowling for 15 minutes";
    }

    @Override
    public String getDailyFortune()
    {
        return fortuneService.getFortune();
    }

    public void setUserName(String userName)
    {
        System.out.println("CricketCoach: inside setter method - setUserName");
        this.userName = userName;
    }

    public String getUserName()
    {
        return userName;
    }

    public String getPassword()
    {
        return password;
    }

    public void setPassword(String password)
    {
        System.out.println("CricketCoach: inside setter method - setPassword");
        this.password = password;
    }
}
