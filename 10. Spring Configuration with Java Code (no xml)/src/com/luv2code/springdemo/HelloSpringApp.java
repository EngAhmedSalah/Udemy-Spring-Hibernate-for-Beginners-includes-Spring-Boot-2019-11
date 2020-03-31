
package com.luv2code.springdemo;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import javax.sound.midi.Soundbank;
import java.lang.reflect.AnnotatedArrayType;

public class HelloSpringApp
{
    public static void main(String[] args)
    {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(SportingConfig.class);
        TrackCoach trackCoach = context.getBean("trackCoach" , TrackCoach.class);
        System.out.println(trackCoach.getFortune());
        System.out.println(trackCoach.getDailyWorkout());
        System.out.println(trackCoach.getUsername());
        System.out.println(trackCoach.getTeam());
    }
}