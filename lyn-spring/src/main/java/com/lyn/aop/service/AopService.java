package com.lyn.aop.service;

import org.springframework.stereotype.Component;

/**
 * @program: spring
 * @author: lyn
 * * @create: 2020-07-11 16:31
 **/
@Component
public class AopService {
	public void query(){
		System.out.println("执行 AopService########  ");
	}
}
