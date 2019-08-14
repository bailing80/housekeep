package com.ccunix.ihousekeeping.member_information.domain;

import com.ccunix.ihousekeeping.basedb.domain.T_u_member;

/**
 * @ClassName: Member_information
 * @author 肖云鹏
 * @date 2019年7月18日 下午3:02:40
 * 
 */
public class Member_information extends T_u_member {
	String num;// 序号
	String keyword;// 关键字
	String apartment_name;// 户型
	String area_name;// 面积
	String address;// 地址
	String door_number;// 门牌号
	String member_state_str;// 用户状态
	String true_area;// 实际面积

	public String getTrue_area() {
		return true_area;
	}

	public void setTrue_area(String true_area) {
		this.true_area = true_area;
	}

	public String getMember_state_str() {
		return member_state_str;
	}

	public void setMember_state_str(String member_state_str) {
		this.member_state_str = member_state_str;
	}

	public String getNum() {
		return num;
	}

	public void setNum(String num) {
		this.num = num;
	}

	public String getKeyword() {
		return keyword;
	}

	public void setKeyword(String keyword) {
		this.keyword = keyword;
	}

	public String getApartment_name() {
		return apartment_name;
	}

	public void setApartment_name(String apartment_name) {
		this.apartment_name = apartment_name;
	}

	public String getArea_name() {
		return area_name;
	}

	public void setArea_name(String area_name) {
		this.area_name = area_name;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getDoor_number() {
		return door_number;
	}

	public void setDoor_number(String door_number) {
		this.door_number = door_number;
	}

}
