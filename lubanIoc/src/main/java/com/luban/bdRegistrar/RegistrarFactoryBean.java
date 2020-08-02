package com.luban.bdRegistrar;

import org.springframework.beans.factory.FactoryBean;
import org.springframework.stereotype.Component;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

/**
 * @program: spring
 * @author: lyn
 * * @create: 2020-03-30 22:30
 **/
//@Component
public class RegistrarFactoryBean implements FactoryBean, InvocationHandler
{
	private Class clazzs = null;

	public RegistrarFactoryBean(Class clazz) {
		this.clazzs = clazz;
	}

	@Override
	public Object getObject() throws Exception {
//		Class[] clazz = {RegistrarDao.class};
		Class[] clazz = {clazzs};
		RegistrarDao dao = (RegistrarDao) Proxy.newProxyInstance(this.getClass().getClassLoader(), clazz, this);
		return dao;
	}

	@Override
	public Class<?> getObjectType() {
		return clazzs;
	}

	@Override
	public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
		System.out.println("@@@@@@@@进行动态代理: 根据传入的参数进行相应的处理");
		return null;
	}
}
