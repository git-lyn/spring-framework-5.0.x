package com.lyn;

import com.lyn.aop.service.AopService;
import com.lyn.aop.service.PhoneService;
import com.lyn.app.Appcofig;
import com.lyn.factoryBean.MyFactoryBean;
import com.lyn.importSelector.SelectorService;
import com.lyn.service.IndexService;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ImportSelector;
import org.springframework.transaction.annotation.EnableTransactionManagement;

import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.locks.ReentrantLock;

/**
 * @program: spring
 * @author: lyn
 * * @create: 2020-07-10 21:38
 **/
@EnableTransactionManagement
public class MainDemo {
	public static void main(String[] args) {
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(Appcofig.class);
//		context.register(Appcofig.class);
//		context.refresh();

//		ReentrantLock lock = new ReentrantLock();

//		lock.lock();

//		Map<String, Object> ma = new HashMap<>();

		//AopService bean = context.getBean(AopService.class);
//		MyFactoryBean bean = (MyFactoryBean)context.getBean("&myFactoryBean");
//		IndexService bean1 = context.getBean(IndexService.class);
//		IndexService bean2 = context.getBean(IndexService.class);
//		bean.queryAll();
		//System.out.println(bean1.hashCode() + "######: " + bean2.hashCode());
		//SelectorService bean = context.getBean(SelectorService.class);
//		SelectorService bean = (SelectorService) context.getBean("selectorService");
//		bean.query();
		PhoneService bean1 = context.getBean(PhoneService.class);
		bean1.query();
	}
}
