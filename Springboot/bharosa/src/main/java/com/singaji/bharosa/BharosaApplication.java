package com.singaji.bharosa;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
// @SpringBootConfiguration
// @EnableAutoConfiguration
// @ComponentScan
public class BharosaApplication {

	public static void main(String[] args) {
		SpringApplication.run(BharosaApplication.class, args);
	}

}
// @Component, @Controller, @RestController, @Service, @Repository, @Configuration
/*
								@Component
	@Controller, @RestController, @Service, @Repository, @Configuration

	
*/


// @ControllerAdvice, @Aspect, @EnableScheduling, @EnableAsync, @EnableCaching, @EnableTransactionManagement, @EnableWebMvc, @EnableWebSecurity, @EnableJpaRepositories, @EnableMongoRepositories, @EnableRedisRepositories