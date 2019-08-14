package com.ccunix.ihousekeeping.servicecontent.dao;

import java.util.List;

import com.ccunix.ihousekeeping.servicecontent.domain.ServiceContent_lowerlevelbeen;
import com.ccunix.ihousekeeping.servicecontent.domain.third_head_been;

public interface ServiceContent_Dao_Iface{
	public List queryAll_Servicecontent_lowerlevel(ServiceContent_lowerlevelbeen serviceContent_lowerlevelbean);
	
	public List third_head(third_head_been third_head_been) throws Exception;

}

