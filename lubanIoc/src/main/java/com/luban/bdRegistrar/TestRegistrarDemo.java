package com.luban.bdRegistrar;

import com.luban.app.Appconfig;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * @program: spring
 * @author: lyn
 * * @create: 2020-03-30 22:19
 **/
public class TestRegistrarDemo {
	public static void main(String[] args) {
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(Appconfig.class);
		RegistrarDao dao = (RegistrarDao) context.getBean("registDao");
		dao.query();
	}
}
