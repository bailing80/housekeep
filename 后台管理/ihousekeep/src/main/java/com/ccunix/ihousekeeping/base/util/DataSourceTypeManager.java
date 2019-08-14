package com.ccunix.ihousekeeping.base.util;

public class DataSourceTypeManager {
	private static final ThreadLocal<DataSources> dataSourceTypes = new ThreadLocal<DataSources>() {
		@Override
		protected DataSources initialValue() {
			return DataSources.Activity;
		}
	};

	public static DataSources get() {
		return dataSourceTypes.get();
	}

	public static void set(DataSources dataSourceType) {
		System.out.println("数据源变换====="+dataSourceType);
		dataSourceTypes.set(dataSourceType);
		System.out.println(dataSourceTypes.get().name()+"数据源变换完成====="+dataSourceType);
	}

	public static void reset() {
		dataSourceTypes.set(DataSources.Activity);
	}
}