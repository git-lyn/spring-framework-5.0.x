package com.lyn.aop.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
 * @program: spring
 * @author: lyn
 * * @create: 2020-07-17 20:44
 **/
@Component
public class MobileService {

	@Autowired
	private PhoneService phoneService;

}
