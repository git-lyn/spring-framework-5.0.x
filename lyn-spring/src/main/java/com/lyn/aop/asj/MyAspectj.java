package com.lyn.aop.asj;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

/**
 * @program: spring
 * @author: lyn
 * * @create: 2020-07-11 16:32
 **/
// 声明一个切面
@Component
@Aspect
public class MyAspectj {

	// 声明一个切点
	@Pointcut("execution(* com.lyn.aop.service.*.*(..))")
	public void myPointcut(){

	}

	// 设置一个通知
	@Before(value = "myPointcut()")
	public void before(){
		System.out.println("before.....");
	}

}


