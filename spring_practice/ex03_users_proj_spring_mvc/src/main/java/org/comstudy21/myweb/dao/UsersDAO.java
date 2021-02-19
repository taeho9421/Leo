package org.comstudy21.myweb.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import javax.sql.DataSource;

import org.comstudy21.myapp.dto.UserVO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

// DAO로 사용할 클래에 붙이는 어노테이션
@Repository
public class UsersDAO {
	@Autowired
	DataSource ds;
	
	Connection conn;
	Statement stmt;
	PreparedStatement pstmt;
	ResultSet rs;
	
	String SELECT_ALL = "SELECT * FROM USERS";
	String INSERT = "INSERT INTO USERS VALUES(?,?,?,?)";
	
	public List<UserVO> selectAll() throws SQLException {
		ArrayList<UserVO> list = new ArrayList<UserVO>();
		conn = ds.getConnection();
		stmt = conn.createStatement();
		rs = stmt.executeQuery(SELECT_ALL);
		
		while(rs.next()) {
			String id = rs.getString(1);
			String password = rs.getString(2);
			String name = rs.getString(3);
			String role = rs.getString(4);
			list.add(new UserVO(id, password, name, role));
		}
		
		if(rs != null) rs.close();
		if(stmt != null) stmt.close();
		if(conn != null) conn.close();
		
		return list;
	}

	public void insert(UserVO userVO) throws SQLException {
		conn = ds.getConnection();
		pstmt = conn.prepareStatement(INSERT);
		pstmt.setString(1, userVO.getId());
		pstmt.setString(2, userVO.getPassword());
		pstmt.setString(3, userVO.getName());
		pstmt.setString(4, userVO.getRole());
		
		int cnt = pstmt.executeUpdate();
		if(cnt > 0) {
			System.out.println("입력 성공!");
			conn.commit();
		} else {
			System.out.println("입력 실패!");
			conn.rollback();
		}
		
		if(pstmt != null) pstmt.close();
		if(conn != null) conn.close();
	}
}


// 실행 순서
// static -> 빈생성
