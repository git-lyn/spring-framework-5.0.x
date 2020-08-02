package com.luban.dao;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

/**
 * @program: spring
 * @author: lyn
 * * @create: 2020-03-29 20:11
 **/
public class MyInvocationHandle implements InvocationHandler {
	private Object target;

	public MyInvocationHandle(Object target) {
		this.target = target;
	}

	@Override
	public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
		System.out.println("进行动态代理&&&&&&&&&&&&&&&");
		return method.invoke(target,args);
	}
}
