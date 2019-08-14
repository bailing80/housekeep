package com.ccunix.ihousekeeping.base.domain;

import java.io.Serializable;
import java.util.Date;

import com.ccunix.ihousekeeping.base.util.DateTimeUtil;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;

@JsonInclude(Include.ALWAYS)
public class Base_Model implements Serializable {
	
	protected String creator;
	protected Date createtime;
	protected String updater;
	protected Date updatetime;
	protected Integer is_delete;
	protected Date deletetime;
	protected String delete_user;
	
	//
	
	


	protected String createtime_str;
	
	
	//排序
	protected String orderby_column;
	protected String orderby_type;
	
	
	
	public String getOrderby_column() {
		return orderby_column;
	}

	public void setOrderby_column(String orderby_column) {
		this.orderby_column = orderby_column;
	}

	public String getOrderby_type() {
		return orderby_type;
	}

	public void setOrderby_type(String orderby_type) {
		this.orderby_type = orderby_type;
	}

	public String getDelete_user() {
		return delete_user;
	}

	public void setDelete_user(String delete_user) {
		this.delete_user = delete_user;
	}

	public String getCreatetime_str() {
		return createtime_str;
	}

	public void setCreatetime_str(String createtime_str) {
		this.createtime_str = createtime_str;
	}

	public String getCreator() {
		return creator;
	}

	public void setCreator(String creator) {
		this.creator = creator;
	}

	public Date getCreatetime() {
		return createtime;
	}

	public void setCreatetime(Date createtime) {
		createtime_str = DateTimeUtil.getDateString(DateTimeUtil.dateFormat_yyyyMMdd, createtime);
		this.createtime = createtime;
	}

	public String getUpdater() {
		return updater;
	}

	public void setUpdater(String updater) {
		this.updater = updater;
	}

	public Date getUpdatetime() {
		return updatetime;
	}

	public void setUpdatetime(Date updatetime) {
		this.updatetime = updatetime;
	}

	public Integer getIs_delete() {
		return is_delete;
	}

	public void setIs_delete(Integer is_delete) {
		this.is_delete = is_delete;
	}

	public Date getDeletetime() {
		return deletetime;
	}

	public void setDeletetime(Date deletetime) {
		this.deletetime = deletetime;
	}

}
