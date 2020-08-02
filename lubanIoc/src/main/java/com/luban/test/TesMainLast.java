package com.luban.test;

import com.luban.dao.*;
import org.springframework.cglib.core.SpringNamingPolicy;
import org.springframework.cglib.proxy.Enhancer;
import org.springframework.cglib.proxy.MethodInterceptor;
import org.springframework.context.annotation.EnableAspectJAutoProxy;
//import org.springframework.context.annotation.ConfigurationClassEnhancer;
//import org.springframework.context.annotation.ConfigurationClassEnhancer;

import java.lang.reflect.Proxy;


/**
 * @program: spring
 * @author: lyn
 * * @create: 2020-03-29 21:19
 **/
//@EnableAspectJAutoProxy
public class TesMainLast {
	public static void main(String[] args) {
		/*Dao o2 = (Dao) Proxy.newProxyInstance(TesMainLast.class.getClass().getClassLoader(), new Class[]{Dao.class}, new MyInvocationHandle(new IndexDao4()));
		o2.query();

		Enhancer enhancer = new Enhancer();
		//增强父类，地球人都知道cglib是基于继承来的
		enhancer.setSuperclass(IndexDao1.class);
		//增强接口，为什么要增强接口?
		//便于判断，表示一个类以及被增强了
		//不继承Factory接口
		enhancer.setUseFactory(false);
		enhancer.setNamingPolicy(SpringNamingPolicy.INSTANCE);
		// BeanFactoryAwareGeneratorStrategy是一个生成策略
		// 主要为生成的CGLIB类中添加成员变量$$beanFactory
		// 同时基于接口EnhancedConfiguration的父接口BeanFactoryAware中的setBeanFactory方法，
		// 设置此变量的值为当前Context中的beanFactory,这样一来我们这个cglib代理的对象就有了beanFactory
		//有了factory就能获得对象，而不用去通过方法获得对象了，因为通过方法获得对象不能控制器过程
		//该BeanFactory的作用是在this调用时拦截该调用，并直接在beanFactory中获得目标bean
//		enhancer.setStrategy(new ConfigurationClassEnhancer.BeanFactoryAwareGeneratorStrategy(TesMainLast.class.getClassLoader()));
		//过滤方法，不能每次都去new
//		enhancer.setCallbackFilter(CALLBACK_FILTER);
//		enhancer.setCallbackTypes(CALLBACK_FILTER.getCallbackTypes());
		enhancer.setNamingPolicy(SpringNamingPolicy.INSTANCE);
		enhancer.setCallback(new MyMethodInterceptor());
		IndexDao1 o = (IndexDao1) enhancer.create();
		o.query();*/

	}
}
