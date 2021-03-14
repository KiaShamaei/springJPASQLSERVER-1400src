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
	@Bean(name = "dataSource")
	public DriverManagerDataSource dataSource() {
	    DriverManagerDataSource driverManagerDataSource = new DriverManagerDataSource();
	    driverManagerDataSource.setDriverClassName("oracle.jdbc.driver.OracleDriver");
	    driverManagerDataSource.setUrl("jdbc:oracle:thin:@localhost:1521:xe");
	    driverManagerDataSource.setUsername("ZSS");
	    driverManagerDataSource.setPassword("12");
	    return driverManagerDataSource;
	}

}
