package com.luban.dao;

import org.springframework.stereotype.Component;

/**
 * @program: spring
 * @author: lyn
 * * @create: 2020-03-29 19:57
 **/
@Component
public class IndexDao4 implements Dao {
	@Override
	public void query() {
		System.out.println("实现数据的查询44444444444");
	}
}
