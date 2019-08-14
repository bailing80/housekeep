package com.ccunix.ihousekeeping.basedb.domain;
import com.ccunix.ihousekeeping.base.domain.Base_Model_Business;
import java.util.Date;
public class T_u_manager extends Base_Model_Business {
private String user_manager_role_id;
public void setUser_manager_role_id(String user_manager_role_id){
this.user_manager_role_id=user_manager_role_id;
}
public String getUser_manager_role_id(){
return this.user_manager_role_id;
}
private String phone;
public void setPhone(String phone){
this.phone=phone;
}
public String getPhone(){
return this.phone;
}
private String t_s_id;
public void setT_s_id(String t_s_id){
this.t_s_id=t_s_id;
}
public String getT_s_id(){
return this.t_s_id;
}
private String pwd;
public void setPwd(String pwd){
this.pwd=pwd;
}
public String getPwd(){
return this.pwd;
}
private Integer is_login;
public void setIs_login(Integer is_login){
this.is_login=is_login;
}
public Integer getIs_login(){
return this.is_login;
}
private String name;
public void setName(String name){
this.name=name;
}
public String getName(){
return this.name;
}
}
