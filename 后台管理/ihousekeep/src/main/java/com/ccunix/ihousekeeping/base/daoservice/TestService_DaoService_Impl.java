package com.ccunix.ihousekeeping.base.daoservice;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.ccunix.ihousekeeping.base.dao.AA_TEST_DAO_Iface;
import com.ccunix.ihousekeeping.base.dao.TT_TEST_DAO_Iface;
import com.ccunix.ihousekeeping.base.util.DataSourceType;

@Service("TestService_DaoService_Impl")
public class TestService_DaoService_Impl implements TestService_DaoService_Iface {

	@Resource
	AA_TEST_DAO_Iface aa_TEST_DAO_Iface;
	@Resource
	TT_TEST_DAO_Iface tt_TEST_DAO_Iface;

	@DataSourceType(value = DataSourceType.main)
	public void testAATT() {

		try {
			tt_TEST_DAO_Iface.insert();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

	@DataSourceType(value = DataSourceType.activity)
	public void testAATT_OTHER() {
		try {
			aa_TEST_DAO_Iface.insert();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

	@Override
	@DataSourceType(value = DataSourceType.main)
	public List query() {

		try {
			return tt_TEST_DAO_Iface.query();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;
	}

	@Override
	@DataSourceType(value = DataSourceType.activity)
	public List query2() {

		try {
			return aa_TEST_DAO_Iface.query();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;
	}

}
