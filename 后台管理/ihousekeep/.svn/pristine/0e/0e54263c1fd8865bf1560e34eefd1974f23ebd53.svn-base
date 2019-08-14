package com.ccunix.ihousekeeping.base.service;

import java.lang.reflect.Method;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.reflect.MethodSignature;

import com.ccunix.ihousekeeping.base.util.DataSourceType;
import com.ccunix.ihousekeeping.base.util.DataSourceTypeManager;
import com.ccunix.ihousekeeping.base.util.DataSources;

public class DataSourceAspect {
	/**
	 * 在dao层方法获取datasource对象之前，在切面中指定当前线程数据源
	 */
	public void before(JoinPoint point) {
		System.out.println("before$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$");
		Object target = point.getTarget();
		String method = point.getSignature().getName();
		Class<?>[] classz = target.getClass().getInterfaces(); // 获取目标类的接口，
																// 所以@DataSource需要写在接口上

		Class<?>[] parameterTypes = ((MethodSignature) point.getSignature()).getMethod().getParameterTypes();
		try {
			Method m = classz[0].getMethod(method, parameterTypes);
			Method realMethod = point.getTarget().getClass().getDeclaredMethod(m.getName(), m.getParameterTypes());
			// 此处realMethod是目标对象（原始的）的方法
			boolean an = realMethod.isAnnotationPresent(DataSourceType.class);
			if (realMethod != null && an == true) {
				DataSourceType data = realMethod.getAnnotation(DataSourceType.class);
				System.out.println("用户选择数据库库类型==========：" + data.value());
				// HandleDataSource.putDataSource(data.value()); // 数据源放到当前线程中
				if(data.value().indexOf(DataSourceType.activity)>=0){
					DataSourceTypeManager.set(DataSources.Activity);
				}else if(data.value().indexOf(DataSourceType.main)>=0){
					DataSourceTypeManager.set(DataSources.Main);
				}
			}

		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}