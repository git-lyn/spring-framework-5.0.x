package com.luban.postProcessor;

import org.springframework.context.annotation.EnableAspectJAutoProxy;
import org.springframework.stereotype.Repository;

import javax.annotation.PostConstruct;

/**
 *
 * BeanPostProcessor演示: 参与构造bd
 *
 * @program: spring
 * @author: lyn
 * * @create: 2020-03-30 23:45
 **/
@Repository
public class PPDao {

	public PPDao() {
		System.out.println("启动 PPDao的构造方法");
	}

	@PostConstruct // 进行init初始化
	public void init() {
		System.out.println("！！！！！！！！！！！！！init......");
	}


	public void query() {
		System.out.println("查询 PPDao...........");
	}
}
