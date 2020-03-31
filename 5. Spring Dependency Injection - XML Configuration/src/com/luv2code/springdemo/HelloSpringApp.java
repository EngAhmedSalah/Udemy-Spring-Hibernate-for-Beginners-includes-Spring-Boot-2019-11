
package com.luv2code.springdemo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import javax.sound.midi.Soundbank;

public class HelloSpringApp
{
    public static void main(String[] args)
    {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
        Coach trackCoach = context.getBean("trackCoach" , Coach.class);
        System.out.println(trackCoach.getDailyFortune());


        Coach baseballCoach = context.getBean("baseballCoach", Coach.class);
        System.out.println(baseballCoach.getDailyFortune());

        CricketCoach cricketCoach = context.getBean("cricketCoach" , CricketCoach.class);
        System.out.println(cricketCoach.getEmailAddress());
        System.out.println(cricketCoach.getTeam());
        System.out.println(cricketCoach.getUserName());
        System.out.println(cricketCoach.getPassword());
        context.close();
    }
}