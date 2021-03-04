package org.comstudy21.jdbc_ex;

import java.sql.DriverManager;
import java.sql.SQLException;

public class TestJDBC {

	public static void main(String[] args) {
		try {
			Class.forName("oracle.jdbc.OracleDriver");
			System.out.println("드라이버 검색성공!");
			// 프로토콜 : jdbc:oracle:thin: 
			// DB주소 : localhost: 
			// 포트번호 : 1521
			// UID : XE 
			String url = "jdbc:oracle:thin:@localhost:1521:XE";
			String user = "comstudy21";
			String password = "comstudy21";
			DriverManager.getConnection(url, user, password);
			System.out.println("DB 접속 성공!");
		} catch (ClassNotFoundException e) {
			System.out.println("드라이버 검색실패!");
			e.printStackTrace();
		} catch (SQLException e) {
			System.out.println("DB 접속 실패!");
			e.printStackTrace();
		}
	}
}