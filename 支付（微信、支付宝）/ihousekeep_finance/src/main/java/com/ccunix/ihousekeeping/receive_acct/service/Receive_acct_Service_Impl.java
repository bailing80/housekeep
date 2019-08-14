package com.ccunix.ihousekeeping.receive_acct.service;

import java.util.ArrayList;
import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import com.ccunix.ihousekeeping.base.service.BaseService;
import com.ccunix.ihousekeeping.base.util.UUID_Tools;
import com.ccunix.ihousekeeping.basedb.dao.T_lz_receive_acct_Dao_Iface;
import com.ccunix.ihousekeeping.basedb.dao.T_lz_weixin_info_Dao_Iface;
import com.ccunix.ihousekeeping.basedb.dao.T_lz_zfb_info_Dao_Iface;
import com.ccunix.ihousekeeping.basedb.domain.T_lz_weixin_info;
import com.ccunix.ihousekeeping.basedb.domain.T_lz_zfb_info;
import com.ccunix.ihousekeeping.receive_acct.dao.Receive_acct_Dao_Iface;
import com.ccunix.ihousekeeping.receive_acct.domain.Receive_acct;

@Service
@Transactional(propagation = Propagation.REQUIRED, rollbackFor = Exception.class)
public class Receive_acct_Service_Impl extends BaseService implements Receive_acct_Service_Iface {
	@Resource
	public Receive_acct_Dao_Iface receive_acct_Dao_Iface;

	@Resource
	public T_lz_receive_acct_Dao_Iface t_lz_receive_acct_Dao_Iface;

	@Resource
	public T_lz_weixin_info_Dao_Iface t_lz_weixin_info_Dao_Iface;

	@Resource
	public T_lz_zfb_info_Dao_Iface t_lz_zfb_info_Dao_Iface;

	/**
	 * 关键字查询及查询所有数据
	 * 
	 * @param receive_acct
	 * @return
	 */
	@Override
	public List queryAll_receive_acct(Receive_acct receive_acct) throws Exception {
		List<Receive_acct> ls = receive_acct_Dao_Iface.queryAll_receive_acct(receive_acct);
		return ls;
	}

	/**
	 * 批量删除数据
	 * 
	 * @param receive_acct
	 */
	@Override
	public void delete_batch_receive_acct(Receive_acct receive_acct) throws Exception {
		String[] ids = receive_acct.getId().split(",");
		try {
			// 通过多个ID拼成的字符串批量删除
			for (String string : ids) {
				Receive_acct acct = new Receive_acct();
				acct.setId(string);
				t_lz_receive_acct_Dao_Iface.delete_t_lz_receive_acct(acct);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	/**
	 * 编辑数据
	 * 
	 * @param receive_acct
	 */
	@Override
	public void edit_receive_acct(Receive_acct receive_acct) throws Exception {
		// 删除微信及支付宝
		if (receive_acct.getCheck() == 0) {
			T_lz_weixin_info t_lz_weixin_info = new T_lz_weixin_info();
			t_lz_weixin_info.setMapping_id(receive_acct.getId());
			List<T_lz_weixin_info> wx_ls = t_lz_weixin_info_Dao_Iface.queryAll_t_lz_weixin_info(t_lz_weixin_info);
			// 删除微信
			if (wx_ls.size() > 0) {
				t_lz_weixin_info_Dao_Iface.delete_t_lz_weixin_info(wx_ls.get(0));
			}
			T_lz_zfb_info t_lz_zfb_info = new T_lz_zfb_info();
			t_lz_zfb_info.setMapping_id(receive_acct.getId());
			List<T_lz_zfb_info> zfb_ls = t_lz_zfb_info_Dao_Iface.queryAll_t_lz_zfb_info(t_lz_zfb_info);
			// 删除支付宝
			if (zfb_ls.size() > 0) {
				t_lz_zfb_info_Dao_Iface.delete_t_lz_zfb_info(zfb_ls.get(0));
			}
		}
		// 添加或修改支付宝并删除微信
		else if (receive_acct.getCheck() == 1) {
			// 添加支付宝
			T_lz_zfb_info t_lz_zfb_info = new T_lz_zfb_info();
			t_lz_zfb_info.setMapping_id(receive_acct.getId());
			List<T_lz_zfb_info> ls = t_lz_zfb_info_Dao_Iface.queryAll_t_lz_zfb_info(t_lz_zfb_info);
			t_lz_zfb_info.setAcct(receive_acct.getZfb_acc());
			t_lz_zfb_info.setKey(receive_acct.getZfb_key());
			t_lz_zfb_info.setApp_id(receive_acct.getApp_id());
			t_lz_zfb_info.setMerchant_private_key(receive_acct.getMerchant_private_key());
			t_lz_zfb_info.setAlipay_public_key(receive_acct.getAlipay_public_key());
			t_lz_zfb_info.setNotify_url(receive_acct.getNotify_url());
			t_lz_zfb_info.setReturn_url(receive_acct.getReturn_url());
			t_lz_zfb_info.setSign_type(receive_acct.getSign_type());
			t_lz_zfb_info.setCharset(receive_acct.getCharset());
			t_lz_zfb_info.setGatewayurl(receive_acct.getGatewayurl());
			t_lz_zfb_info.setZfbchar(receive_acct.getZfbchar());
			// 数据库没有此数据
			if (ls.size() == 0) {
				t_lz_zfb_info.setId(UUID_Tools.getUUID());
				t_lz_zfb_info_Dao_Iface.insert_t_lz_zfb_info(t_lz_zfb_info);
			} else {
				// 将查询出来的数据id取出用于修改操作
				t_lz_zfb_info.setId(ls.get(0).getId());
				t_lz_zfb_info_Dao_Iface.update_t_lz_zfb_info(t_lz_zfb_info);
			}
			T_lz_weixin_info t_lz_weixin_info = new T_lz_weixin_info();
			t_lz_weixin_info.setMapping_id(receive_acct.getId());
			List<T_lz_weixin_info> wx_ls = t_lz_weixin_info_Dao_Iface.queryAll_t_lz_weixin_info(t_lz_weixin_info);
			// 删除微信
			if (wx_ls.size() > 0) {
				t_lz_weixin_info_Dao_Iface.delete_t_lz_weixin_info(wx_ls.get(0));
			}
		}

		// 添加或修改微信并删除支付宝
		else if (receive_acct.getCheck() == 2) {
			// 添加微信
			T_lz_weixin_info t_lz_weixin_info = new T_lz_weixin_info();
			t_lz_weixin_info.setMapping_id(receive_acct.getId());
			List<T_lz_weixin_info> ls = t_lz_weixin_info_Dao_Iface.queryAll_t_lz_weixin_info(t_lz_weixin_info);
			t_lz_weixin_info.setAcct(receive_acct.getWx_acc());
			t_lz_weixin_info.setKey(receive_acct.getWx_key());
			// 数据库没有此数据
			if (ls.size() == 0) {
				t_lz_weixin_info.setId(UUID_Tools.getUUID());
				t_lz_weixin_info_Dao_Iface.insert_t_lz_weixin_info(t_lz_weixin_info);
			} else {
				// 将查询出来的数据id取出用于修改操作
				t_lz_weixin_info.setId(ls.get(0).getId());
				t_lz_weixin_info_Dao_Iface.update_t_lz_weixin_info(t_lz_weixin_info);
			}
			T_lz_zfb_info t_lz_zfb_info = new T_lz_zfb_info();
			t_lz_zfb_info.setMapping_id(receive_acct.getId());
			List<T_lz_zfb_info> zfb_ls = t_lz_zfb_info_Dao_Iface.queryAll_t_lz_zfb_info(t_lz_zfb_info);
			// 删除支付宝
			if (zfb_ls.size() > 0) {
				t_lz_zfb_info_Dao_Iface.delete_t_lz_zfb_info(zfb_ls.get(0));
			}
		}
		// 添加或修改微信及支付宝
		else {
			// 添加微信
			T_lz_weixin_info t_lz_weixin_info = new T_lz_weixin_info();
			t_lz_weixin_info.setMapping_id(receive_acct.getId());
			List<T_lz_weixin_info> ls_wx = t_lz_weixin_info_Dao_Iface.queryAll_t_lz_weixin_info(t_lz_weixin_info);
			t_lz_weixin_info.setAcct(receive_acct.getWx_acc());
			t_lz_weixin_info.setKey(receive_acct.getWx_key());
			// 数据库没有此数据
			if (ls_wx.size() == 0) {
				t_lz_weixin_info.setId(UUID_Tools.getUUID());
				t_lz_weixin_info_Dao_Iface.insert_t_lz_weixin_info(t_lz_weixin_info);
			} else {
				// 将查询出来的数据id取出用于修改操作
				t_lz_weixin_info.setId(ls_wx.get(0).getId());
				t_lz_weixin_info_Dao_Iface.update_t_lz_weixin_info(t_lz_weixin_info);
			}
			// 添加支付宝
			T_lz_zfb_info t_lz_zfb_info = new T_lz_zfb_info();
			t_lz_zfb_info.setMapping_id(receive_acct.getId());
			List<T_lz_zfb_info> ls_zfb = t_lz_zfb_info_Dao_Iface.queryAll_t_lz_zfb_info(t_lz_zfb_info);
			t_lz_zfb_info.setAcct(receive_acct.getZfb_acc());
			t_lz_zfb_info.setKey(receive_acct.getZfb_key());
			t_lz_zfb_info.setApp_id(receive_acct.getApp_id());
			t_lz_zfb_info.setMerchant_private_key(receive_acct.getMerchant_private_key());
			t_lz_zfb_info.setAlipay_public_key(receive_acct.getAlipay_public_key());
			t_lz_zfb_info.setNotify_url(receive_acct.getNotify_url());
			t_lz_zfb_info.setReturn_url(receive_acct.getReturn_url());
			t_lz_zfb_info.setSign_type(receive_acct.getSign_type());
			t_lz_zfb_info.setCharset(receive_acct.getCharset());
			t_lz_zfb_info.setGatewayurl(receive_acct.getGatewayurl());
			t_lz_zfb_info.setZfbchar(receive_acct.getZfbchar());
			// 数据库没有此数据
			if (ls_zfb.size() == 0) {
				t_lz_zfb_info.setId(UUID_Tools.getUUID());
				t_lz_zfb_info_Dao_Iface.insert_t_lz_zfb_info(t_lz_zfb_info);
			} else {
				// 将查询出来的数据id取出用于修改操作
				t_lz_zfb_info.setId(ls_zfb.get(0).getId());
				t_lz_zfb_info_Dao_Iface.update_t_lz_zfb_info(t_lz_zfb_info);
			}
		}
	}
	
	/**
	 * 显示数据
	 * @param receive_acct
	 */
	@Override
	public List show_receive_acct(Receive_acct receive_acct) throws Exception{
		List ls = new ArrayList();
		int check = 0;
		T_lz_weixin_info t_lz_weixin_info = new T_lz_weixin_info();
		t_lz_weixin_info.setMapping_id(receive_acct.getId());
		List<T_lz_weixin_info> wx_ls = t_lz_weixin_info_Dao_Iface.queryAll_t_lz_weixin_info(t_lz_weixin_info);
		if(wx_ls.size()>0){
			check+=2;
			receive_acct.setWx_acc(wx_ls.get(0).getAcct());
			receive_acct.setWx_key(wx_ls.get(0).getKey());
		}
		T_lz_zfb_info t_lz_zfb_info = new T_lz_zfb_info();
		t_lz_zfb_info.setMapping_id(receive_acct.getId());
		List<T_lz_zfb_info> zfb_ls = t_lz_zfb_info_Dao_Iface.queryAll_t_lz_zfb_info(t_lz_zfb_info);
		if(zfb_ls.size()>0){
			check++;
			receive_acct.setZfb_acc(zfb_ls.get(0).getAcct());
			receive_acct.setZfb_key(zfb_ls.get(0).getKey());
			receive_acct.setApp_id(zfb_ls.get(0).getApp_id());
			receive_acct.setMerchant_private_key(zfb_ls.get(0).getMerchant_private_key());
			receive_acct.setAlipay_public_key(zfb_ls.get(0).getAlipay_public_key());
			receive_acct.setNotify_url(zfb_ls.get(0).getNotify_url());
			receive_acct.setReturn_url(zfb_ls.get(0).getReturn_url());
			receive_acct.setSign_type(zfb_ls.get(0).getSign_type());
			receive_acct.setCharset(zfb_ls.get(0).getCharset());
			receive_acct.setGatewayurl(zfb_ls.get(0).getGatewayurl());
			receive_acct.setZfbchar(zfb_ls.get(0).getZfbchar());
		}
		receive_acct.setCheck(check);
		ls.add(receive_acct);
		return ls;
	}
}
