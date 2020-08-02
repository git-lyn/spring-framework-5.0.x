package com.lyn.factoryBean;

import com.lyn.factoryBean.dao.FactoryDao;
import com.lyn.factoryBean.dao.FactoryDaoImpl;
import org.springframework.beans.factory.FactoryBean;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
 * @program: spring
 * @author: lyn
 * * @create: 2020-07-12 19:28
 **/
@Component
public class MyFactoryBean implements FactoryBean {


	public void queryAll(){
		System.out.println("22222factoryDao..");
	}

	@Override
	public Object getObject() throws Exception {
		return new FactoryDaoImpl();
	}

	@Override
	public Class<?> getObjectType() {
		return FactoryDaoImpl.class;
	}
}
