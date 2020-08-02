package com.luban.bdRegistrar;

import com.luban.dao.MyInvocationHandle;
import org.springframework.beans.factory.support.AbstractBeanDefinition;
import org.springframework.beans.factory.support.BeanDefinitionBuilder;
import org.springframework.beans.factory.support.BeanDefinitionRegistry;
import org.springframework.beans.factory.support.GenericBeanDefinition;
import org.springframework.context.annotation.ImportBeanDefinitionRegistrar;
import org.springframework.core.type.AnnotationMetadata;

import java.lang.reflect.Proxy;

public class MyBeanDefinitionRegistrar implements ImportBeanDefinitionRegistrar {
	@Override
	public void registerBeanDefinitions(AnnotationMetadata importingClassMetadata, BeanDefinitionRegistry registry) {
		System.out.println("进行手动将bean放进facotry....");
//		RegistrarDao daos = (RegistrarDao) Proxy.newProxyInstance(MyBeanDefinitionRegistrar.class.getClassLoader(), new Class[]{RegistrarDao.class}, new RegistInvocationHandler());
//		BeanDefinitionBuilder builder = BeanDefinitionBuilder.genericBeanDefinition(daos.getClass());
//		GenericBeanDefinition beanDefinition = (GenericBeanDefinition) builder.getBeanDefinition();
//		registry.registerBeanDefinition("registDao",beanDefinition);

		BeanDefinitionBuilder builder = BeanDefinitionBuilder.genericBeanDefinition(RegistrarDao.class);
		GenericBeanDefinition beanDefinition = (GenericBeanDefinition) builder.getBeanDefinition();
		System.out.println("$$$$$$$$$$$$: " + beanDefinition.getBeanClassName());
		// 对setBeanClass 的构造器添加参数
		beanDefinition.getConstructorArgumentValues().addGenericArgumentValue(beanDefinition.getBeanClassName());
		beanDefinition.setBeanClass(RegistrarFactoryBean.class);
		registry.registerBeanDefinition("registDao",beanDefinition);
	}
}
