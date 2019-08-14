package com.ccunix.ihousekeeping.acct_details.service;

import java.util.Date;
import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import com.ccunix.ihousekeeping.acct_details.dao.ACC_Order_Dao_Iface;
import com.ccunix.ihousekeeping.acct_details.domain.ACC_Order;
import com.ccunix.ihousekeeping.alipay.service.Alipay_Service_Impl;
import com.ccunix.ihousekeeping.base.service.BaseService;
import com.ccunix.ihousekeeping.base.util.DateTimeUtil;
import com.ccunix.ihousekeeping.basedb.dao.T_lz_order_Dao_Iface;
import com.ccunix.ihousekeeping.basedb.dao.T_lz_receive_type_Dao_Iface;
import com.ccunix.ihousekeeping.basedb.domain.T_lz_order;
import com.ccunix.ihousekeeping.basedb.domain.T_lz_receive_type;
import com.ccunix.ihousekeeping.basedb.service.T_lz_order_Service_Iface;

@Service
@Transactional(propagation = Propagation.REQUIRED, rollbackFor = Exception.class)
public class ACC_Order_Service_Impl extends BaseService implements ACC_Order_Service_Iface {
	@Resource
	public ACC_Order_Dao_Iface acc_order_Dao_Iface;
 
	@Resource
	public T_lz_order_Dao_Iface t_lz_order_Dao_Iface;

	@Resource
	public T_lz_receive_type_Dao_Iface t_lz_receive_type_Dao_Iface;
	
	/**
	 * 关键字查询及查询所有数据
	 * @author 黄爽
	 * @return
	 */
	@Override
	public List queryAll_acc_order(ACC_Order acc_order)  throws Exception {
		List<ACC_Order> ls = acc_order_Dao_Iface.queryAll_acc_order(acc_order);
		if(ls.size() != 0){
			for (ACC_Order acc : ls) {
				T_lz_receive_type t_lz_receive_type = new T_lz_receive_type();
				t_lz_receive_type.setType_code(acc.getReceive_type());
				List<T_lz_receive_type> typeList = t_lz_receive_type_Dao_Iface.queryAll_t_lz_receive_type(t_lz_receive_type);
				if(typeList.size()>0){
					acc.setReceive_type_name(typeList.get(0).getType_name());
				}else {
					acc.setReceive_type_name(acc.getReceive_type());
				}
				acc.setOrder_state(acc.getOrde_state().equals("01")?"未分账":"已分账");
				acc.setSaler_money(acc.getPay_money()*acc.getDivide()/100);
				acc.setReceive_money(String.format("%.2f",acc.getPay_money()-acc.getSaler_money()));
				//acc.setReceive_money(acc.getPay_money()-acc.getSaler_money());
				//String a = df.format();
				//acc.setOrder_state(acc.getOrde_state().equals("01")?"未分账":"已分账");
			}
		}
		return ls;
	}

	/**
	 * 关键字查询及查询所有数据
	 * @author 黄爽
	 * @return
	 */
	@Override
	public List queryAll_jz_acc_order(ACC_Order acc_order)  throws Exception {
		List<ACC_Order> ls = acc_order_Dao_Iface.queryAll_jz_acc_order(acc_order);
		if(ls.size() != 0){
			for (ACC_Order acc : ls) {
				T_lz_receive_type t_lz_receive_type = new T_lz_receive_type();
				t_lz_receive_type.setType_code(acc.getReceive_type());
				List<T_lz_receive_type> typeList = t_lz_receive_type_Dao_Iface.queryAll_t_lz_receive_type(t_lz_receive_type);
				if(typeList.size()>0){
					acc.setReceive_type_name(typeList.get(0).getType_name());
				}else {
					acc.setReceive_type_name(acc.getReceive_type());
				}
				acc.setOrder_state(acc.getOrde_state().equals("01")?"未分账":"已分账");
				acc.setSaler_money(acc.getPay_money()*acc.getDivide()/100);
				acc.setReceive_money(String.format("%.2f",acc.getPay_money()-acc.getSaler_money()));
			}
		}
		return ls;
	} 
	@Resource
	T_lz_order_Service_Iface t_lz_order_Service_Iface;
	/**
	 * 点击按钮转账
	 * @author 黄爽
	 * @return
	 */
	@Override
	public List show_acc_order(ACC_Order acc_order)  throws Exception {
		List<ACC_Order> ls = acc_order_Dao_Iface.queryAll_acc_order(acc_order);
		Alipay_Service_Impl a = new Alipay_Service_Impl();
		if(ls.size() != 0){
			for (ACC_Order acc : ls) {
				if(acc.getOrde_state().equals("01")){
					acc.setSaler_money(acc.getPay_money()*acc.getDivide()/100);
					acc.setReceive_money(String.format("%.2f",acc.getPay_money()-acc.getSaler_money()));
					System.out.println(acc.getSaler_money());
					System.out.println(Double.parseDouble(acc.getReceive_money()));
					String aaa = a.apliayToUserAlipay(acc.getReceive_acct(),"东学","东学",acc.getSaler_money());
					String aa = a.apliayToUserAlipay("13944525950","东学","东学",Double.parseDouble(acc.getReceive_money()));
					System.out.println(aa+"=aa");
					System.out.println(acc.getId()+"=acc.getId()");
					if (aa.equals("succese") && aaa.equals("succese") ) {
						System.out.println(aa+"=aa");
						T_lz_order t_lz_order  = new T_lz_order();
						t_lz_order.setId(acc.getId());
						t_lz_order.setOrde_state("02");
						t_lz_order_Service_Iface.update_t_lz_order(t_lz_order);
					}
					
			    }
				
			}
		}
		return ls;
	}
	/**
	 * 自动---转账
	 * @author 黄爽
	 * @return
	 */
	public List queryAll_alipay(ACC_Order acc_order) throws Exception{
		List<ACC_Order> ls = acc_order_Dao_Iface.queryAll_alipay(acc_order);
		Alipay_Service_Impl a = new Alipay_Service_Impl();
		System.out.println(ls.size());
		if(ls.size() != 0){
			for (ACC_Order acc : ls) {
				if(acc.getOrde_state().equals("01") && acc.getIs_auto() == 1){
					
					acc.setSaler_money((double)acc.getPay_money()*acc.getDivide()/100);
					acc.setReceive_money(String.format("%.2f",acc.getPay_money()-acc.getSaler_money()));
					System.out.println(acc.getSaler_money());
					System.out.println(Double.parseDouble(acc.getReceive_money()));
					String aaa = a.apliayToUserAlipay(acc.getReceive_acct(),"东学","东学",acc.getSaler_money());
					String aa = a.apliayToUserAlipay("13944525950","东学","东学",Double.parseDouble(acc.getReceive_money()));
					System.out.println(aa);
					
					if (aa.equals("succese") && aaa.equals("succese")) {
						
						System.out.println(aa+"=aa");
						T_lz_order t_lz_order  = new T_lz_order();
						t_lz_order.setId(acc.getId());
						t_lz_order.setOrde_state("02");
						t_lz_order_Service_Iface.update_t_lz_order(t_lz_order);

					}
			    }
			}
	     }
		return ls;
}
	
	@Override
	public String makeOrderNo() throws Exception {
		String yymmdd = DateTimeUtil.getDateString(DateTimeUtil.dateFormat_yyMMDD, new Date());
		int seq = acc_order_Dao_Iface.getOrderNo_seq();
		String str = yymmdd + seq;
		return str;
	}

}
