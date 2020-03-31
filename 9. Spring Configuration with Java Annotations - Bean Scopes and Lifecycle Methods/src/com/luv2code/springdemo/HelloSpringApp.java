
package com.luv2code.springdemo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import javax.sound.midi.Soundbank;

public class HelloSpringApp
{
    public static void main(String[] args)
    {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
        TrackCoach trackCoach = context.getBean("trackCoach" , TrackCoach.class);
        System.out.println(trackCoach.getFortune());


        BaseballCoach baseballCoach = context.getBean("baseballCoach", BaseballCoach.class);
        System.out.println(baseballCoach.getFortune());

        CricketCoach cricketCoach = context.getBean("cricketCoach" , CricketCoach.class);
        System.out.println(cricketCoach.getEmailAddress());
        System.out.println(cricketCoach.getTeam());
        context.close();
    }
}