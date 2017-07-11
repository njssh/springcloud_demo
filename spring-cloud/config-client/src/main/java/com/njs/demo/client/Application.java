package com.njs.demo.client;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
//增加@EnableDiscoveryClient注解，用来发现config-server服务，利用其来加载应用配置
@EnableDiscoveryClient
public class Application {
	public static void main(String[] args) {
		new SpringApplicationBuilder(Application.class).web(true).run(args);
	}
}