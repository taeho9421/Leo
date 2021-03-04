package bit.myapp.dbcp;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

public class TestJdbcInsert {
	static String url = "jdbc:oracle:thin:@localhost:1521:XE";
	static String user = "comstudy21";
	static String password = "comstudy21";

	static Connection conn;
	static PreparedStatement pstmt;

	static final String INSERT = "INSERT INTO SARAM VALUES(?,?,?)";
	
	static Scanner scan = new Scanner(System.in);
	static String id,name;
	static int age;
	
	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		Class.forName("oracle.jdbc.OracleDriver");
		System.out.println("����̹� �˻�����!");
		conn = DriverManager.getConnection(url, user, password);
		pstmt = conn.prepareStatement(INSERT);
		
		// �����͸� �Է¹���
		getSaramData();
		pstmt.setString(1,id);
		pstmt.setString(2,name);
		pstmt.setInt(3,age);
		
		// �����ϱ�
		int cnt = pstmt.executeUpdate();
		if(cnt != 0) {
			System.out.println("�Է� ����!");
			conn.commit();
		} else { 
			System.out.println("�Է� ����!");
			conn.rollback();
		}
		
		// ��ü �ݾ��ֱ� 
		if(pstmt != null) pstmt.close();
		if(conn != null) conn.close();
		
		// �Է� ��� Ȯ�� 
		TestJdbcSelect.main(null);
	}

	private static void getSaramData() {
		System.out.print("���̵� �Է�>> ");
		id = scan.next();
		System.out.print("�̸� �Է�>> ");
		name = scan.next();
		System.out.print("���� �Է�>> ");
		age = scan.nextInt();
		
	}
}
