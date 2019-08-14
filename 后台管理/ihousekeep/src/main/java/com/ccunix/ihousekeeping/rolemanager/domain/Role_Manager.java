package com.ccunix.ihousekeeping.rolemanager.domain;

import com.ccunix.ihousekeeping.basedb.domain.T_s_user_manager_role;

public class Role_Manager extends T_s_user_manager_role{
	String  num;//序号
	String name;//名称
	String description;//说明
	String this_level;//级别
	public String getThis_level() {
		return this_level;
	}
	public void setThis_level(String this_level) {
		this.this_level = this_level;
	}
	String parent_id;//上级ID
	String keyword;//关键字
	
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
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	
	public String getParent_id() {
		return parent_id;
	}
	public void setParent_id(String parent_id) {
		this.parent_id = parent_id;
	}

}

