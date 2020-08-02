package com.luban.anno;

//import com.luban.imports.MyImportSelector;
import com.luban.bdRegistrar.MyBeanDefinitionRegistrar;
import com.luban.imports.MyImportSelector;
import org.springframework.context.annotation.Import;

import java.lang.annotation.Documented;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

//@Import(MyImportSelector.class)
@Import(MyBeanDefinitionRegistrar.class)
@Retention(RetentionPolicy.RUNTIME)
public @interface EanbleLuabn {

}
