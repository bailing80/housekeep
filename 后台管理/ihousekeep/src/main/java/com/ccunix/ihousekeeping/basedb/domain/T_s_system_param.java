package com.ccunix.ihousekeeping.basedb.domain;
import com.ccunix.ihousekeeping.base.domain.Base_Model_Business;
import java.util.Date;
public class T_s_system_param extends Base_Model_Business {
	
private int num;

	
	
public int getNum() {
	return num;
}
public void setNum(int num) {
	this.num = num;
}
private String s_key;
public void setS_key(String s_key){
this.s_key=s_key;
}
public String getS_key(){
return this.s_key;
}
private String s_value;
public void setS_value(String s_value){
this.s_value=s_value;
}
public String getS_value(){
return this.s_value;
}
private String s_discription;
public void setS_discription(String s_discription){
this.s_discription=s_discription;
}
public String getS_discription(){
return this.s_discription;
}
}
