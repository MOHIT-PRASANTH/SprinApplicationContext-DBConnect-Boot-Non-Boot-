package com.yatra.promo;
import java.io.IOException;
import java.sql.SQLException;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.scheduling.annotation.EnableScheduling;
 
//@SpringBootApplication
//@EnableScheduling
public class AppStart {
    public static void main(String[] args) throws ClassNotFoundException, SQLException, IOException, InterruptedException {
    	ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("classpath:applicationContext.xml");
//    	ConfigurableApplicationContext appcon = SpringApplication.run(AppStart.class, args);
    }
}