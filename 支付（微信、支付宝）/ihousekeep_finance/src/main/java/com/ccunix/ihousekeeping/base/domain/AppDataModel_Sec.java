package com.ccunix.ihousekeeping.base.domain;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;

//加密对象
@JsonInclude(Include.ALWAYS)
public class AppDataModel_Sec {
	
	public String data;

	public String getData() {
		return data;
	}

	public AppDataModel_Sec setData(String data) {
		this.data = data;
		return this;
	}
	
	

}
