package com.SpringLearn.springcoredemo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/*@SpringBootApplication(
		//ovdje eksplicitno dodaje package koje treba skenirati i pretvoriti u beanove
		scanBasePackages = {"com.SpringLearn.springcoredemo",
							"com.SpringLearn.util"})
 */
@SpringBootApplication
public class SpringcoredemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringcoredemoApplication.class, args);
	}

}
