package com.ccunix.ihousekeeping.basedb.domain;
import com.ccunix.ihousekeeping.base.domain.Base_Model_Business;
import java.util.Date;
public class T_lz_weixin_info extends Base_Model_Business {
private String mapping_id;
public void setMapping_id(String mapping_id){
this.mapping_id=mapping_id;
}
public String getMapping_id(){
return this.mapping_id;
}
private String acct;
public void setAcct(String acct){
this.acct=acct;
}
public String getAcct(){
return this.acct;
}
private String key;
public void setKey(String key){
this.key=key;
}
public String getKey(){
return this.key;
}
}
