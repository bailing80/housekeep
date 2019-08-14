package com.ccunix.ihousekeeping.minprog_main.domain;

import com.ccunix.ihousekeeping.basedb.domain.T_u_member_address;

public class Member_Address extends T_u_member_address{

	private String nick_name;
	private String user_phone;
	private Integer apartment_name_s;
	private Integer apartment_name_t;
	private Integer apartment_name_c;
	private Integer apartment_name_w;
	public String getNick_name() {
		return nick_name;
	}
	public void setNick_name(String nick_name) {
		this.nick_name = nick_name;
	}
	public String getUser_phone() {
		return user_phone;
	}
	public void setUser_phone(String user_phone) {
		this.user_phone = user_phone;
	}
	public Integer getApartment_name_s() {
		return apartment_name_s;
	}
	public void setApartment_name_s(Integer apartment_name_s) {
		this.apartment_name_s = apartment_name_s;
	}
	public Integer getApartment_name_t() {
		return apartment_name_t;
	}
	public void setApartment_name_t(Integer apartment_name_t) {
		this.apartment_name_t = apartment_name_t;
	}
	public Integer getApartment_name_c() {
		return apartment_name_c;
	}
	public void setApartment_name_c(Integer apartment_name_c) {
		this.apartment_name_c = apartment_name_c;
	}
	public Integer getApartment_name_w() {
		return apartment_name_w;
	}
	public void setApartment_name_w(Integer apartment_name_w) {
		this.apartment_name_w = apartment_name_w;
	}
	
	
}
