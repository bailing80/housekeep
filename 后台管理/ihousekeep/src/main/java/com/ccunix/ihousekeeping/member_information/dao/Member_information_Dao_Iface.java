package com.ccunix.ihousekeeping.member_information.dao;

import java.util.List;

import com.ccunix.ihousekeeping.member_information.domain.Member_information;

/**
 * 
 * @ClassName: Member_information_Dao_Iface
 * @author 肖云鹏
 * @date 2019年7月18日 下午3:12:18
 *
 */
public interface Member_information_Dao_Iface {
	List query_all_member_information(Member_information member_information) throws Exception;

	List query_all_member_information_By_phone(Member_information member_information);

}
