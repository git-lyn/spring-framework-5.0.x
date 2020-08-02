package com.lyn.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @program: spring
 * @author: lyn
 * * @create: 2020-07-28 19:41
 **/
@Controller
public class TestController {

	@RequestMapping("/test")
	public String test(){
		System.out.println("testt controller1111111");
		return "test";
	}

}
