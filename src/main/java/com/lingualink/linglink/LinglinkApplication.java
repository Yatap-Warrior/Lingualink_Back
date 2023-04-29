package com.lingualink.linglink;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.security.servlet.SecurityAutoConfiguration;

import com.ulisesbocchio.jasyptspringboot.annotation.EnableEncryptableProperties;

@EnableEncryptableProperties
@SpringBootApplication(exclude = SecurityAutoConfiguration.class)
public class LinglinkApplication {

	public static void main(String[] args) {
		SpringApplication.run(LinglinkApplication.class, args);
	}
}
