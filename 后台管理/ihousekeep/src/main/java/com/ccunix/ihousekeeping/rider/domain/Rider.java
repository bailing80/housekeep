package com.ccunix.ihousekeeping.rider.domain;
import java.util.Date;
import com.ccunix.ihousekeeping.basedb.domain.T_u_rider;
public class Rider extends T_u_rider {
	private String rownumber;
	
	public String getRownumber() {
		return rownumber;
	}
	public void setRownumber(String rownumber) {
		this.rownumber = rownumber;
	}
	private String pwd;
	public void setPwd(String pwd){
	this.pwd=pwd;
	}
	public String getPwd(){
	return this.pwd;
	}
	private String phone;
	public void setPhone(String phone){
	this.phone=phone;
	}
	public String getPhone(){
	return this.phone;
	}
	private String user_manager_role_id;
	public void setUser_manager_role_id(String user_manager_role_id){
	this.user_manager_role_id=user_manager_role_id;
	}
	public String getUser_manager_role_id(){
	return this.user_manager_role_id;
	}
	private String name;
	public void setName(String name){
	this.name=name;
	}
	public String getName(){
	return this.name;
	}
	private Integer is_login;
	public void setIs_login(Integer is_login){
	this.is_login=is_login;
	}
	public Integer getIs_login(){
	return this.is_login;
	}
	private Integer latitude;
	public void setLatitude(Integer latitude){
	this.latitude=latitude;
	}
	public Integer getLatitude(){
	return this.latitude;
	}
	private Integer longitude;
	public void setLongitude(Integer longitude){
	this.longitude=longitude;
	}
	public Integer getLongitude(){
	return this.longitude;
	}
	private String order_statue;
	public void setOrder_statue(String order_statue){
	this.order_statue=order_statue;
	}
	public String getOrder_statue(){
	return this.order_statue;
	}
	private Date on_time;
	public void setOn_time(Date on_time){
	this.on_time=on_time;
	}
	public Date getOn_time(){
	return this.on_time;
	}
	private Date off_time;
	public void setOff_time(Date off_time){
	this.off_time=off_time;
	}
	public Date getOff_time(){
	return this.off_time;
	}
	private String photo_url;
	public void setPhoto_url(String photo_url){
	this.photo_url=photo_url;
	}
	public String getPhoto_url(){
	return this.photo_url;
	}
	private String rider_code;
	public void setRider_code(String rider_code){
	this.rider_code=rider_code;
	}
	public String getRider_code(){
	return this.rider_code;
	}
	private String rider_sum;
	public void setRider_sum(String rider_sum){
	this.rider_sum=rider_sum;
	}
	public String getRider_sum(){
	return this.rider_sum;
	}
	private String is_excellent;
	public void setIs_excellent(String is_excellent){
	this.is_excellent=is_excellent;
	}
	public String getIs_excellent(){
	return this.is_excellent;
	}
	private Integer show_order;
	public void setShow_order(Integer show_order){
	this.show_order=show_order;
	}
	public Integer getShow_order(){
	return this.show_order;
	}
	private String link_pic;
	public void setLink_pic(String link_pic){
	this.link_pic=link_pic;
	}
	public String getLink_pic(){
	return this.link_pic;
	}
	private String is_show;
	public void setIs_show(String is_show){
	this.is_show=is_show;
	}
	public String getIs_show(){
	return this.is_show;
	}
	private String is_show_link;
	public void setIs_show_link(String is_show_link){
	this.is_show_link=is_show_link;
	}
	public String getIs_show_link(){
	return this.is_show_link;
	}
	private Integer is_haveleader;
	public void setIs_haveleader(Integer is_haveleader){
	this.is_haveleader=is_haveleader;
	}
	public Integer getIs_haveleader(){
	return this.is_haveleader;
	}
	private String leader_role_id;
	public void setLeader_role_id(String leader_role_id){
	this.leader_role_id=leader_role_id;
	}
	public String getLeader_role_id(){
	return this.leader_role_id;
	}
	private String leader_id;
	public void setLeader_id(String leader_id){
	this.leader_id=leader_id;
	}
	public String getLeader_id(){
	return this.leader_id;
	}
	}
