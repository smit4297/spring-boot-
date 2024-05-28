package com.npci.buildingrestapis;

import com.npci.controller.HelloWorldController;
import com.npci.controller.UserController;
import com.npci.service.UserServiceV1;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
//@ComponentScan(basePackageClasses = {HelloWorldController.class, UserController.class, UserServiceV1.class})
@ComponentScan(basePackages = {"com.npci.controller", "com.npci.service"})
public class BuildingRestApisApplication {

	public static void main(String[] args) {

		SpringApplication.run(BuildingRestApisApplication.class, args);
	}

}
