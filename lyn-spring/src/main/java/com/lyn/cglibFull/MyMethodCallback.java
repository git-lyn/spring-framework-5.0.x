package com.lyn.cglibFull;


import org.springframework.cglib.proxy.MethodInterceptor;
import org.springframework.cglib.proxy.MethodProxy;

import java.lang.reflect.Method;

/**
 * @program: spring
 * @author: lyn
 * * @create: 2020-07-14 22:24
 **/
public class MyMethodCallback implements MethodInterceptor {

	@Override
	public Object intercept(Object o, Method method, Object[] objects, MethodProxy methodProxy) throws Throwable {
		System.out.println("method interceptor ....");
		return methodProxy.invokeSuper(o, objects);
		//return null;
	}
}
