package com.hns2t.QuanLyQuanNhau_server;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.security.servlet.SecurityAutoConfiguration;

@SpringBootApplication(exclude = {SecurityAutoConfiguration.class })
public class QuanLyQuanNhauServerApplication {

	public static void main(String[] args) {
		SpringApplication.run(QuanLyQuanNhauServerApplication.class, args);
	}

}
