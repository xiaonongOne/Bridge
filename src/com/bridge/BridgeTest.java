package com.bridge;
/**
 * 
 * @ClassName: BridgeTest 
 * @Description: TODO 测试类
 * @author: NiShiChao
 * @date: 2018年10月15日 下午7:48:36
 */
public class BridgeTest {
	
	public static void main(String[] args) {
	    // 桥接抽象类和桥接实现类
		Bridge mysqlBridge = new MyBridge();
		// 数据库接口和MySql实现类
	    Driver mysqlDriver = new MysqlDriver();
	    mysqlBridge.setDriver(mysqlDriver);
	    // 调用桥梁
	    mysqlBridge.connect();
	 
	    // 数据库接口和SqlServer实现类
	    Driver sqlServerDriver = new SqlServerDriver();
	    mysqlBridge.setDriver(sqlServerDriver);
	    // 调用桥梁
	    mysqlBridge.connect();
	}
}
