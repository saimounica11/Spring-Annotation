package com.stackroute;


import com.stackroute.domain.AppConfig;

import com.stackroute.domain.Movie;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;


public class Main {
    public static void main(String[] args) {

        AbstractApplicationContext context=new AnnotationConfigApplicationContext(AppConfig.class);
        context.getBean("Mahesh", Movie.class).act();






    }
}
