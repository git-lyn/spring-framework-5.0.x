package com.lyn.cglibFull;


import org.springframework.cglib.proxy.MethodInterceptor;
import org.springframework.cglib.proxy.MethodProxy;

import java.lang.reflect.Method;

/**
 * @program: spring
 * @author: lyn
 * * @create: 2020-12-05 22:51
 **/
public class ClimbInterceptor implements MethodInterceptor {
	@Override
	public Object intercept(Object o, Method method, Object[] objects, MethodProxy methodProxy) throws Throwable {
		System.out.println("执行cglib的代理");
		return methodProxy.invokeSuper(o,objects);
	}
}
