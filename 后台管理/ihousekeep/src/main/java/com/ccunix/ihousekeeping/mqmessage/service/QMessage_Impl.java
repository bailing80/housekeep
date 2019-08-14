package com.ccunix.ihousekeeping.mqmessage.service;

import javax.annotation.Resource;

import org.eclipse.paho.client.mqttv3.MqttClient;
import org.eclipse.paho.client.mqttv3.MqttConnectOptions;
import org.eclipse.paho.client.mqttv3.MqttDeliveryToken;
import org.eclipse.paho.client.mqttv3.MqttMessage;
import org.eclipse.paho.client.mqttv3.MqttTopic;
import org.eclipse.paho.client.mqttv3.persist.MemoryPersistence;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.ccunix.ihousekeeping.base.service.BaseService;
import com.ccunix.ihousekeeping.parammanager.domain.SystemParam.SYSPARM;
import com.ccunix.ihousekeeping.parammanager.service.ParamManager_Service_Iface;


@Service
@Transactional
public class QMessage_Impl extends BaseService implements QMessage_Iface {

	private MqttClient client;
	private MqttConnectOptions options;
	private MqttMessage message;
	private MqttTopic topic;

	private QBusiness_Iface qbusiness_iface;
	
	@Resource
	ParamManager_Service_Iface paramManager_Service_Iface;
	
	public QMessage_Impl(QBusiness_Iface qbusiness_iface) {
		this.qbusiness_iface = qbusiness_iface;
	}
	public QMessage_Impl() {
		// TODO Auto-generated constructor stub
	}

	/**
	 * 开启接收信息服务
	 * 
	 * @throws Exception
	 */
	@Override
	public void startSave(String userId) throws Exception {
	
	

		// 订阅消息
		int[] Qos = { 1 };
		String[] topic1 = { userId };
		client.subscribe(topic1, Qos);

	}

	/**
	 * 建立与apollo服务器的连接
	 * 
	 * @throws Exception
	 */
	@Override
	public void connection(String userId) throws Exception {
		// TODO Auto-generated method stub
		// host为主机名，clientid即连接MQTT的客户端ID，一般以唯一标识符表示，MemoryPersistence设置clientid的保存形式，默认为以内存保存
		client = new MqttClient(paramManager_Service_Iface.getSystemParam(SYSPARM.mqhost), paramManager_Service_Iface.getSystemParam(SYSPARM.mqClientid), new MemoryPersistence());
		// MQTT的连接设置
		options = new MqttConnectOptions();
		// 设置是否清空session,这里如果设置为false表示服务器会保留客户端的连接记录，这里设置为true表示每次连接到服务器都以新的身份连接
		options.setCleanSession(true);
		// 设置连接的用户名
		options.setUserName(paramManager_Service_Iface.getSystemParam(SYSPARM.mqUserName));
		// 设置连接的密码
		options.setPassword(paramManager_Service_Iface.getSystemParam(SYSPARM.mqPassword).toCharArray());
		// 设置超时时间 单位为秒
		options.setConnectionTimeout(10);
		// 设置会话心跳时间 单位为秒 服务器会每隔1.5*20秒的时间向客户端发送个消息判断客户端是否在线，但这个方法并没有重连的机制
		options.setKeepAliveInterval(20);
		// 设置回调
		client.setCallback(qbusiness_iface);
		topic = client.getTopic(userId);
		// setWill方法，如果项目中需要知道客户端是否掉线可以调用该方法。设置最终端口的通知消息
		options.setWill(topic, "close".getBytes(), 2, true);

		client.connect(options);

	}
	/**
	 * 开启发送信息服务
	 * 
	 * @throws Exception
	 */
	@Override
	public void sendMessage(String mess) throws Exception {
       
        message = new MqttMessage();
        message.setQos(2);
        message.setRetained(true);
        
        message.setPayload(mess.getBytes("UTF-8"));
		MqttDeliveryToken token = topic.publish(message);
        token.waitForCompletion();
		
	}

}
