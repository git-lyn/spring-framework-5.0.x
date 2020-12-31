package com.lyn.cglibFull;

import org.springframework.beans.factory.annotation.Autowired;

import javax.annotation.Resource;

/**
 * @program: spring
 * @author: lyn
 * * @create: 2020-12-05 22:28
 **/
public class Climb {

	@Resource
	@Autowired

	public String dog(){
		return "dog wangwangwang....";
	}

	public void a(){
		System.out.println("aaaa");
	}

	public void b(){
		System.out.println("bbbbb");
	}

}
