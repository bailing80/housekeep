package com.ccunix.ihousekeeping.mqmessage.service;

import org.eclipse.paho.client.mqttv3.MqttCallback;

public interface QBusiness_Iface extends MqttCallback {
	
	public void doBusiness(String message);

}
