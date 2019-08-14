package com.ccunix.ihousekeeping.basedb.domain;
import com.ccunix.ihousekeeping.base.domain.Base_Model_Business;
import java.util.Date;
public class T_s_advertisement_item extends Base_Model_Business {
private String item_url;
public void setItem_url(String item_url){
this.item_url=item_url;
}
public String getItem_url(){
return this.item_url;
}
private String title;
public void setTitle(String title){
this.title=title;
}
public String getTitle(){
return this.title;
}
private Integer is_sec_link;
public void setIs_sec_link(Integer is_sec_link){
this.is_sec_link=is_sec_link;
}
public Integer getIs_sec_link(){
return this.is_sec_link;
}
private String link_title;
public void setLink_title(String link_title){
this.link_title=link_title;
}
public String getLink_title(){
return this.link_title;
}
private String sec_url;
public void setSec_url(String sec_url){
this.sec_url=sec_url;
}
public String getSec_url(){
return this.sec_url;
}
private String manger_id;
public void setManger_id(String manger_id){
this.manger_id=manger_id;
}
public String getManger_id(){
return this.manger_id;
}
private Integer board_order;
public void setBoard_order(Integer board_order){
this.board_order=board_order;
}
public Integer getBoard_order(){
return this.board_order;
}
}
