package com.luban.beanFactoryPostProcessor;

import com.luban.app.Appconfig;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.security.acl.AclNotFoundException;

/**
 * @program: spring
 * @author: lyn
 * * @create: 2020-03-31 15:00
 **/
public class TestBfMain {
	public static void main(String[] args) {
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext();
		context.register(Appconfig.class);
		context.refresh();
		BfDao bean = context.getBean(BfDao.class);
		BfDao bean2 = context.getBean(BfDao.class);
		System.out.println("******************: " + bean.hashCode() + "   :: " + bean2.hashCode());
		bean.query();
	}
}
