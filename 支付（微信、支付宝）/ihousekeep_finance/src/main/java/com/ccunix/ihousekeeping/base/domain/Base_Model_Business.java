package com.ccunix.ihousekeeping.base.domain;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;

@JsonInclude(Include.ALWAYS)
public class Base_Model_Business extends Base_Model {

	String id;
	


	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

}
