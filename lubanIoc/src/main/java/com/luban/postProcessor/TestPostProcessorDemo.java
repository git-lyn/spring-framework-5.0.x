package com.luban.postProcessor;

import com.luban.app.Appconfig;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * @program: spring
 * @author: lyn
 * * @create: 2020-03-30 23:48
 **/
public class TestPostProcessorDemo {
	public static void main(String[] args) {
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(Appconfig.class);
		PPDao bean = context.getBean(PPDao.class);
		bean.query();
	}
}
