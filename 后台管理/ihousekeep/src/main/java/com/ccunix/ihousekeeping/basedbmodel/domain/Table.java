package com.ccunix.ihousekeeping.basedbmodel.domain;

import com.ccunix.ihousekeeping.base.domain.Base_Model;

public class Table extends Base_Model {

	private String table_name;
	private String comments;

	public String getTable_name() {
		return table_name;
	}

	public void setTable_name(String table_name) {
		this.table_name = table_name;
	}

	public String getComments() {
		return comments;
	}

	public void setComments(String comments) {
		this.comments = comments;
	}

}
