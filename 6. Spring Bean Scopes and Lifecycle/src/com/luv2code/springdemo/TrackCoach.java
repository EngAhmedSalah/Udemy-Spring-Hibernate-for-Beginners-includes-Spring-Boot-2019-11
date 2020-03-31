package com.luv2code.springdemo;
public class TrackCoach implements Coach
{
    private FortuneService fortuneService;
    public TrackCoach(FortuneService fortuneService)
    {
        this.fortuneService = fortuneService;
    }
    public void  initMethod()
    {
        System.out.println("Init method is invoked");
    }
    public void  destroyMethod()
    {
        System.out.println("Destroy method is invoked");
    }
    @Override
    public String getDailyWorkout()
    {
        return "TrackCoach is running";
    }
    @Override
    public String getDailyFortune()
    {
        return "Track Fortune is = " + fortuneService.getFortune();
    }
}