package bit.myapp.dbcp;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class TestJdbcDelete {
	static String url = "jdbc:oracle:thin:@localhost:1521:XE";
	static String user = "comstudy21";
	static String password = "comstudy21";

	static Connection conn;
	static Statement stmt;

	static final String DELETE = "DELETE FROM SARAM WHERE ID=";

	static Scanner scan = new Scanner(System.in);
	static String id;

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		TestJdbcSelect.main(null); // �̸����� ( ����� ���� �ѹ� Ȯ���غ��� ���� ) 
		
		Class.forName("oracle.jdbc.OracleDriver");
		conn = DriverManager.getConnection(url, user, password);
		stmt = conn.createStatement();
		System.out.print("������ ���ڵ��� ���̵� �Է�>> ");
		id = scan.next();
		int cnt = stmt.executeUpdate(DELETE + "'" + id + "'");
		if (cnt != 0) {
			System.out.println("�����Ϸ�!");
			conn.commit();
		} else {
			System.out.println("���� ����!");
			conn.rollback();
		}

		// ��ü �ݾ��ֱ�
		if (stmt != null)
			stmt.close();
		if (conn != null)
			conn.close();

		// �Է� ��� Ȯ��
		TestJdbcSelect.main(null);
	}
}
