package com.ccunix.ihousekeeping.saler.domain;

import com.ccunix.ihousekeeping.basedb.domain.T_lz_saler;

public class Saler extends T_lz_saler{
	private String service_time;
	private String divide_str;
	private String receive_type_name;
	public String getService_time() {
		return service_time;
	}
	public void setService_time(String service_time) {
		this.service_time = service_time;
	}
	
	public String getDivide_str() {
		return divide_str;
	}
	public void setDivide_str(String divide_str) {
		this.divide_str = divide_str;
	}
	public String getReceive_type_name() {
		return receive_type_name;
	}
	public void setReceive_type_name(String receive_type_name) {
		this.receive_type_name = receive_type_name;
	}

}
