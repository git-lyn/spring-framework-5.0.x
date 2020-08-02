package com.lyn.aop.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
 * @program: spring
 * @author: lyn
 * * @create: 2020-07-17 20:44
 **/
@Component("phone")
public class PhoneService {

	@Autowired
	private MobileService mobileService;

//	public PhoneService(){
//		System.out.println("无参数构造器");
//	}

//	public PhoneService(MobileService mobileService) {
//		System.out.println("有一个参数的构造器");
//	}

	public void query(){
		System.out.println("查询数据信息");
	}

}
