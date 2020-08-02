package com.lyn.beanPostProcessor;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanPostProcessor;
import org.springframework.core.PriorityOrdered;
import org.springframework.stereotype.Component;

/**
 * @program: spring
 * @author: lyn
 * * @create: 2020-07-13 12:22
 **/

/**
 *
 */
//@Component
public class MyBeanpostProcessor implements BeanPostProcessor, PriorityOrdered {
	@Override
	public int getOrder() {
		return 12;
	}

	// bean初始化之前进行处理
	@Override
	public Object postProcessBeforeInitialization(Object bean, String beanName) throws BeansException {
		if ("indexService".equals(beanName)) {
			System.out.println("111postProcessBeforeInitialization111111");
		}
		return bean;
	}
	// bean初始化之后进行处理
	@Override
	public Object postProcessAfterInitialization(Object bean, String beanName) throws BeansException {
		if ("indexService".equals(beanName)) {
			System.out.println("111postProcessAfterInitialization  222222");
		}
		return bean;
	}
}
