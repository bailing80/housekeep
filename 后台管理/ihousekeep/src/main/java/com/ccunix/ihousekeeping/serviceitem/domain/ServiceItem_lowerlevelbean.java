package com.ccunix.ihousekeeping.serviceitem.domain;

import com.ccunix.ihousekeeping.basedb.domain.T_u_service_item;

public class ServiceItem_lowerlevelbean extends T_u_service_item {
	
	private String rownumber;
	private String keyword;
	private String unit_name;

	 
	
	public String getUnit_name() {
		return unit_name;
	}
	public void setUnit_name(String unit_name) {
		this.unit_name = unit_name;
	}
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
