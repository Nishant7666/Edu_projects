package com.cntrllr;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import com.config.sprngcfg;
import com.service.emply;


public class main 
{
	 public static void main(String[] args)
	 {
		 ApplicationContext ctx = new AnnotationConfigApplicationContext(sprngcfg.class);
		 
		 Object em = ctx.getBean("emply");
	 }
}
