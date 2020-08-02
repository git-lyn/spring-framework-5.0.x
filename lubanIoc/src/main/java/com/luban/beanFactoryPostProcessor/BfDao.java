package com.luban.beanFactoryPostProcessor;

import org.springframework.stereotype.Component;

/**
 * @program: spring
 * @author: lyn
 * * @create: 2020-03-31 14:59
 **/
@Component
public class BfDao {
	public void query(){
		System.out.println("$$$$$$ myBeanFactoryPostProcessor  &&&&&&&&");
	}
}
