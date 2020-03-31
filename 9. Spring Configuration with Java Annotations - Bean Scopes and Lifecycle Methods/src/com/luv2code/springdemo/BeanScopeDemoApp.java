package com.luv2code.springdemo;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.support.ClassPathXmlApplicationContext;

@ComponentScan
public class BeanScopeDemoApp
{
    public static void main(String[] args)
    {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
        TrackCoach theCoach = context.getBean("trackCoach" , TrackCoach.class);
        TrackCoach thealphaCoach = context.getBean("trackCoach" , TrackCoach.class);
        boolean result = (thealphaCoach == theCoach);
        System.out.println("result is = " + (boolean)(result));
        System.out.println("thealpa coach = " + thealphaCoach);
        System.out.println("thealpa coach = " + theCoach);
        context.close();
    }

}
