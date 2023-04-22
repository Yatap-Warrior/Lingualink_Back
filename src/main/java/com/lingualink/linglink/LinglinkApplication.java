package com.lingualink.linglink;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

@SpringBootApplication
@EnableAspectJAutoProxy
public class LinglinkApplication {

	public static void main(String[] args) {
		SpringApplication.run(LinglinkApplication.class, args);
	}

}
