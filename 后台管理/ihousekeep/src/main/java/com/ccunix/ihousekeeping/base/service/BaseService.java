package com.ccunix.ihousekeeping.base.service;

import com.ccunix.ihousekeeping.base.domain.AppDataModel;
import com.ccunix.ihousekeeping.base.domain.Base_Model_Business;
import com.ccunix.ihousekeeping.base.domain.ClientMessage;
import com.ccunix.ihousekeeping.base.util.UUID_Tools;

public class BaseService {
	public AppDataModel getAppDataModel() {
		AppDataModel appDataModel = new AppDataModel();
		return appDataModel;
	}
	
	public static UUID_Tools uuid_Tools;
	
	
	
	public String getClientMessage(String key){
		return ClientMessage.map.get(key).toString();
	}
	
//	public String getHttpUrl(){
//		return GlobalSetting.httpFileBasePath;
//	}
	
	
}
