package com.osp.gate;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.feign.EnableFeignClients;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * 2017/09/05
 * @author fly
 *
 */

@SpringBootApplication
//@EnableDiscoveryClient
//@EnableFeignClients
@EnableZuulProxy
public class OspGate {
	
	public static void main(String[] args) {
		SpringApplication.run(OspGate.class, args);
	}
	
}
