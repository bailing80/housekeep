package com.ccunix.ihousekeeping.base.service;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;



@Aspect // for aop
@Component // for auto scan
@Order(0) // execute before @Transactional
public class DataSourceInterceptor2 {
//	@Pointcut("execution(* com.ccunix.icar.*.dao.*.*(..))")
//	public void dataSourceMain() {
//	};

//	@Before("dataSourceMain()")
	public void before(JoinPoint jp) {
		System.out.println("main dao ................................");
		//DataSourceTypeManager.set(DataSources.Main);
	}
}
