package com.lyn.service;

import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;

/**
 * @program: spring
 * @author: lyn
 * * @create: 2020-07-10 21:38
 **/
@Component
public class IndexService {

	public IndexService(){
		System.out.println("构造器初始化。。。");
	}

	@PostConstruct
	public void init(){
		System.out.println("indexService init .... ");
	}

	public void query(){
		System.out.println("indexService........");
	}
}
