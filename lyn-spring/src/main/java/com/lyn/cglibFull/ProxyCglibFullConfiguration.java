package com.lyn.cglibFull;

/**
 * @program: spring
 * @author: lyn
 * * @create: 2020-07-14 22:19
 **/

import com.lyn.dao.CgDao;
import org.springframework.cglib.core.SpringNamingPolicy;
import org.springframework.cglib.proxy.Enhancer;

/**
 * cglib代理 进行处理
 */
public class ProxyCglibFullConfiguration {
	public static void main(String[] args) {
		Enhancer enhancer = new Enhancer();
		//增强父类，地球人都知道cglib是基于继承来的
		enhancer.setSuperclass(CgDao.class);
		//增强接口，为什么要增强接口?
		//便于判断，表示一个类以及被增强了
		//enhancer.setInterfaces(new Class<?>[] {ConfigurationClassEnhancer.EnhancedConfiguration.class});
		//不继承Factory接口
		enhancer.setUseFactory(false);
		enhancer.setNamingPolicy(SpringNamingPolicy.INSTANCE);
		// BeanFactoryAwareGeneratorStrategy是一个生成策略
		// 主要为生成的CGLIB类中添加成员变量$$beanFactory
		// 同时基于接口EnhancedConfiguration的父接口BeanFactoryAware中的setBeanFactory方法，
		// 设置此变量的值为当前Context中的beanFactory,这样一来我们这个cglib代理的对象就有了beanFactory
		//有了factory就能获得对象，而不用去通过方法获得对象了，因为通过方法获得对象不能控制器过程
		//该BeanFactory的作用是在this调用时拦截该调用，并直接在beanFactory中获得目标bean
		//enhancer.setStrategy(new ConfigurationClassEnhancer.BeanFactoryAwareGeneratorStrategy(classLoader));
		//过滤方法，不能每次都去new
		//enhancer.setCallbackFilter(new MyMethodCallback());
		//enhancer.setCallbackTypes(CALLBACK_FILTER.getCallbackTypes());

		enhancer.setCallback(new MyMethodCallback());
		CgDao  res = (CgDao) enhancer.create();
		System.out.println(res);
		res.query();
	}
}
