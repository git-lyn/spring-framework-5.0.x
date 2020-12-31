package com.lyn.cycleDependency;

import com.lyn.app.Appcofig;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * @program: spring
 * @author: lyn
 * * @create: 2020-08-21 14:31
 **/
public class TestMain {
	public static void main(String[] args) {
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(Appcofig.class);
		Object testA = context.getBean("testA");
		System.out.println(testA);
	}
}
