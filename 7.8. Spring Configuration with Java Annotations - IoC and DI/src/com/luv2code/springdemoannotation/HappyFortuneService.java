package com.luv2code.springdemoannotation;

import org.springframework.stereotype.Component;

@Component
public class HappyFortuneService implements FortuneService
{
    @Override
    public String getFortune()
    {
        return  "Happy Fortune Service is Running";
    }
}