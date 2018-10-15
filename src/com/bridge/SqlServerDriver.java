package com.bridge;
/**
 * 
 * @ClassName: SqlServerDriver 
 * @Description: TODO SqlServer 数据类
 * @author: NiShiChao
 * @date: 2018年10月15日 下午7:45:38
 */
public class SqlServerDriver implements Driver {

	@Override
	public void connect() {
		 System.out.println("连接SQLServer数据库");
		
	}

}
