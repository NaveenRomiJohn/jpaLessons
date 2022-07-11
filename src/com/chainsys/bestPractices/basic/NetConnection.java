package com.chainsys.bestPractices.basic;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class NetConnection 
{
    public static void main( String[] args )
    {
    	ConfigurableApplicationContext context= SpringApplication.run(NetConnection.class, args);
    	Home h=context.getBean(Home.class);
    	h.connect();
    	
    }
}

