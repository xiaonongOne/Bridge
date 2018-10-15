package com.bridge;
/**
 * 
 * @ClassName: Bridge 
 * @Description: TODO 桥梁抽象类
 * @author: NiShiChao
 * @date: 2018年10月15日 下午7:46:59
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
