package com.lyn.app;

import com.lyn.dao.CgDao;
import com.lyn.dao.CgDao2;
import com.lyn.importSelector.MyImportSelector;
import org.springframework.context.annotation.*;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.datasource.DataSourceTransactionManager;
import org.springframework.jdbc.datasource.DriverManagerDataSource;
import org.springframework.transaction.PlatformTransactionManager;
import org.springframework.transaction.annotation.EnableTransactionManagement;

import javax.sql.DataSource;


/**
 * @program: spring
 * @author: lyn
 * * @create: 2020-07-10 21:38
 **/
//@MyAnnotation
@Configuration
//@EnableTransactionManagement // 开启事务机制
//@ComponentScan("com.lyn.transaction")
@ComponentScan("com.lyn.aop")
//@Import(MyImportSelector.class)
//@Import(MyImportBeanDefinicationRegistrar.class)
// 启动aop：向bdMap中注入了AnnotationAwareAspectjAutoProxyCreator
@EnableAspectJAutoProxy(proxyTargetClass = false)
//@MapperScanner
public class Appcofig {


//	@Bean
//	public CgDao2 getCgdao2(){
//		System.out.println("###### cgDao2");
//		return new CgDao2();
//	}
//
//	@Bean
//	public CgDao getDao(){
//		getCgdao2();
//		return new CgDao();
//	}

/*
	@Bean
	public DataSource dataSource() {

		DriverManagerDataSource dataSource = new DriverManagerDataSource();

//		DruidDataSource dataSource = new DruidDataSource();
		dataSource.setUsername("root");
		dataSource.setPassword("123456");
		dataSource.setUrl("jdbc:mysql://localhost:3306/mytest");
		dataSource.setDriverClassName("com.mysql.jdbc.Driver");
		return dataSource;
	}

	@Bean
	public JdbcTemplate jdbcTemplate(DataSource dataSource) {
		return new JdbcTemplate(dataSource);
	}

	@Bean
	public PlatformTransactionManager transactionManager(DataSource dataSource) {
		return new DataSourceTransactionManager(dataSource);
	}

*/


}
