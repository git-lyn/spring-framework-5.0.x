package com.lyn;

import com.lyn.app.Appcofig;
import com.lyn.dao.DataDao;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * @program: spring
 * @author: lyn
 * * @create: 2020-07-14 13:48
 **/
public class ImportDemo {
	public static void main(String[] args) {
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext();
		context.register(Appcofig.class);
		context.refresh();
		DataDao dataDao = (DataDao) context.getBean("dataDao");
		dataDao.query("sdfdff");
	}
}
