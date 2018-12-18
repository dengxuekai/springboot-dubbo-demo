package com.dxk.consumer.service.controller;

import com.alibaba.dubbo.config.annotation.Reference;
import com.dxk.provider.common.service.HelloService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author hzdengxuekai
 * @date 2018/12/18 16:51
 */
@Slf4j
@RestController
public class TestController {

	@Reference(application = "${dubbo.application.id}", registry = "${dubbo.registry.id}", version = "")
	private HelloService helloService;

	@GetMapping("test")
	public String hello(String name) {
		log.info("here , name :{}", name);
		return helloService.hello(name);
	}
}
