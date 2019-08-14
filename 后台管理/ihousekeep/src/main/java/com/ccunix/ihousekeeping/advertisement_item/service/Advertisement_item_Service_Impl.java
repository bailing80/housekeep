package com.ccunix.ihousekeeping.advertisement_item.service;
import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import com.ccunix.ihousekeeping.advertisement_item.dao.Advertisement_item_Dao_Iface;
import com.ccunix.ihousekeeping.advertisement_item.domain.Advertisement_item;
import com.ccunix.ihousekeeping.base.service.BaseService;
import com.ccunix.ihousekeeping.basedb.dao.T_s_advertisement_item_Dao_Iface;
import com.ccunix.ihousekeeping.basedb.domain.T_s_advertisement_item;

@Service("Advertisement_item_Service")
@Transactional(propagation = Propagation.REQUIRED, rollbackFor = Exception.class)
public class Advertisement_item_Service_Impl extends BaseService implements Advertisement_item_Service_Iface {
	@Resource
	public Advertisement_item_Dao_Iface advertisement_item_Dao_Iface;
 
	@Resource
	public T_s_advertisement_item_Dao_Iface t_s_advertisement_item_Dao_Iface;

	/**
	 * 关键字查询及查询所有数据
	 * @param advertisement_item
	 * @return
	 */
	@Override
	public List queryAll_advertisement_item(Advertisement_item advertisement_item) {
		
		List<Advertisement_item> ls = advertisement_item_Dao_Iface.queryAll_advertisement_item(advertisement_item);
		//向前台送数据前将是否有二级链接的"0","1"改为字符串"是","否"
		for (Advertisement_item s : ls) {
			if (s.getIs_sec_link() == 1) {
				s.setIs_sec_link_str("是");
			} else {
				s.setIs_sec_link_str("否");
			}
		}
		return ls;
	}

	/**
	 * 批量删除数据
	*/
	@Override
	public void delete_all_t_s_advertisement_item(Advertisement_item advertisement_item) {
		String[] ids = advertisement_item.getId().split(",");
		try {
			//通过多个ID拼成的字符串批量删除
			for (String string : ids) {
				T_s_advertisement_item t = new T_s_advertisement_item();
				t.setId(string);
				t_s_advertisement_item_Dao_Iface.delete_t_s_advertisement_item(t);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}

	}



}