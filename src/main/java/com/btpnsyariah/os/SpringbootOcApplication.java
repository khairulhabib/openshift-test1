package com.btpnsyariah.os;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.support.SpringBootServletInitializer;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@ComponentScan
@EnableAutoConfiguration
public class SpringbootOcApplication extends SpringBootServletInitializer {

	private static Class<SpringbootOcApplication> applicationClass = SpringbootOcApplication.class;

	public static void main(String[] args) {
		SpringApplication.run(applicationClass, args);
	}

	@Override
	protected SpringApplicationBuilder configure(SpringApplicationBuilder applicationBuilder){
		return applicationBuilder.sources(applicationClass);
	}

}
