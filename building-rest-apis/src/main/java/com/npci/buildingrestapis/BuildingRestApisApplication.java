package com.npci.buildingrestapis;

import com.npci.annotations.autowire.MovieRecommenderV2;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
//@ComponentScan(basePackageClasses = {HelloWorldController.class, UserController.class, UserServiceV1.class})
@ComponentScan(basePackages = {"com.npci.controller", "com.npci.service", "com.npci.component"})
public class BuildingRestApisApplication {

	public static void main(String[] args) {

		SpringApplication.run(BuildingRestApisApplication.class, args);

//		var context = SpringApplication.run(BuildingRestApisApplication.class, args);

		//retrive spring bean by class name
//		MovieRecommenderV1 movieRecommenderV1 = context.getBean(MovieRecommenderV1.class);
//		System.out.println(movieRecommenderV1.getMovieRecommendations());

		//retrive spring bean by name
//		movieRecommenderV1 = (MovieRecommenderV1)context.getBean("movieRecommenderV1");
//		System.out.println(movieRecommenderV1.getMovieRecommendations());


		//autowire demo will create obj by itself
//		MovieRecommenderV2 movieRecommenderV2 = (MovieRecommenderV2) context.getBean("movieRecommenderV2");
//		System.out.println(movieRecommenderV2.getMovieRecommendations());

		//qualifier
//		MovieRecommenderV3 movieRecommenderV3 = (MovieRecommenderV3) context.getBean("movieRecommenderV3");
//		System.out.println(movieRecommenderV3.getMovieRecommendations());
	}

}
