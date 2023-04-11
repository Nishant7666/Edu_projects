package com.hbm.SpringConfiguration;

import java.util.Properties;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.datasource.DriverManagerDataSource;
import org.springframework.orm.hibernate5.HibernateTemplate;
import org.springframework.orm.hibernate5.HibernateTransactionManager;
import org.springframework.orm.hibernate5.LocalSessionFactoryBean;
import org.springframework.transaction.annotation.EnableTransactionManagement;

@EnableTransactionManagement
@ComponentScan(basePackages = {"com.hbm"})
@Configuration
public class SpringConfiguration 
{
	@Bean
	public DriverManagerDataSource getDataSource ()
	{
		DriverManagerDataSource ds = new DriverManagerDataSource();
		ds.setDriverClassName("oracle.jdbc.driver.OracleDriver");
		ds.setUrl("jdbc:oracle:thin:@localhost:1521:xe");
		ds.setUsername("system");
		ds.setPassword("772250");
		
		return ds;	
	}
	
	@Bean
	public LocalSessionFactoryBean getSessionFactory()
	{
		LocalSessionFactoryBean sf = new LocalSessionFactoryBean();
		sf.setDataSource(getDataSource());
		Properties prop = new Properties();
		prop.put("hibernate.dialect","org.hibernate.dialect.OracleDialect");
		prop.put("hibernate.hbm2ddl.auto", "update");
		prop.put("hibernate.show_sql", "True");
		sf.setHibernateProperties(prop);
		sf.setPackagesToScan("com.hbm.StudentInfo");
		
		return sf;
	}
	
	@Bean
	public HibernateTemplate getTemplate ()
	{
		HibernateTemplate temp = new HibernateTemplate();
		temp.setSessionFactory(getSessionFactory().getObject());
				
		return temp;
	}
	
	@Bean
	public HibernateTransactionManager getTransactionManager()
	{
		HibernateTransactionManager tx = new HibernateTransactionManager();
		tx.setSessionFactory(getSessionFactory().getObject());
		
		return tx;
	}
	
}
