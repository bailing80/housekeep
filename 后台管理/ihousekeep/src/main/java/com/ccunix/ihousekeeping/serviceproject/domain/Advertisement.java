package com.ccunix.ihousekeeping.serviceproject.domain;

import com.ccunix.ihousekeeping.advertisement_item.domain.Advertisement_item;

public class Advertisement extends Advertisement_item{
	private String position;

	public String getPosition() {
		return position;
	}

	public void setPosition(String position) {
		this.position = position;
	}
}
