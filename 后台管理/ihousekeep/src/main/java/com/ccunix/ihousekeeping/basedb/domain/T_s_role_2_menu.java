package com.ccunix.ihousekeeping.basedb.domain;
import com.ccunix.ihousekeeping.base.domain.Base_Model_Business;
import java.util.Date;
public class T_s_role_2_menu extends Base_Model_Business {
private String role_id;
public void setRole_id(String role_id){
this.role_id=role_id;
}
public String getRole_id(){
return this.role_id;
}
private String menu_id;
public void setMenu_id(String menu_id){
this.menu_id=menu_id;
}
public String getMenu_id(){
return this.menu_id;
}
}
