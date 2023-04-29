package com.lingualink.linglink;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.ulisesbocchio.jasyptspringboot.annotation.EnableEncryptableProperties;

@EnableEncryptableProperties
@SpringBootApplication
public class LinglinkApplication {

	public static void main(String[] args) {
		SpringApplication.run(LinglinkApplication.class, args);
	}
}
