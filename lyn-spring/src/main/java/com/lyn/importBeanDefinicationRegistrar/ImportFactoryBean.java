package com.lyn.importBeanDefinicationRegistrar;

import com.lyn.dao.DataDao;
import org.apache.ibatis.annotations.Select;
import org.springframework.beans.factory.FactoryBean;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

/**
 * @program: spring
 * @author: lyn
 * * @create: 2020-07-14 13:42
 **/
public class ImportFactoryBean implements FactoryBean, InvocationHandler {
	Class zz;
	// 通过构造器添加target对象类型
	public ImportFactoryBean(Class clazz) {
		zz = clazz;
	}

	@Override
	public Object getObject() throws Exception {
		//Class[] clazz = new Class[]{DataDao.class};
		Class[] clazz = new Class[]{zz};
		System.out.println("代理对象的处理");
		Object res = Proxy.newProxyInstance(ImportFactoryBean.class.getClassLoader(), clazz,this);
		return res;
	}

	@Override
	public Class<?> getObjectType() {
		return zz;
	}

	@Override
	public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
		System.out.println("import invocationHandler....");
		/**
		 * 获取mybatis的注解sql查询的内容
		 */
		// 获取target对象
		Class<?> targetObject = proxy.getClass().getInterfaces()[0];
		// 获取对应的方法
		Method targetMethod = targetObject.getMethod(method.getName(), String.class);
		Select select = targetMethod.getAnnotation(Select.class);
		String s = select.value()[0];
		System.out.println("#####: " + s);
		return null;
	}
}
