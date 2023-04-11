package com.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import com.cntrllr.cntrllr;

@ComponentScan(basePackages = {"com"})
@Configuration
public class sprngcfg
{
	@Bean(name="dbconn")
	public cntrllr getconnection()
	{
		cntrllr db = new cntrllr("URL","pass","User");
		
		
		return db;
	}
}	
