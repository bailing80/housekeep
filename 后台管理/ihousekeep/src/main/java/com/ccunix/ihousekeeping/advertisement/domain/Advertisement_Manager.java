package com.ccunix.ihousekeeping.advertisement.domain;
import com.ccunix.ihousekeeping.basedb.domain.T_s_advertisement_manager;
public class Advertisement_Manager extends T_s_advertisement_manager {
	private String type_name; 
	private String rownumber;
	private String keyword;
	private String is_wheel_str;
	public String getIs_wheel_str() {
		return is_wheel_str;
	}
	public void setIs_wheel_str(String is_wheel_str) {
		this.is_wheel_str = is_wheel_str;
	}
	public String getKeyword() {
		return keyword;
	}
	public void setKeyword(String keyword) {
		this.keyword = keyword;
	}
	public String getType_name() {
		return type_name;
	}
	public void setType_name(String type_name) {
		this.type_name = type_name;
	}
	public String getRownumber() {
		return rownumber;
	}
	public void setRownumber(String rownumber) {
		this.rownumber = rownumber;
	}
}
