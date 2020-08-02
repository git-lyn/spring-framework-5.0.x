package com.luban.postProcessor;

import com.luban.dao.Dao;
import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanPostProcessor;
import org.springframework.core.PriorityOrdered;
import org.springframework.stereotype.Component;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

/**
 * @program: spring
 * @author: lyn
 * * @create: 2020-03-31 00:26
 **/
@Component
public class MyPostProcessor2 implements BeanPostProcessor, PriorityOrdered, InvocationHandler {
	@Override
	public Object postProcessBeforeInitialization(Object bean, String beanName) throws BeansException {
		if ("indexDao4".equals(beanName)) {
			System.out.println("22222222222BeforeInitialization " + beanName);
			// 使用动态代理的方式，进行模拟AOP
			bean = Proxy.newProxyInstance(this.getClass().getClassLoader(), new Class[]{Dao.class}, this);
		}
		return bean;
	}

	@Override
	public Object postProcessAfterInitialization(Object bean, String beanName) throws BeansException {
		if ("indexDao4".equals(beanName)) {
			System.out.println("222222222 AfterInitialization  ");
		}
		return bean;
	}

	@Override
	public int getOrder() {
		return 1;
	}

	@Override
	public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
		System.out.println("2222222动态代理BeanPostProcessor");
		method.invoke(proxy, args);
		System.out.println("2222222动态代理BeanPostProcessor");
		return proxy;
	}
}
