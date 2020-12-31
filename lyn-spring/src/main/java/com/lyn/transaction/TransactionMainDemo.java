package com.lyn.transaction;

import com.lyn.app.Appcofig;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * @program: spring
 * @author: lyn
 * * @create: 2020-12-13 19:23
 **/
public class TransactionMainDemo {
	public static void main(String[] args) {
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(Appcofig.class);
		TransactionService bean = context.getBean(TransactionService.class);
		TransactionService bean2 = (TransactionService) context.getBean("transactionServiceImpl");
		System.out.println("###: " + bean2);
		bean.insert();

	}
}
