package com.lyn.importBeanDefinicationRegistrar;

import com.lyn.dao.DataDao;
import com.lyn.invocationHandler.MyInvocationHandler;
import org.springframework.beans.factory.support.BeanDefinitionBuilder;
import org.springframework.beans.factory.support.BeanDefinitionRegistry;
import org.springframework.beans.factory.support.GenericBeanDefinition;
import org.springframework.context.annotation.ImportBeanDefinitionRegistrar;
import org.springframework.core.type.AnnotationMetadata;
import org.springframework.stereotype.Component;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

/**
 * @program: spring
 * @author: lyn
 * * @create: 2020-07-13 23:22
 **/
// ImportBeanDefinicationRegistrar 可以将一个类放入到bdMap中
public class MyImportBeanDefinicationRegistrar implements ImportBeanDefinitionRegistrar {
	@Override
	public void registerBeanDefinitions(AnnotationMetadata importingClassMetadata, BeanDefinitionRegistry registry) {
		//Class[] clzz = new Class[]{DataDao.class};
		//DataDao dataDao = (DataDao) Proxy.newProxyInstance(this.getClass().getClassLoader(), clzz, new MyInvocationHandler());
		String name = "aaaa";
		System.out.println("MyImportBeanDefinicationRegistrar 添加bd到factory");

		BeanDefinitionBuilder builder = BeanDefinitionBuilder.genericBeanDefinition(DataDao.class);
		GenericBeanDefinition beanDefinition = (GenericBeanDefinition) builder.getBeanDefinition();

		System.out.println("beanClassName: " + beanDefinition.getBeanClassName());

		// 为代理对象添加构造器, 通过dataDao找到对应的Class类型
		beanDefinition.getConstructorArgumentValues().addGenericArgumentValue(beanDefinition.getBeanClassName());
		registry.registerBeanDefinition("dataDao",beanDefinition);
		beanDefinition.setBeanClass(ImportFactoryBean.class);
		//registry.registerBeanDefinition(name,beanDefinitio);
	}


}
