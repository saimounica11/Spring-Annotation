package com.stackroute.domain;

import org.springframework.beans.factory.BeanNameAware;
import org.springframework.context.ApplicationContext;
import org.springframework.stereotype.Component;

public class Movie {


    Actor actor;
    String nameOfBean;
    private ApplicationContext applicationContext;
    public Movie(){}
    public void show(){
        System.out.println("movie");
    }

    public Movie(Actor actor) {
        this.actor = actor;
    }

    public void act()
    {
        actor.act();
    }

    public Movie setActor(Actor actor) {
        this.actor = actor;
        return this;
    }

    public void setBeanName(String s) {
        nameOfBean=s;

    }

}