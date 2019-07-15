package com.stackroute;


import com.stackroute.domain.Actor;
import com.stackroute.domain.AppConfig;
import com.stackroute.domain.Movie;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;

public class Main {
    public static void main(String[] args) {
        Object ob;

        AbstractApplicationContext context=new AnnotationConfigApplicationContext(AppConfig.class);
        context.getBean("DJ", Movie.class).show();
        context.getBean("Prabhas",Actor.class).act();


        context.getBean("beanLifecycleDemo");


        if(context.getBean("Prabhas",Actor.class)==context.getBean("Allu",Actor.class))
        {
            System.out.println("Equal");
        }
        else
        {
            System.out.println("not equal");
        }

        context.registerShutdownHook();





    }
}