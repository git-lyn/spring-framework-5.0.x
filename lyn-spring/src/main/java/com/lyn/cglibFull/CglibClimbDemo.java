package com.lyn.cglibFull;

import org.springframework.cglib.proxy.Enhancer;

/**
 * @program: spring
 * @author: lyn
 * * @create: 2020-12-05 22:32
 **/
public class CglibClimbDemo {
	public static void main(String[] args) {
		// 采用cglib的方式，进行代理对象
		Enhancer enhancer = new Enhancer();
		enhancer.setSuperclass(Climb.class);
		enhancer.setCallback(new ClimbInterceptor());
		enhancer.setUseFactory(false);
		enhancer.setCallbackType(ClimbInterceptor.class);
		Climb climb = (Climb) enhancer.create();
		climb.a();
		climb.b();
		climb.dog();

	}

/*
Enhancer enhancer = new Enhancer();
	//增强父类，地球人都知道cglib是基于继承来的
		enhancer.setSuperclass(configSuperClass);
	//增强接口，为什么要增强接口?
	//便于判断，表示一个类以及被增强了
		enhancer.setInterfaces(new Class<?>[] {EnhancedConfiguration.class});
	//不继承Factory接口
		enhancer.setUseFactory(false);
		enhancer.setNamingPolicy(SpringNamingPolicy.INSTANCE);
	// BeanFactoryAwareGeneratorStrategy是一个生成策略
	// 主要为生成的CGLIB类中添加成员变量$$beanFactory
	// 同时基于接口EnhancedConfiguration的父接口BeanFactoryAware中的setBeanFactory方法，
	// 设置此变量的值为当前Context中的beanFactory,这样一来我们这个cglib代理的对象就有了beanFactory
	//有了factory就能获得对象，而不用去通过方法获得对象了，因为通过方法获得对象不能控制器过程
	//该BeanFactory的作用是在this调用时拦截该调用，并直接在beanFactory中获得目标bean
		enhancer.setStrategy(new BeanFactoryAwareGeneratorStrategy(classLoader));
	//过滤方法，不能每次都去new
		enhancer.setCallbackFilter(CALLBACK_FILTER);
		enhancer.setCallbackTypes(CALLBACK_FILTER.getCallbackTypes());

		*/
}
