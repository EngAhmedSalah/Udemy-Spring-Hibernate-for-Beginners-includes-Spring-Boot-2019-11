
package com.luv2code.springdemoannotation;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class HelloSpringApp
{
    public static void main(String[] args)
    {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
        TrackCoach  trackCoach = context.getBean("trackCoach" , TrackCoach.class);
        TennisCoach tennisCoach = context.getBean("tennisCoach" , TennisCoach.class);
        BasketballCoach basketballCoach = context.getBean("basketballCoach" , BasketballCoach.class);
        FootballCoach footballCoach = context.getBean("footballCoach" , FootballCoach.class);
        SwimCoach swimCoach = context.getBean("swimCoach" , SwimCoach.class);

        System.out.print(trackCoach.getDailyWorkout() + "  ");
        System.out.println(trackCoach.getDailyFortune());

        System.out.print(tennisCoach.getDailyWorkout() + "  ");
        System.out.println(tennisCoach.getDailyFortune());

        System.out.print(footballCoach.getDailyWorkout() + "  ");
        System.out.println(footballCoach.getDailyFortune());

        System.out.print(basketballCoach.getDailyWorkout() + "  ");
        System.out.println(basketballCoach.getDailyFortune());

        System.out.print(swimCoach.getDailyWorkout() + "  ");
        System.out.println(swimCoach.getDailyFortune());
        context.close();
    }
}