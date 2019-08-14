package com.ccunix.ihousekeeping.basedb.domain;
import com.ccunix.ihousekeeping.base.domain.Base_Model_Business;
import java.util.Date;
public class T_s_user_menu extends Base_Model_Business {
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
private String code;
public void setCode(String code){
this.code=code;
}
public String getCode(){
return this.code;
}
private String tag;
public void setTag(String tag){
this.tag=tag;
}
public String getTag(){
return this.tag;
}
private String parent;
public void setParent(String parent){
this.parent=parent;
}
public String getParent(){
return this.parent;
}
}
