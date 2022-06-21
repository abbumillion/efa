package com.app.efa;

import com.app.efa.Entity.Admin;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class EfaWebAppApplication {
	// entry to our application
	public static void main(String[] args) {
		SpringApplication.run(EfaWebAppApplication.class, args);
		//Admin.builder.build();
	}
}
