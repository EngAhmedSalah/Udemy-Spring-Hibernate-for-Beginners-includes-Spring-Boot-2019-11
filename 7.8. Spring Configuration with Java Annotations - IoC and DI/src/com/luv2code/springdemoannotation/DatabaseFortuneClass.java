package com.luv2code.springdemoannotation;

import org.springframework.stereotype.Component;

@Component
public class DatabaseFortuneClass implements FortuneService
{
    @Override
    public String getFortune()
    {
        return "Database Fortune Service is Running";
    }
}
