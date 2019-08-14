package com.ccunix.ihousekeeping.member_information.service;

import java.util.ArrayList;
import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import com.ccunix.ihousekeeping.advertisement.domain.Advertisement_Manager;
import com.ccunix.ihousekeeping.base.service.BaseService;
import com.ccunix.ihousekeeping.member_information.dao.Member_information_Dao_Iface;
import com.ccunix.ihousekeeping.member_information.domain.Member_information;

/**
 * 
 * @ClassName: Member_information_Service_Impl
 * @author 肖云鹏
 * @date 2019年7月18日 下午3:12:07
 *
 */
@Service
@Transactional(propagation = Propagation.REQUIRED, rollbackFor = Exception.class)
public class Member_information_Service_Impl extends BaseService implements Member_information_Service_Iface {
	@Resource
	Member_information_Dao_Iface member_information_Dao_Iface;

	// 查询全部
	@Override
	public List query_all_member_information(Member_information member_information) {
		List<Member_information> ls = null;
		try {
			ls = member_information_Dao_Iface.query_all_member_information(member_information);
			List<Member_information> list = new ArrayList<>();
			// 向前台送数据前将用户状态的"01","01"改为字符串"正常","02"改为字符串"停用"

			for (Member_information m : ls) {
				if (m.getMember_state().equals("01")) {
					m.setMember_state_str("正常");
				} else {
					m.setMember_state_str("停用");
				}
			}
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return ls;
	}

}
