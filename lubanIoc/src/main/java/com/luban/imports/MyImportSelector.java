package com.luban.imports;

import com.luban.dao.IndexDao;
import com.luban.dao.IndexDao4;
import com.luban.dao.IndexDao5;
import org.springframework.context.annotation.ImportSelector;
import org.springframework.core.type.AnnotationMetadata;

/**
 * @program: spring
 * @author: lyn
 * * @create: 2020-03-29 19:57
 **/
public class MyImportSelector implements ImportSelector {
	@Override
	public String[] selectImports(AnnotationMetadata importingClassMetadata) {
		return new String[]{IndexDao5.class.getName()};
	}
}
