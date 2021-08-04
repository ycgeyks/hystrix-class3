package org.crazyit.cloud;

import com.netflix.config.ConfigurationManager;

public class ThreadMain {

	public static void main(String[] args) throws Exception {
		ConfigurationManager.getConfigInstance().setProperty(
				"hystrix.threadpool.default.coreSize", 4);
		for(int i = 0; i < 6; i++) {
			MyCommand c = new MyCommand(i);
			c.queue();
		}
		Thread.sleep(5000);
	}

}
