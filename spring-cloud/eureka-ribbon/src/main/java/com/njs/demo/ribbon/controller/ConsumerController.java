package com.njs.demo.ribbon.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.njs.demo.ribbon.service.ComputeService;

@RestController
// 创建ConsumerController来消费COMPUTE-SERVICE的add服务。通过直接RestTemplate来调用服务
public class ConsumerController {
	@Autowired
	ComputeService computeService ;

	@RequestMapping(value = "/add", method = RequestMethod.GET)
	public String add() {
		return computeService.addService();
	}
}
