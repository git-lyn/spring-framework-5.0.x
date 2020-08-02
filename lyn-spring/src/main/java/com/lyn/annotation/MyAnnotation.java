package com.lyn.annotation;

import com.lyn.importBeanDefinicationRegistrar.MyImportBeanDefinicationRegistrar;
import org.springframework.context.annotation.Import;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
@Import(MyImportBeanDefinicationRegistrar.class)
@Retention(RetentionPolicy.RUNTIME)
public @interface MyAnnotation {
	public String value() default "aaa";
}
