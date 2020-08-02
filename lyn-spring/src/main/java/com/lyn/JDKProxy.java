package com.lyn;

import com.lyn.dao.Dao;
import sun.misc.ProxyGenerator;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;

/**
 * @program: spring
 * @author: lyn
 * * @create: 2020-07-11 20:12
 **/
public class JDKProxy {
	public static void main(String[] args) throws Exception {
		Class<?>[] interfaces = {
			Dao.class
		};
		byte[] bytes = ProxyGenerator.generateProxyClass("MyDaoProxy", interfaces);
		// 将字节数组写出去
		File file = new File("E:/MyDaoProxy.class");
		FileOutputStream outputStream = new FileOutputStream(file);
		outputStream.write(bytes);
		outputStream.flush();
		outputStream.close();
	}
}
