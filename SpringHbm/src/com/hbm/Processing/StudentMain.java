package com.hbm.Processing;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.hbm.DataTransferObjects.StudentInfo;
import com.hbm.Model.Repository;
import com.hbm.SpringConfiguration.SpringConfiguration;

public class StudentMain 
{

	public static void main(String[] args) 
	{
		ApplicationContext ctx = new AnnotationConfigApplicationContext(SpringConfiguration.class);
		 
		Repository r = ctx.getBean(Repository.class);
		StudentInfo sf = new StudentInfo();
		sf.setName("sudehs");
		sf.setEmail("sudesh@gmail.com");
		r.save(sf);

	}

}
