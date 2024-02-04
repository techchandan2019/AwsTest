package com.neosoft;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.EnableAspectJAutoProxy;
import org.springframework.context.annotation.PropertySource;

@SpringBootApplication
//@PropertySource("ckp.properties")
public class BootProjL2123Application {

	public static void main(String[] args) {
		SpringApplication.run(BootProjL2123Application.class, args);
	}

}
