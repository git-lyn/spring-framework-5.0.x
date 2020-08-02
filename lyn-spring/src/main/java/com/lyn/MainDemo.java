package com.lyn;

import com.lyn.aop.service.AopService;
import com.lyn.aop.service.PhoneService;
import com.lyn.app.Appcofig;
import com.lyn.factoryBean.MyFactoryBean;
import com.lyn.importSelector.SelectorService;
import com.lyn.service.IndexService;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ImportSelector;

/**
 * @program: spring
 * @author: lyn
 * * @create: 2020-07-10 21:38
 **/
public class MainDemo {
	public static void main(String[] args) {
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext();
		context.register(Appcofig.class);
		context.refresh();

		//AopService bean = context.getBean(AopService.class);
//		MyFactoryBean bean = (MyFactoryBean)context.getBean("&myFactoryBean");
//		IndexService bean1 = context.getBean(IndexService.class);
//		IndexService bean2 = context.getBean(IndexService.class);
//		bean.queryAll();
		//System.out.println(bean1.hashCode() + "######: " + bean2.hashCode());
		SelectorService bean = context.getBean(SelectorService.class);
		bean.query();
		PhoneService bean1 = context.getBean(PhoneService.class);
		bean1.query();
	}
}
