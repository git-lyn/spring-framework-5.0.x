package com.lyn.init;

import com.lyn.app.Appconfig;
import org.springframework.web.WebApplicationInitializer;
import org.springframework.web.context.support.AnnotationConfigWebApplicationContext;
import org.springframework.web.servlet.DispatcherServlet;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.ServletRegistration;

/**
 * @program: spring
 * @author: lyn
 * * @create: 2020-07-28 19:59
 **/
public class MyWebApplicationInitialzing implements WebApplicationInitializer {
	@Override
	public void onStartup(ServletContext servletContext) throws ServletException {
		// Load Spring web application configuration
		AnnotationConfigWebApplicationContext ac = new AnnotationConfigWebApplicationContext();
		ac.register(Appconfig.class);
		//ac.refresh();

		System.out.println("MyWebApplicationInitializer start111111111111");

		// Create and register the DispatcherServlet
		DispatcherServlet servlet = new DispatcherServlet(ac);
		ServletRegistration.Dynamic registration = servletContext.addServlet("app", servlet);
		registration.setLoadOnStartup(1);
		//registration.addMapping("/webapp/*");
		registration.addMapping("*.do");
	}
}
