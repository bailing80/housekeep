package com.ccunix.ihousekeeping.coupon_type.domain;

import com.ccunix.ihousekeeping.basedb.domain.T_u_coupon_type;

public class Coupon_type extends T_u_coupon_type {
	String num;// 序号
	String keyword;// 关键字

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
