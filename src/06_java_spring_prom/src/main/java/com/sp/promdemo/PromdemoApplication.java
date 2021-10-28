package com.sp.promdemo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@EnablePrometheusMetrics
public class PromdemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(PromdemoApplication.class, args);
	}

}
