package com.lyn.transaction;

import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

/**
 * @program: spring
 * @author: lyn
 * * @create: 2020-12-12 21:51
 **/
@Component
public class TransactionServiceImpl implements TransactionService {


	@Transactional(propagation = Propagation.REQUIRED)
	@Override
	public void insert() {
		System.out.println("插入数据库数据。。。。。。");
	}
}
