package org.comstudy21.model;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

import org.comstudy21.dbcp.jdbcUtil;

public class SaramDao {
	static final String SELECT = "SELECT * FROM SARAM";
	// 변수를 사용하는 쿼리문은 PreparedStatement 를 사용한다.
	static final String INSERT = "INSERT INTO SARAM VALUES(?,?,?)";

	static Connection conn;
	static Statement stmt;
	static ResultSet rs;
	private static PreparedStatement pstmt;

	public static ArrayList<SaramDto> selectAll() {
		ArrayList<SaramDto> list = new ArrayList<>();
		conn = jdbcUtil.getConnection();
		try {
			stmt = conn.createStatement();
			rs = stmt.executeQuery(SELECT);
			while (rs.next()) {
				String id = rs.getString(1);
				String name = rs.getString(2);
				int age = rs.getInt(3);
				// System.out.printf("%-10s\t%-20s\t%d\n", id, name, age);
				list.add(new SaramDto(id, name, age));
			}
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			jdbcUtil.close(rs, stmt, conn);
		}
		return list;
	}

	public static void insert(SaramDto dto) {
		conn = jdbcUtil.getConnection();
		try {
			pstmt = conn.prepareStatement(INSERT);
			pstmt.setString(1, dto.getId());
			pstmt.setString(2, dto.getName());
			pstmt.setInt(3, dto.getAge());
			int cnt = pstmt.executeUpdate();
			if (cnt == 0) {
				System.out.println("입력 실패!");
				conn.rollback();
			} else {
				System.out.println("입력 성공!");
				conn.commit();
			}
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			jdbcUtil.close(null, pstmt, conn);
		}
	}
}
