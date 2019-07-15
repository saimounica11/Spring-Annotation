package com.stackroute;


import com.stackroute.domain.Actor;
import com.stackroute.domain.AppConfig;

import com.stackroute.domain.Movie;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;


public class Main {
    public static void main(String[] args) {

        AbstractApplicationContext context=new AnnotationConfigApplicationContext(AppConfig.class);
        context.getBean("Maharshi", Movie.class).show();
        context.getBean("Prabhas",Actor.class).act();





        if(context.getBean("Prabhas",Actor.class)==context.getBean("MaheshG",Actor.class))
        {
            System.out.println("Equal");
        }
        else
        {
            System.out.println("not equal");
        }



    }






    }

