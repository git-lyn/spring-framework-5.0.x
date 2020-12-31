package com.lyn.cycleDependency;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
 * @program: spring
 * @author: lyn
 * * @create: 2020-08-21 14:30
 **/
@Component
public class TestB {
	@Autowired
	private TestA testA;
}
