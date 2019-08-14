package com.ccunix.ihousekeeping.serviceitem.dao;

import java.util.List;

import com.ccunix.ihousekeeping.basedb.domain.T_s_unit;
import com.ccunix.ihousekeeping.serviceitem.domain.ServiceItem_lowerlevelbean;
import com.ccunix.ihousekeeping.serviceitem.domain.second_head_been;

public interface ServiceItem_Dao_Ifae {


	List queryAll_Serviceiteam_lowerlevel(ServiceItem_lowerlevelbean serviceItem_lowerlevelbean)throws Exception;

	List queryAll_T_s_unit(T_s_unit t_s_unit);

	public List second_head(second_head_been been) throws Exception;

	
}
