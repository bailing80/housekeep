package com.ccunix.ihousekeeping.mqmessage.service;

public interface QMessage_Iface {
	
	/**
	 * 建立与apollo服务器的连接
	 * @throws Exception
	 */
	public void connection(String userId) throws Exception;
	
	/**
	 * 开启接收信息服务
	 * @throws Exception
	 */
	public void startSave(String userId) throws Exception;
	
	
	/**
	 * 开启发送消息服务
	 * @param userId 用户ID
	 * @param mess   发送消息内容
	 * @throws Exception
	 */
	public void sendMessage(String mess) throws Exception;

}
