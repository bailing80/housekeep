package com.ccunix.ihousekeeping.order.domain;

import java.util.Date;
/**
 * author 黄爽
 */

import com.ccunix.ihousekeeping.basedb.domain.T_u_order;

public class Order extends T_u_order {

	String rownumber;
	String user_phone;// 用户电话
	String nick_name;// 用户姓名
	String address; // 用户地址
	String coupon_type_id; // 优惠券类型
	int money; // 优惠券金额
	String item_name;// 子项目名称
	String project_id;// 服务id
	Integer nums;// 服务数目项目
	String phone;// 骑手电话
	String name;// 骑手名字

	public String getRownumber() {
		return rownumber;
	}

	public void setRownumber(String rownumber) {
		this.rownumber = rownumber;
	}

	public String getUser_phone() {
		return user_phone;
	}

	public void setUser_phone(String user_phone) {
		this.user_phone = user_phone;
	}

	public String getNick_name() {
		return nick_name;
	}

	public void setNick_name(String nick_name) {
		this.nick_name = nick_name;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getCoupon_type_id() {
		return coupon_type_id;
	}

	public void setCoupon_type_id(String coupon_type_id) {
		this.coupon_type_id = coupon_type_id;
	}

	public int getMoney() {
		return money;
	}

	public void setMoney(int money) {
		this.money = money;
	}

	public String getItem_name() {
		return item_name;
	}

	public void setItem_name(String item_name) {
		this.item_name = item_name;
	}

	public String getProject_id() {
		return project_id;
	}

	public void setProject_id(String project_id) {
		this.project_id = project_id;
	}

	public Integer getNums() {
		return nums;
	}

	public void setNums(Integer nums) {
		this.nums = nums;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

}