package com.luv2code.springdemoannotation;

////Dependency injection (Field injection) with properties file
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class SwimCoach implements Coach
{
    @Qualifier("happyFortuneService")
    @Autowired
    private FortuneService fortuneService;
    @Value("${foo.email}")
    private  String email;

    public String getEmail()
    {
        return email;
    }

    public void setEmail(String email)
    {
        this.email = email;
    }

    public String getTeam()  {return team;}

    public void setTeam(String team)  { this.team = team; }

    @Value("${foo.team}")
    private  String team;
    @Override
    public String getDailyWorkout()
    {
         return "Swim Coach is running";
    }

    @Override
    public String getDailyFortune()
    {
        return  "Football Class Daily Fortune is running" + fortuneService.getFortune();
    }
}
