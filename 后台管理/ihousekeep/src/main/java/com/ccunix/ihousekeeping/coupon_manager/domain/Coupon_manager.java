package com.ccunix.ihousekeeping.coupon_manager.domain;

import java.util.Date;

import com.ccunix.ihousekeeping.basedb.domain.T_u_coupon_manager;

/**
 * 
 * @ClassName: Coupon_manager
 * @author 肖云鹏
 * @date 2019年7月23日 下午6:21:33
 *
 */
public class Coupon_manager extends T_u_coupon_manager {
	String num;// 序号
	String keyword;// 关键字
	Integer money;// 金额
	String state;// 状态
	Date exchange_time;// Date的兑换时间
	String exchange_code;// 兑换码
	String exchange_time_str;// String的兑换时间
	String coupon_manager_type_id;// 外键
	String type_name;// 类型表的类型名称
	String coupon_project_name;// 批次名称

	public String getType_name() {
		return type_name;
	}

	public void setType_name(String type_name) {
		this.type_name = type_name;
	}

	public String getCoupon_project_name() {
		return coupon_project_name;
	}

	public void setCoupon_project_name(String coupon_project_name) {
		this.coupon_project_name = coupon_project_name;
	}

	public String getCoupon_manager_type_id() {
		return coupon_manager_type_id;
	}

	public void setCoupon_manager_type_id(String coupon_manager_type_id) {
		this.coupon_manager_type_id = coupon_manager_type_id;
	}

	public String getExchange_time_str() {
		return exchange_time_str;
	}

	public void setExchange_time_str(String exchange_time_str) {
		this.exchange_time_str = exchange_time_str;
	}

	public Integer getMoney() {
		return money;
	}

	public void setMoney(Integer money) {
		this.money = money;
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

	public Date getExchange_time() {
		return exchange_time;
	}

	public void setExchange_time(Date exchange_time) {
		this.exchange_time = exchange_time;
	}

	public String getExchange_code() {
		return exchange_code;
	}

	public void setExchange_code(String exchange_code) {
		this.exchange_code = exchange_code;
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

}