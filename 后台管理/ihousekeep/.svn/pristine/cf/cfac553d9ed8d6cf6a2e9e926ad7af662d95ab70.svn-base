package com.ccunix.ihousekeeping.map.service;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import com.ccunix.ihousekeeping.base.controller.FileUpLoadController;
import com.ccunix.ihousekeeping.base.service.BaseService;
import com.ccunix.ihousekeeping.base.util.ExcelUtil;
import com.ccunix.ihousekeeping.base.util.UUID_Tools;
import com.ccunix.ihousekeeping.basedb.dao.Map_Dao_Iface;
import com.ccunix.ihousekeeping.basedb.domain.Map;
import com.ccunix.ihousekeeping.map.dao.Map_H_Dao_Iface;

@Service
@Transactional(propagation = Propagation.REQUIRED, rollbackFor = Exception.class)
public class Excel_Import_Service_Impl extends BaseService implements Excel_Import_Service_Iface {

	@Resource
	Map_Dao_Iface map_dao_iface;
	
	@Resource
	Map_H_Dao_Iface map_h_dao_iface;
	
	@Override
	public void import_excel(String excel_name) throws Exception {
		try {
			map_h_dao_iface.deleteAllmap();
			List<String[]> ls = ExcelUtil.readExcel(FileUpLoadController.fileSavePath + "/" + excel_name, "已签到");
			for (int i = 0; i < ls.size(); i++) {
				String[] r = ls.get(i);
				System.out.println(r[0] + "   " + r[1] + "   " + r[2]);
				Map map = new Map();
				map.setId(UUID_Tools.getUUID());
				map.setLatitude(r[0]);
				map.setLongitude(r[1]);
				map.setColor(r[2]);
				map_dao_iface.insert_map(map);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
