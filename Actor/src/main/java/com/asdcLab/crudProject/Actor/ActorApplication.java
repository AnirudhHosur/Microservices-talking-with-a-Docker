package com.asdcLab.crudProject.Actor;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;

@SpringBootApplication(exclude = {DataSourceAutoConfiguration.class })
public class ActorApplication {

	public static void main(String[] args) {
		SpringApplication.run(ActorApplication.class, args);
	}

}
