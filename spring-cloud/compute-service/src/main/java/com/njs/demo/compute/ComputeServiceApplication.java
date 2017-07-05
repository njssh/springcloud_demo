package com.njs.demo.compute;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@EnableDiscoveryClient
@SpringBootApplication
//��������ͨ������@EnableDiscoveryClientע�⣬��ע���ܼ���Eureka�е�DiscoveryClientʵ�֣�����ʵ��Controller�жԷ�����Ϣ�������
public class ComputeServiceApplication {
	public static void main(String[] args) {
		new SpringApplicationBuilder(ComputeServiceApplication.class).web(true).run(args);
	}
}