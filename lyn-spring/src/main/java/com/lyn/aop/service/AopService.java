package com.lyn.aop.service;

import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

/**
 * @program: spring
 * @author: lyn
 * * @create: 2020-07-11 16:31
 **/
@Component
public class AopService implements MyService {

//	@Transactional
	public void query(){
		System.out.println("执行 AopService########  ");
	}
}
