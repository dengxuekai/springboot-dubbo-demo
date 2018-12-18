package com.dxk.provider.service.impl;

import com.alibaba.dubbo.config.annotation.Service;
import com.dxk.provider.common.service.HelloService;
import org.springframework.stereotype.Component;

/**
 * @author hzdengxuekai
 * @date 2018/12/18 16:12
 */
@Service
@Component
public class HelloServiceImpl implements HelloService {

	@Override
	public String hello(String name) {
		return "Hello " + name + ", i am provider!";
	}
}
