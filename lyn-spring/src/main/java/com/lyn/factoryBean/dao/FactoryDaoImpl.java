package com.lyn.factoryBean.dao;

import org.springframework.stereotype.Component;

import java.lang.reflect.Proxy;

/**
 * @program: spring
 * @author: lyn
 * * @create: 2020-07-12 19:30
 **/
@Component
public class FactoryDaoImpl implements FactoryDao {
	@Override
	public void query() {
//		Proxy.newProxyInstance(this.getClass().getClassLoader(),)

		System.out.println("333333 FactoryDaoImpl.......");
	}
}
