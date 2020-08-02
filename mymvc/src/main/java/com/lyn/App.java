package com.lyn;

import com.lyn.app.Appconfig;
import org.apache.catalina.Context;
import org.apache.catalina.LifecycleListener;
import org.apache.catalina.startup.Tomcat;
import org.springframework.web.context.support.AnnotationConfigWebApplicationContext;
import org.springframework.web.servlet.DispatcherServlet;

import java.io.File;

/**
 * @program: spring
 * @author: lyn
 * * @create: 2020-07-28 16:54
 **/
public class App {
	public static void main(String[] args) throws Exception {

		AnnotationConfigWebApplicationContext aactx = new AnnotationConfigWebApplicationContext();
		aactx.register(Appconfig.class);
		//aactx.refresh();

		Tomcat tomcat = new Tomcat();
		tomcat.setPort(8080);

        //
        Context context = tomcat.addContext("/", System.getProperty("java.io.tmpdir"));
        //只会去初始化一个 context的资源目录 并不会加载 web的生命周期
        // webapps
        // .war   文件夹
         //tomcat.addWebapp("/","C:\\Program Files\\pro\\public-luban-project\\spring-mvc\\src\\main\\webapp");
         //tomcat.addWebapp("/","D:\\mysoft\\IDEA\\workSpace\\spring\\luban-spring\\spring-framework-5.0.x\\main-mvc\\src\\main\\webappC:\\Program Files\\pro\\public-luban-project\\spring-mvc\\src\\main\\webapp");
		tomcat.addWebapp("/", "D:\\mysoft\\IDEA\\workSpace\\spring\\luban-spring\\spring-framework-5.0.x\\mymvc\\src\\main\\resources\\web");
        context.addLifecycleListener((LifecycleListener) Class.forName(tomcat.getHost().getConfigClass()).newInstance());
        //tomcat.start();



//		File base = new File(System.getProperty("java.io.tmpdir"));
//
//		Tomcat tomcat = new Tomcat();
//		tomcat.setPort(8080);
//
//		Context rootCtx = tomcat.addContext("/", base.getAbsolutePath());
//
//		rootCtx.addLifecycleListener((LifecycleListener) Class.forName(tomcat.getHost().getConfigClass()).newInstance());
//
//		DispatcherServlet servlet = new DispatcherServlet(aactx);
//		Tomcat.addServlet(rootCtx, "app", servlet).setLoadOnStartup(1);
//		rootCtx.addServletMapping("/","app");

		tomcat.start();
		tomcat.getServer().await();
	}
}
