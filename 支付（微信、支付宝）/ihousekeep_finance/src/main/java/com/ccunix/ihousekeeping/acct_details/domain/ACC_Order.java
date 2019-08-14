package com.ccunix.ihousekeeping.acct_details.domain;
import java.util.Date;

import com.ccunix.ihousekeeping.basedb.domain.T_lz_order;
/**
 * author 黄爽
 */

public class ACC_Order extends T_lz_order {
	private String keyword_order_time_begin;
	private String keyword_order_time_end;
	private String keyword_saler_name;
	private String keyword_acct_name;
	private String rownumber;
	private String saler_name;
	private Double divide;
	private String type_name;
	private String acct_name;
	private String order_state;
	private String receive_type;
	private String receive_type_name;
	private Integer is_auto;
	private String receive_acct;
	private String  order_no_str;
	
	
	public String getOrder_no_str() {
		return order_no_str;
	}
	public void setOrder_no_str(String order_no_str) {
		this.order_no_str = order_no_str;
	}
	public String getReceive_acct() {
		return receive_acct;
	}
	public void setReceive_acct(String receive_acct) {
		this.receive_acct = receive_acct;
	}
	
	public Integer getIs_auto() {
		return is_auto;
	}
	public void setIs_auto(Integer is_auto) {
		this.is_auto = is_auto;
	}
	public String getReceive_type_name() {
		return receive_type_name;
	}
	public void setReceive_type_name(String receive_type_name) {
		this.receive_type_name = receive_type_name;
	}
	public String getReceive_type() {
		return receive_type;
	}
	public void setReceive_type(String receive_type) {
		this.receive_type = receive_type;
	}
	public String getOrder_state() {
		return order_state;
	}
	public void setOrder_state(String order_state) {
		this.order_state = order_state;
	}
	private Double saler_money;
	private String receive_money;
	
	public Double getSaler_money() {
		return saler_money;
	}
	public void setSaler_money(Double saler_money) {
		this.saler_money = saler_money;
	}
	public String getReceive_money() {
		return receive_money;
	}
	public void setReceive_money(String receive_money) {
		this.receive_money = receive_money;
	}
	public String getKeyword_order_time_begin() {
		return keyword_order_time_begin;
	}
	public void setKeyword_order_time_begin(String keyword_order_time_begin) {
		this.keyword_order_time_begin = keyword_order_time_begin;
	}
	public String getKeyword_order_time_end() {
		return keyword_order_time_end;
	}
	public void setKeyword_order_time_end(String keyword_order_time_end) {
		this.keyword_order_time_end = keyword_order_time_end;
	}
	public String getKeyword_saler_name() {
		return keyword_saler_name;
	}
	public void setKeyword_saler_name(String keyword_saler_name) {
		this.keyword_saler_name = keyword_saler_name;
	}
	public String getKeyword_acct_name() {
		return keyword_acct_name;
	}
	public void setKeyword_acct_name(String keyword_acct_name) {
		this.keyword_acct_name = keyword_acct_name;
	}
	public String getAcct_name() {
		return acct_name;
	}
	public void setAcct_name(String acct_name) {
		this.acct_name = acct_name;
	}
	public String getRownumber() {
		return rownumber;
	}
	public void setRownumber(String rownumber) {
		this.rownumber = rownumber;
	}
	public String getSaler_name() {
		return saler_name;
	}
	public void setSaler_name(String saler_name) {
		this.saler_name = saler_name;
	}
	public Double getDivide() {
		return divide;
	}
	public void setDivide(Double divide) {
		this.divide = divide;
	}
	public String getType_name() {
		return type_name;
	}
	public void setType_name(String type_name) {
		this.type_name = type_name;
	}
	private String order_no;
	public void setOrder_no(String order_no){
	this.order_no=order_no;
	}
	public String getOrder_no(){
	return this.order_no;
	}
	private String order_time_str ;
	public void setOrder_time_str(String order_time_str ){
	this.order_time_str =order_time_str;
	}
	public String  getOrder_time_str (){
	return this.order_time_str ;
	}
	private Date order_time;
	public void setOrder_time(Date order_time){
	this.order_time=order_time;
	}
	public Date getOrder_time(){
	return this.order_time;
	}
	private String orde_state;
	public void setOrde_state(String orde_state){
	this.orde_state=orde_state;
	}
	public String getOrde_state(){
	return this.orde_state;
	}
	private String saler_id;
	public void setSaler_id(String saler_id){
	this.saler_id=saler_id;
	}
	public String getSaler_id(){
	return this.saler_id;
	}
	private String pay_type;
	public void setPay_type(String pay_type){
	this.pay_type=pay_type;
	}
	public String getPay_type(){
	return this.pay_type;
	}
	}