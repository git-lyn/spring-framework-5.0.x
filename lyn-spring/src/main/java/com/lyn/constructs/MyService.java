package com.lyn.constructs;

import org.springframework.stereotype.Component;

/**
 * @program: spring
 * @author: lyn
 * * @create: 2020-07-17 20:32
 **/
@Component
public class MyService {

	public MyService(){
		System.out.println("无参数构造器");
	}

	public MyService(HelloService helloService) {
		System.out.println("有一个参数的构造器");
	}

	public void query(){
		System.out.println("query  MyService....");
	}

}
