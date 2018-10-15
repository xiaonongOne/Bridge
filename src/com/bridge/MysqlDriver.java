package com.bridge;
/**
 * 
 * @ClassName: MysqlDriver 
 * @Description: TODO 数据库实现类
 * @author: NiShiChao
 * @date: 2018年10月15日 下午7:44:17
 */
public class MysqlDriver implements Driver {

	@Override
	public void connect() {
		System.out.println("连接Mysql数据库！");
	}

}
