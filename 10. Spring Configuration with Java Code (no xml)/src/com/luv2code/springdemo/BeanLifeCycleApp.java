package com.luv2code.springdemo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class BeanLifeCycleApp
{
    public static void main(String[] args)
    {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
        TrackCoach t1 = context.getBean("trackCoach" , TrackCoach.class);
        TrackCoach t2 = context.getBean("trackCoach" , TrackCoach.class);
        System.out.println(t1.getDailyWorkout());
        System.out.println(t1.getFortune());

        System.out.println(t2.getDailyWorkout());
        System.out.println(t2.getFortune());
        System.out.println(t1 == t2);
        context.close();
    }
}
