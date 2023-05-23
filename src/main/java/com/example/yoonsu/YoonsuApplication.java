package com.example.yoonsu;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;

@SpringBootApplication
@EnableEurekaServer //유레카 서버 역할을 하기위해 서버의 자격으로 등록.
public class YoonsuApplication {

	public static void main(String[] args) {
		SpringApplication.run(YoonsuApplication.class, args);
	}

}
