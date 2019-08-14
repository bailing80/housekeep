package com.ccunix.ihousekeeping.base.service;

import java.util.ArrayList;
import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.ccunix.ihousekeeping.base.daoservice.TestService_DaoService_Iface;

@Service("activity_TestService")
public class TestService_Impl extends BaseService implements TestService_Iface {

	@Resource
	TestService_DaoService_Iface testService_DaoService_Iface;
	
	
	
	@Override
	public void hello_test() throws Exception {
		
		testService_DaoService_Iface.testAATT();
		testService_DaoService_Iface.testAATT_OTHER();
	}



	@Override
	public List query1and2() throws Exception {
		List ls = new ArrayList();
		List ls1 = testService_DaoService_Iface.query();
		List ls2 = testService_DaoService_Iface.query2();
		ls.add(ls1);
		ls.add(ls2);
		return ls;
	}

	
}
