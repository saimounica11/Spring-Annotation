package com.stackroute.domain;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AppConfig {
    @Bean
    public Actor MaheshG()
    {
        Actor actor=new Actor();
        actor.setAge(44);
        actor.setGender("male");
        actor.setName("Mahesh Babu");
        return actor;

    }
    @Bean(name={"Srimanthudu","Maharshi"})
    public Movie movieBean()//bean name is movieBean
    {
        Movie movie=new Movie(MaheshG());
        return movie;

    }
}


