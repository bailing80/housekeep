package com.ccunix.ihousekeeping.basedb.domain;
import com.ccunix.ihousekeeping.base.domain.Base_Model_Business;
import java.util.Date;
public class T_u_service_item extends Base_Model_Business {
private String item_name;
public void setItem_name(String item_name){
this.item_name=item_name;
}
public String getItem_name(){
return this.item_name;
}
private Integer item_price;
public void setItem_price(Integer item_price){
this.item_price=item_price;
}
public Integer getItem_price(){
return this.item_price;
}
private String unit_id;
public void setUnit_id(String unit_id){
this.unit_id=unit_id;
}
public String getUnit_id(){
return this.unit_id;
}
private String item_picture;
public void setItem_picture(String item_picture){
this.item_picture=item_picture;
}
public String getItem_picture(){
return this.item_picture;
}
private String project_id;
public void setProject_id(String project_id){
this.project_id=project_id;
}
public String getProject_id(){
return this.project_id;
}
private Integer item_upper_limit;
public void setItem_upper_limit(Integer item_upper_limit){
this.item_upper_limit=item_upper_limit;
}
public Integer getItem_upper_limit(){
return this.item_upper_limit;
}
private Integer item_lower_limit;
public void setItem_lower_limit(Integer item_lower_limit){
this.item_lower_limit=item_lower_limit;
}
public Integer getItem_lower_limit(){
return this.item_lower_limit;
}
private Integer upper_per_price;
public void setUpper_per_price(Integer upper_per_price){
this.upper_per_price=upper_per_price;
}
public Integer getUpper_per_price(){
return this.upper_per_price;
}
private Integer upper_total_price;
public void setUpper_total_price(Integer upper_total_price){
this.upper_total_price=upper_total_price;
}
public Integer getUpper_total_price(){
return this.upper_total_price;
}
private Integer lower_per_price;
public void setLower_per_price(Integer lower_per_price){
this.lower_per_price=lower_per_price;
}
public Integer getLower_per_price(){
return this.lower_per_price;
}
private Integer lower_total_price;
public void setLower_total_price(Integer lower_total_price){
this.lower_total_price=lower_total_price;
}
public Integer getLower_total_price(){
return this.lower_total_price;
}
}
