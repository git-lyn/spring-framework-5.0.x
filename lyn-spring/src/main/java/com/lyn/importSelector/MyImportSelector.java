package com.lyn.importSelector;

import org.springframework.context.annotation.ImportSelector;
import org.springframework.core.type.AnnotationMetadata;

/**
 * @program: spring
 * @author: lyn
 * * @create: 2020-07-14 13:37
 **/
public class MyImportSelector implements ImportSelector {
	@Override
	public String[] selectImports(AnnotationMetadata importingClassMetadata) {
		return new String[]{SelectorService.class.getName()};
	}
}
