package com.bridge;
/**
 * 
 * @ClassName: BridgeTest 
 * @Description: TODO ������
 * @author: NiShiChao
 * @date: 2018��10��15�� ����7:48:36
 */
public class BridgeTest {
	
	public static void main(String[] args) {
	    // �Žӳ�������Ž�ʵ����
		Bridge mysqlBridge = new MyBridge();
		// ���ݿ�ӿں�MySqlʵ����
	    Driver mysqlDriver = new MysqlDriver();
	    mysqlBridge.setDriver(mysqlDriver);
	    // ��������
	    mysqlBridge.connect();
	 
	    // ���ݿ�ӿں�SqlServerʵ����
	    Driver sqlServerDriver = new SqlServerDriver();
	    mysqlBridge.setDriver(sqlServerDriver);
	    // ��������
	    mysqlBridge.connect();
	}
}
