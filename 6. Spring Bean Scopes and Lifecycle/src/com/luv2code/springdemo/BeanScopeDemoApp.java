package com.luv2code.springdemo;

import com.luv2code.springdemo.BaseballCoach;
import com.luv2code.springdemo.Coach;
import com.luv2code.springdemo.TrackCoach;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class BeanScopeDemoApp
{
    public static void main(String[] args)
    {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("BeanScope-applicationContext.xml");
        TrackCoach theCoach = context.getBean("trackCoach" , TrackCoach.class);
        TrackCoach thealphCoach = context.getBean("trackCoach" , TrackCoach.class);
        boolean result = (thealphCoach == theCoach);
        System.out.println("result is = " + (boolean)(result));
        System.out.println("thealpa coach = " + thealphCoach);
        System.out.println("theCoach coach = " + theCoach);
        context.close();
    }

}
