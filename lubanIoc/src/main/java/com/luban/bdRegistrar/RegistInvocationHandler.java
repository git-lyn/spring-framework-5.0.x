package com.luban.bdRegistrar;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

/**
 * @program: spring
 * @author: lyn
 * * @create: 2020-03-30 22:17
 **/
public class RegistInvocationHandler implements InvocationHandler {
	@Override
	public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
		System.out.println("MyBeanDefinitionRegistrar  动态代理.......... ");
		return null;
	}
}
