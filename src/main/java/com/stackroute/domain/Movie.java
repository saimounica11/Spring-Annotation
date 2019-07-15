package com.stackroute.domain;

import org.springframework.beans.factory.BeanNameAware;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.ApplicationContext;
import org.springframework.stereotype.Component;

public class Movie {



    @Autowired
    Actor actor;
    @Value("${movie.name}")
    String nameOfBean;
    private ApplicationContext applicationContext;
    public Movie(){}
    public void show(){

        System.out.println(" movie");
        actor.act();
    }


}