package com.yatra.promo;

import java.io.BufferedReader;
import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.zip.GZIPInputStream;

import javax.annotation.PostConstruct;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

@Component
public class Sample {

	@Autowired
	private PromoDB promoDB;
    
    private int i=0;
    @PostConstruct
    public void nothing() {
    	i=93939;
    }
    public void sys(){
    	System.out.println(i);
    }
    @Scheduled(fixedDelay=3000)
	public void fetchData() {
    	i++;
		System.out.println(promoDB.getPromo());
	}

}
