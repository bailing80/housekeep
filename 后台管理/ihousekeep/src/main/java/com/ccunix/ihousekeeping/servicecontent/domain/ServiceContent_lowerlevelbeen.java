package com.ccunix.ihousekeeping.servicecontent.domain;

import com.ccunix.ihousekeeping.basedb.domain.T_u_service_content;

public class ServiceContent_lowerlevelbeen extends T_u_service_content {	
	String rownumber;
	String keyword;
	public String getKeyword() {
		return keyword;
	}
	public void setKeyword(String keyword) {
		this.keyword = keyword;
	}
	public String getRownumber() {
		return rownumber;
	}
	public void setRownumber(String rownumber) {
		this.rownumber = rownumber;
	}
}