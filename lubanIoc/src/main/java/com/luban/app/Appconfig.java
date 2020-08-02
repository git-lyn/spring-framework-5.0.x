package com.luban.app;

import com.luban.anno.EanbleLuabn;
import com.luban.bdRegistrar.MyBeanDefinitionRegistrar;
import com.luban.dao.Dao;
import com.luban.dao.IndexDao;
import com.luban.dao.IndexDao1;
//import com.luban.imports.MyImportSelector;
import com.luban.imports.MyImportSelector;
import com.luban.service.UserDaoService;
import com.luban.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.*;
import org.springframework.stereotype.Controller;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

@ComponentScan("com.luban")
@Configuration
//@EanbleLuabn // 类似mybatis
//@Import(MyBeanDefinitionRegistrar.class)
@EnableAspectJAutoProxy
//@Repository
public class Appconfig {

//	@Bean
//	public IndexDao1 indexDao1(){
//
//		return new IndexDao1();
//	}
//
//	@Bean
//	public IndexDao indexDao(){
//		indexDao1();
//		indexDao1();
//		return new IndexDao();
//	}

	@Bean
	public UserService userService(){
		return new UserService();
	}

	@Bean
	public UserDaoService userDaoService() {
		userService();
		return new UserDaoService();
	}

}
