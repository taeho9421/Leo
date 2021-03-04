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
		System.out.println("드라이버 검색성공!");
		conn = DriverManager.getConnection(url, user, password);
		pstmt = conn.prepareStatement(INSERT);
		
		// 데이터를 입력받음
		getSaramData();
		pstmt.setString(1,id);
		pstmt.setString(2,name);
		pstmt.setInt(3,age);
		
		// 적용하기
		int cnt = pstmt.executeUpdate();
		if(cnt != 0) {
			System.out.println("입력 성공!");
			conn.commit();
		} else { 
			System.out.println("입력 실패!");
			conn.rollback();
		}
		
		// 객체 닫아주기 
		if(pstmt != null) pstmt.close();
		if(conn != null) conn.close();
		
		// 입력 결과 확인 
		TestJdbcSelect.main(null);
	}

	private static void getSaramData() {
		System.out.print("아이디 입력>> ");
		id = scan.next();
		System.out.print("이름 입력>> ");
		name = scan.next();
		System.out.print("나이 입력>> ");
		age = scan.nextInt();
		
	}
}
