package com.luban.test;

import com.luban.app.Appconfig;
import com.luban.service.UserService;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * @program: spring
 * @author: lyn
 * * @create: 2020-03-30 17:30
 **/
public class ServiceDemo {
	public static void main(String[] args) {
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(Appconfig.class);
		Appconfig bean = context.getBean(Appconfig.class);
		System.out.println(context.getBean(UserService.class));
	}
}
