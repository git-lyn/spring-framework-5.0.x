package com.lyn.aop.service;

import com.lyn.app.Appcofig;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * @program: spring
 * @author: lyn
 * * @create: 2020-12-13 15:56
 **/
public class AopMainDemo {
	public static void main(String[] args) {
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(Appcofig.class);
		MyService bean = (MyService) context.getBean("aopService");
		bean.query();
	}
}
