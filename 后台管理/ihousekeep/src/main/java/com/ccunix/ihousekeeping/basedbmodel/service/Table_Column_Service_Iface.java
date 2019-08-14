package com.ccunix.ihousekeeping.basedbmodel.service;

import java.util.List;

import com.ccunix.ihousekeeping.basedbmodel.domain.Table_Column;



public interface Table_Column_Service_Iface {
	
	
	public List<Table_Column> queryColumn_By_Table(Table_Column column) throws Exception;

}
