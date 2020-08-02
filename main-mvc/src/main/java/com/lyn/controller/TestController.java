package com.lyn.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @program: spring
 * @author: lyn
 * * @create: 2020-07-28 17:15
 **/
@Controller
public class TestController {

	@RequestMapping("/test")
	public String test(){
		System.out.println("teste controller......");
		// 请求转发到test.html 页面
		return "test";
	}
}
