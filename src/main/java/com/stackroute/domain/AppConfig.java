package com.stackroute.domain;

import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.*;

@Configuration
@PropertySource("classpath:/values.properties")
public class AppConfig {
    @Bean(name = {"Mahesh","Prabhas"})
    @Scope(value = ConfigurableBeanFactory.SCOPE_PROTOTYPE)
    public Actor Mahesh()
    {
        Actor actor=new Actor();
        return actor;

    }
    @Bean(name={"Srimanthudu","Maharshi"})
    public Movie movieBean()
    {
        Movie movie=new Movie();

        return movie;

    }
}
