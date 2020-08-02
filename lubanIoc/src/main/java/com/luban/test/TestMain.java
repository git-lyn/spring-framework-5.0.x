package com.luban.test;

import com.luban.app.Appconfig;
import com.luban.dao.Dao;
import com.luban.dao.IndexDao4;
import com.luban.dao.IndexDao5;
import com.luban.dao.MyInvocationHandle;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.lang.reflect.Proxy;

/**
 * @program: spring
 * @author: lyn
 * * @create: 2020-03-26 17:14
 **/
public class TestMain {
	public static void main(String[] args) {
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(Appconfig.class);// Appconfig.class
//		context.register(Appconfig.class);
//		context.refresh();
		Dao bean = (Dao) context.getBean("indexDao4");
//		IndexDao4 bean = context.getBean("IndexDao4");
//		Proxy.newProxyInstance(this.getClass().getClassLoader(), new Class[]{Dao.class}, new MyInvocationHandle());
//		IndexDao4 bean = (IndexDao4) context.getBean("indexDao4");
		System.out.println(" ============================== ");
		bean.query();
//		IndexDao4 indexDao4 = new IndexDao4();
//		Dao o = (Dao) Proxy.newProxyInstance(TestMain.class.getClass().getClassLoader(), new Class[]{Dao.class}, new MyInvocationHandle(new IndexDao4()));
//		o.query();
	}
}
