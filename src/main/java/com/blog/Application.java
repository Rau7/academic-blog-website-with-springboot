package com.blog;
import java.io.File;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.blog.controllers.AdminController;


@SpringBootApplication
public class Application {
	public static void main(String[] args) {
		new File(AdminController.uploadDirectory).mkdir();
		SpringApplication.run(Application.class, args);
	}
}
