package com.lyn.factoryBean.dao;

import org.springframework.stereotype.Component;

/**
 * @program: spring
 * @author: lyn
 * * @create: 2020-07-12 19:30
 **/
@Component
public class FactoryDaoImpl implements FactoryDao {
	@Override
	public void query() {
		System.out.println("333333 FactoryDaoImpl.......");
	}
}
