package com.jdbc.Main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.jdbc.Model.StdntMdl;
import com.jdbc.cofig.SprngCfg;

public class Main 
{

	public static void main(String[] args) 
	{
		 ApplicationContext ctx = new AnnotationConfigApplicationContext(SprngCfg.class);
		 StdntMdl mdl = ctx.getBean(StdntMdl.class);
		 mdl.save("Shubz","shubz420@gmail.com",242342321);
	}

}
