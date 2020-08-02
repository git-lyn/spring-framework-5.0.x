package com.luban.dao;

import org.springframework.cglib.proxy.MethodInterceptor;
import org.springframework.cglib.proxy.MethodProxy;

import java.lang.reflect.Method;

/**
 * @program: spring
 * @author: lyn
 * * @create: 2020-03-30 13:52
 **/
public class MyMethodInterceptor implements MethodInterceptor {

	@Override
	public Object intercept(Object o, Method method, Object[] objects, MethodProxy methodProxy) throws Throwable {
		System.out.println("执行代理对象>>>>>>>>>>");
		return methodProxy.invokeSuper(o, objects);
	}
}
