package com.ccunix.ihousekeeping.base.util;

/**
 * 数据源的类别：master/slave
 */
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

import org.springframework.web.bind.annotation.RequestMapping;

/**
 * RUNTIME 编译器将把注释记录在类文件中，在运行时 VM 将保留注释，因此可以反射性地读取。
 * 
 */

@Retention(RetentionPolicy.RUNTIME)
@Target({ElementType.METHOD, ElementType.TYPE})
public @interface DataSourceType {
	String value();

	public static final String main = "main";

	public static final String activity = "activity";
}