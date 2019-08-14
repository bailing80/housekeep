package com.ccunix.ihousekeeping.member_information.service;

import java.util.List;

import com.ccunix.ihousekeeping.member_information.domain.Member_information;

/**
 * 
 * @ClassName: Member_information_Service_Iface
 * @author 肖云鹏
 * @date 2019年7月18日 下午3:11:58
 *
 */
public interface Member_information_Service_Iface {
	List query_all_member_information(Member_information member_information) throws Exception;

}
