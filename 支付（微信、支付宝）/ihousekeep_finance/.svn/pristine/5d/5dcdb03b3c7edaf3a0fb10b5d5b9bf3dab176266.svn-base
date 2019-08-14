package com.ccunix.ihousekeeping.basedb.service;
import java.util.List;
import javax.annotation.Resource;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;
import com.ccunix.ihousekeeping.base.domain.AppDataModel;
import com.ccunix.ihousekeeping.base.service.BaseService;
import com.ccunix.ihousekeeping.basedb.domain.Test;
import com.ccunix.ihousekeeping.basedb.dao.Test_Dao_Iface;

@Service("Test_Service")
@Transactional(propagation = Propagation.REQUIRED, rollbackFor = Exception.class)
public class Test_Service_Impl extends BaseService implements Test_Service_Iface {
@Resource
public Test_Dao_Iface test_dao_iface;
public void insert_test(Test test) throws Exception{
test_dao_iface.insert_test(test);
}
public void update_test(Test test) throws Exception{
test_dao_iface.update_test(test);
}
public void delete_test(Test test) throws Exception{
test_dao_iface.delete_test(test);
}
public List queryAll_test(Test test) throws Exception{
return test_dao_iface.queryAll_test(test);
}
public List queryBy_test(Test test) throws Exception{
return test_dao_iface.queryBy_test(test);
}
}