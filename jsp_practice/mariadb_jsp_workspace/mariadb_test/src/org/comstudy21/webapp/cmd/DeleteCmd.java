package org.comstudy21.webapp.cmd;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.comstudy21.webapp.dbcp.JdbcUtil;

public class DeleteCmd {

	public static void service(HttpServletRequest req, HttpServletResponse resp) {
		String userid = req.getParameter("userid");
		
		System.out.println("userid ====> "+userid);
		
		Connection con = JdbcUtil.getConnection();
		Statement st = null;
		String sql = null;

		try {
			con = DriverManager.getConnection(
					"jdbc:mysql://localhost:3306/comstudy21?useUnicode=true&characterEncoding=euckr", "comstudy21",
					"comstudy21");
			st = con.createStatement();
			int cnt = st.executeUpdate(sql);
			if(cnt >= 0) {
				System.out.println("삭제성공");
			} else {
				System.out.println("삭제실패");
			}
		} catch (SQLException e) {
			System.out.println(e);
		} finally {
			JdbcUtil.close(con,st,null);
		}
	}
}
