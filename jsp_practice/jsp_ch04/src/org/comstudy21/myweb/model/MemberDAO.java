package org.comstudy21.myweb.model;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import org.comstudy21.myweb.dbcp.jdbcUtil;

public class MemberDAO {
	String SELECT = "SELECT * FROM MEMBER";
	String INSERT = "insert into member values (?,?,?,?,?)";
	
	Connection conn;
	Statement stmt;
	ResultSet rs;
	
	public List<MemberTO> selectAll() {
		List<MemberTO> list = new ArrayList<MemberTO>();
		
		conn = jdbcUtil.getConnection();
		try {
			stmt = conn.createStatement();
			rs = stmt.executeQuery(SELECT);
			while(rs.next()){
				 String name = rs.getString(1);
				 String height = rs.getString(2);
				 String weight = rs.getString(3);
				 int age =rs.getInt(4);
				 String gender = rs.getString(5);
	
				 list.add(new MemberTO(name,height,weight,age,gender));
			}
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			jdbcUtil.close(rs,stmt,conn);
		}
		
		return list;
	}
	
	public void insert(MemberTO member) {
		
	}
}
