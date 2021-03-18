package com.jpa.testjpa;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.jdbc.datasource.DriverManagerDataSource;

@SpringBootApplication
public class TestjpaApplication {

	public static void main(String[] args) {
		SpringApplication.run(TestjpaApplication.class, args);
	}
//	@Bean(name = "dataSource")
//	public DriverManagerDataSource dataSource() {
//	    DriverManagerDataSource driverManagerDataSource = new DriverManagerDataSource();
//	    driverManagerDataSource.setDriverClassName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
//	    driverManagerDataSource.setUrl("jdbc:sqlserver://localhost;databaseName=test");
//	    driverManagerDataSource.setUsername("sa");
//	    driverManagerDataSource.setPassword("kia852147154@KM");
//	    return driverManagerDataSource;
//	}

}
