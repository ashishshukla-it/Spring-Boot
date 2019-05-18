package com.example.FirstProj;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.Scope;

@SpringBootApplication
// @Scope(value="prototype") <- Use this to change singleton into prototype
public class FirstProjApplication {

	public static void main(String[] args) {
		// When we use singleton, object gets created only once and gets created even when getBean is not called.
		// When we use prototype, object can be created more than once and only when getBean in called.
		// By default, it is singleton
		ConfigurableApplicationContext context=SpringApplication.run(FirstProjApplication.class, args);
		Users u=context.getBean(Users.class);
		u.show();
	}

}
