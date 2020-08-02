package com.lyn.invocationHandler;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

/**
 * @program: spring
 * @author: lyn
 * * @create: 2020-07-13 23:26
 **/
public class MyInvocationHandler implements InvocationHandler {
	@Override
	public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
		System.out.println("invocationHandler proxy.....");
		System.out.println("proxy object：" + proxy.getClass().getSimpleName());
		System.out.println("target method: " + method.getName());
		return null;
	}
}
