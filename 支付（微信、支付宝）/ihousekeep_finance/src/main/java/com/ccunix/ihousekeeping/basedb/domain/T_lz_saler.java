package com.ccunix.ihousekeeping.basedb.domain;
import com.ccunix.ihousekeeping.base.domain.Base_Model_Business;
import java.util.Date;
public class T_lz_saler extends Base_Model_Business {
private String saler_name;
public void setSaler_name(String saler_name){
this.saler_name=saler_name;
}
public String getSaler_name(){
return this.saler_name;
}
private String receive_type;
public void setReceive_type(String receive_type){
this.receive_type=receive_type;
}
public String getReceive_type(){
return this.receive_type;
}
private String receive_acct;
public void setReceive_acct(String receive_acct){
this.receive_acct=receive_acct;
}
public String getReceive_acct(){
return this.receive_acct;
}
private Integer divide;
public void setDivide(Integer divide){
this.divide=divide;
}
public Integer getDivide(){
return this.divide;
}
private Integer is_auto;
public void setIs_auto(Integer is_auto){
this.is_auto=is_auto;
}
public Integer getIs_auto(){
return this.is_auto;
}
private String service_begin;
public void setService_begin(String service_begin){
this.service_begin=service_begin;
}
public String getService_begin(){
return this.service_begin;
}
private String service_end;
public void setService_end(String service_end){
this.service_end=service_end;
}
public String getService_end(){
return this.service_end;
}
private Integer over_day;
public void setOver_day(Integer over_day){
this.over_day=over_day;
}
public Integer getOver_day(){
return this.over_day;
}
}
