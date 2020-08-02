package com.luban.dao;


import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanPostProcessor;

import java.lang.reflect.Proxy;

/**
 * @program: spring
 * @author: lyn
 * * @create: 2020-03-29 20:21
 **/
public class IndexDao5 implements BeanPostProcessor {

	/**
	 * 在初始化之前进行处理
	 * @param bean the new bean instance
	 * @param beanName the name of the bean
	 * @return
	 * @throws BeansException
	 */
	@Override
	public Object postProcessBeforeInitialization(Object bean, String beanName) throws BeansException {
//		Class<Dao>[] clazz = {Dao.class};
		if (beanName.equals("indexDao4")) {
			bean = Proxy.newProxyInstance(this.getClass().getClassLoader(), new Class[]{Dao.class}, new MyInvocationHandle(bean));
		}
		return bean;
	}

	@Override
	public Object postProcessAfterInitialization(Object bean, String beanName) throws BeansException {
		return null;
	}
}
