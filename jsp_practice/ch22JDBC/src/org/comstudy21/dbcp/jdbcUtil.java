package org.comstudy21.dbcp;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class jdbcUtil {

	static String url = "jdbc:oracle:thin:@localhost:1521:XE";
	static String user = "comstudy21";
	static String password = "comstudy21";

	// DB�� �����ϴ� ���
	public static Connection getConnection() {
		try {
			Class.forName("oracle.jdbc.OracleDriver");
			Connection conn = DriverManager.getConnection(url, user, password);
			// System.out.println(conn);
			return conn;
		} catch (ClassNotFoundException e) {
			System.out.println("����̹� �˻�����!");
			e.printStackTrace();
		} catch (SQLException e) {
			System.out.println("DB ���� ����!");
			e.printStackTrace();
		}
		return null;
	}

	// DB ������ �ݴ� ���
	public static void close(Connection conn) {
		if (conn != null) {
			try {
				conn.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
	}

	public static void close(ResultSet rs) {
		if (rs != null) {
			try {
				rs.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
	}

	public static void close(Statement stmt) {
		if (stmt != null) {
			try {
				stmt.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
	}

	public static void close(ResultSet rs, Statement stmt, Connection conn) {
		close(rs);
		close(stmt);
		close(conn);
	}
}
