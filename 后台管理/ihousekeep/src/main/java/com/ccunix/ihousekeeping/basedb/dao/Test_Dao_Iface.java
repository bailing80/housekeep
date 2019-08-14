package com.ccunix.ihousekeeping.basedb.dao;
import java.util.List;

import com.ccunix.ihousekeeping.base.util.DataSourceType;
import com.ccunix.ihousekeeping.basedb.domain.Test;
@DataSourceType(DataSourceType.main)public interface Test_Dao_Iface {
public void insert_test(Test test) throws Exception;
public void update_test(Test test) throws Exception;
public void delete_test(Test test) throws Exception;
public List queryAll_test(Test test) throws Exception;
public List queryBy_test(Test test) throws Exception;
}
