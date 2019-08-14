package com.ccunix.ihousekeeping.basedbmodel.domain;

import com.ccunix.ihousekeeping.base.domain.Base_Model;

public class Table_Column extends Base_Model {

	private String table_name;
	private String column_name;
	private String data_type;
	private String comments;

	public String getTable_name() {
		return table_name;
	}

	public void setTable_name(String table_name) {
		this.table_name = table_name;
	}

	public String getColumn_name() {
		return column_name;
	}

	public String getComments() {
		return comments;
	}

	public void setComments(String comments) {
		this.comments = comments;
	}

	public void setColumn_name(String column_name) {
		this.column_name = column_name;
	}

	public String getData_type() {
		return data_type;
	}

	public void setData_type(String data_type) {
		this.data_type = data_type;
	}

}
