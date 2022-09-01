package com.anushtadevosyan.ToDoList;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@ComponentScan(basePackages = "com.anushtadevosyan")
@EntityScan(basePackages = "com.anushtadevosyan.ToDoList.entity")
@EnableJpaRepositories(basePackages = "com.anushtadevosyan.ToDoList.repository")
public class ToDoListApplication {

	public static void main(String[] args) {
		SpringApplication.run(ToDoListApplication.class, args);
	}

}
