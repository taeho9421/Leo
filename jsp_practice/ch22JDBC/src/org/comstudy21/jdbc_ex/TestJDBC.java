package org.comstudy21.jdbc_ex;

import java.sql.DriverManager;
import java.sql.SQLException;

public class TestJDBC {

	public static void main(String[] args) {
		try {
			Class.forName("oracle.jdbc.OracleDriver");
			System.out.println("����̹� �˻�����!");
			// �������� : jdbc:oracle:thin: 
			// DB�ּ� : localhost: 
			// ��Ʈ��ȣ : 1521
			// UID : XE 
			String url = "jdbc:oracle:thin:@localhost:1521:XE";
			String user = "comstudy21";
			String password = "comstudy21";
			DriverManager.getConnection(url, user, password);
			System.out.println("DB ���� ����!");
		} catch (ClassNotFoundException e) {
			System.out.println("����̹� �˻�����!");
			e.printStackTrace();
		} catch (SQLException e) {
			System.out.println("DB ���� ����!");
			e.printStackTrace();
		}
	}
}