package com.ccunix.ihousekeeping.basedbmodel.service;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import com.ccunix.ihousekeeping.base.service.BaseService;
import com.ccunix.ihousekeeping.basedbmodel.dao.Table_Column_Dao_Iface;
import com.ccunix.ihousekeeping.basedbmodel.domain.Table_Column;



@Service("activity_Table_Column_Service")
@Transactional(propagation = Propagation.REQUIRED, rollbackFor = Exception.class)
public class Table_Column_Service_Impl extends BaseService implements Table_Column_Service_Iface{

	@Resource
	Table_Column_Dao_Iface table_column_dao_iface;
	
	@Override
	public List<Table_Column> queryColumn_By_Table(Table_Column column) throws Exception {
		// TODO Auto-generated method stub
		return table_column_dao_iface.queryColumn_By_Table(column);
	}

}
