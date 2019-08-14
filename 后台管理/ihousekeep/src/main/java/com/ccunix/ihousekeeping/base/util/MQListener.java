package com.ccunix.ihousekeeping.base.util;

import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;

public class MQListener implements ServletContextListener{

	

	public void contextDestroyed(ServletContextEvent arg0) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void contextInitialized(ServletContextEvent arg0) {
		// TODO Auto-generated method stub
		// run in a second
				final long timeInterval = 30*60*1000;;
//				Runnable runnable = new Runnable() {
//					public void run() {
//						while (true) {
//							QMessage_Iface iface = new QMessage_Impl(new TestBusiness());
//							try {
//								iface.connection("dxxc");
//								Thread.sleep(timeInterval);
//							} catch (Exception e) {
//								// TODO Auto-generated catch block
//								e.printStackTrace();
//							}
//							
//						}
//					}
//				};
//				Thread thread = new Thread(runnable);
//				thread.start();

		
	}

}
