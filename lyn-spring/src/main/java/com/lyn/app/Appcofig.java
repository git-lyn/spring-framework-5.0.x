package com.lyn.app;

import com.lyn.annotation.MyAnnotation;
import com.lyn.dao.CgDao;
import com.lyn.dao.CgDao2;
import com.lyn.importBeanDefinicationRegistrar.MyImportBeanDefinicationRegistrar;
import com.lyn.importSelector.MyImportSelector;
import org.springframework.context.annotation.*;

/**
 * @program: spring
 * @author: lyn
 * * @create: 2020-07-10 21:38
 **/
//@MyAnnotation
//@Configuration
@ComponentScan("com.lyn")
@Import(MyImportSelector.class)
//@Import(MyImportBeanDefinicationRegistrar.class)
@EnableAspectJAutoProxy
public class Appcofig {


	@Bean
	public CgDao2 getCgdao2(){
		return new CgDao2();
	}

	@Bean
	public CgDao getDao(){
		getCgdao2();
		return new CgDao();
	}

}
