package com.bar;

import com.bar.model.Bar;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.context.annotation.Bean;
import com.bar.repository.BarRepository;

@SpringBootApplication
@EnableEurekaClient
public class ApiBarApplication {
	public static void main(String ... args){
		SpringApplication.run(ApiBarApplication.class,args);
	}

	@Autowired
	private BarRepository barRepository;

	@Bean
	public CommandLineRunner initData() {
		return args -> {
			Bar bar1 = Bar.builder().name("manhatten").build();
			Bar bar2 = Bar.builder().name("22 club").build();

			barRepository.save(bar1);
			barRepository.save(bar2);
		};
	}
}
