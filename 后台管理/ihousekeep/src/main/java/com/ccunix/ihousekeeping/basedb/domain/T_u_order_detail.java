package com.ccunix.ihousekeeping.basedb.domain;
import com.ccunix.ihousekeeping.base.domain.Base_Model_Business;
import java.util.Date;
public class T_u_order_detail extends Base_Model_Business {
private String cancel_time_str ;
public void setCancel_time_str(String cancel_time_str ){
this.cancel_time_str =cancel_time_str;
}
public String  getCancel_time_str (){
return this.cancel_time_str ;
}
private Date cancel_time;
public void setCancel_time(Date cancel_time){
this.cancel_time=cancel_time;
}
public Date getCancel_time(){
return this.cancel_time;
}
private String order_id;
public void setOrder_id(String order_id){
this.order_id=order_id;
}
public String getOrder_id(){
return this.order_id;
}
private String service_item_id;
public void setService_item_id(String service_item_id){
this.service_item_id=service_item_id;
}
public String getService_item_id(){
return this.service_item_id;
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
private String appointment_time_str ;
public void setAppointment_time_str(String appointment_time_str ){
this.appointment_time_str =appointment_time_str;
}
public String  getAppointment_time_str (){
return this.appointment_time_str ;
}
private Date appointment_time;
public void setAppointment_time(Date appointment_time){
this.appointment_time=appointment_time;
}
public Date getAppointment_time(){
return this.appointment_time;
}
private String member_id;
public void setMember_id(String member_id){
this.member_id=member_id;
}
public String getMember_id(){
return this.member_id;
}
private String order_status;
public void setOrder_status(String order_status){
this.order_status=order_status;
}
public String getOrder_status(){
return this.order_status;
}
private String send_member;
public void setSend_member(String send_member){
this.send_member=send_member;
}
public String getSend_member(){
return this.send_member;
}
private String rider_id;
public void setRider_id(String rider_id){
this.rider_id=rider_id;
}
public String getRider_id(){
return this.rider_id;
}
private String cancel_role;
public void setCancel_role(String cancel_role){
this.cancel_role=cancel_role;
}
public String getCancel_role(){
return this.cancel_role;
}
private String cancel_member;
public void setCancel_member(String cancel_member){
this.cancel_member=cancel_member;
}
public String getCancel_member(){
return this.cancel_member;
}
private String order_over_time_str ;
public void setOrder_over_time_str(String order_over_time_str ){
this.order_over_time_str =order_over_time_str;
}
public String  getOrder_over_time_str (){
return this.order_over_time_str ;
}
private Date order_over_time;
public void setOrder_over_time(Date order_over_time){
this.order_over_time=order_over_time;
}
public Date getOrder_over_time(){
return this.order_over_time;
}
}
