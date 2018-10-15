package com.bridge;
/**
 * 
 * @ClassName: Bridge 
 * @Description: TODO ����������
 * @author: NiShiChao
 * @date: 2018��10��15�� ����7:46:59
 */
public abstract class Bridge {

	private Driver driver;

	public void connect(){
		 driver.connect();
	}
	
	public Driver getDriver() {
		return driver;
	}

	public void setDriver(Driver driver) {
		this.driver = driver;
	}
	
}
