package com.ccunix.ihousekeeping.basedb.domain;
import com.ccunix.ihousekeeping.base.domain.Base_Model_Business;
import java.util.Date;
public class T_s_user_manager_role extends Base_Model_Business {
private String name;
public void setName(String name){
this.name=name;
}
public String getName(){
return this.name;
}
private String description;
public void setDescription(String description){
this.description=description;
}
public String getDescription(){
return this.description;
}
private String this_level;
public void setThis_level(String this_level){
this.this_level=this_level;
}
public String getThis_level(){
return this.this_level;
}
private String parent_id;
public void setParent_id(String parent_id){
this.parent_id=parent_id;
}
public String getParent_id(){
return this.parent_id;
}
}
