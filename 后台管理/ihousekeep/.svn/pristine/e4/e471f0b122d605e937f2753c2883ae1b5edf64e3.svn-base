package com.ccunix.ihousekeeping.basedb.service;
import java.util.List;
import javax.annotation.Resource;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;
import com.ccunix.ihousekeeping.base.domain.AppDataModel;
import com.ccunix.ihousekeeping.base.service.BaseService;
import com.ccunix.ihousekeeping.basedb.domain.Map;
import com.ccunix.ihousekeeping.basedb.dao.Map_Dao_Iface;

@Service("Map_Service")
@Transactional(propagation = Propagation.REQUIRED, rollbackFor = Exception.class)
public class Map_Service_Impl extends BaseService implements Map_Service_Iface {
@Resource
public Map_Dao_Iface map_dao_iface;
public void insert_map(Map map) throws Exception{
map_dao_iface.insert_map(map);
}
public void update_map(Map map) throws Exception{
map_dao_iface.update_map(map);
}
public void delete_map(Map map) throws Exception{
map_dao_iface.delete_map(map);
}
public List queryAll_map(Map map) throws Exception{
return map_dao_iface.queryAll_map(map);
}
public List queryBy_map(Map map) throws Exception{
return map_dao_iface.queryBy_map(map);
}
}