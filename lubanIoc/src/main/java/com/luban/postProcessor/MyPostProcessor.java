package com.luban.postProcessor;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanPostProcessor;
import org.springframework.core.PriorityOrdered;
import org.springframework.stereotype.Component;

/**
 * @program: spring
 * @author: lyn
 * * @create: 2020-03-31 00:26
 **/
@Component
public class MyPostProcessor implements BeanPostProcessor, PriorityOrdered {
	@Override
	public Object postProcessBeforeInitialization(Object bean, String beanName) throws BeansException {
		if("indexDao4".equals(beanName))
		System.out.println("1111111111111BeforeInitialization " + beanName);
		return bean;
	}

	@Override
	public Object postProcessAfterInitialization(Object bean, String beanName) throws BeansException {
		if("indexDao4".equals(beanName))
		System.out.println("11111111  AfterInitialization  ");
		return bean;
	}

	@Override
	public int getOrder() {
		return 10;
	}
}
