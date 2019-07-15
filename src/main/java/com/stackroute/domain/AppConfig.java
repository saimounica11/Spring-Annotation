package com.stackroute.domain;

import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.*;

import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.*;

@Configuration
@PropertySource("classpath:/values.properties")
public class AppConfig {
    @Bean
    public BeanPostProcessorDemoBean beanPostProcessorDemoBean()
    {
        return new BeanPostProcessorDemoBean();
    }


    @Bean(name = {"Mahesh","Prabhas"})
    @Scope(value = ConfigurableBeanFactory.SCOPE_PROTOTYPE)
    public Actor Mahesh()
    {
        return new Actor();


    }
    @Bean(name={"Srimanthudu","Maharshi"})
    public Movie movieBean()
    {
        Movie movie=new Movie();

        return movie;

    }
}