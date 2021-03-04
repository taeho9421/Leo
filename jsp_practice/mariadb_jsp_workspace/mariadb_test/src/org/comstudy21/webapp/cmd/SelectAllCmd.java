package org.comstudy21.webapp.cmd;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.comstudy21.webapp.dbcp.JdbcUtil;
import org.comstudy21.webapp.dto.MemberDTO;

public class SelectAllCmd {

   public static void service(HttpServletRequest req, HttpServletResponse resp) {
      Connection con = JdbcUtil.getConnection();
      Statement st = null;
      ResultSet rs = null;
      // req에 저장 될 List
      ArrayList<MemberDTO> list = new ArrayList<>();

      try {
         st = con.createStatement();
         rs = st.executeQuery("select * from member order by userid");
         while (rs.next()) {
            // req에 set할 목록을 만든다.
            String userid = rs.getString("userid");
            String username = rs.getString("username");
            String address1 = rs.getString("address1");
            String address2 = rs.getString("address2");
            // List에 저장 될 DTO가 준비 되어야 한다.
            MemberDTO member = new MemberDTO(userid, username, "", "", "", address1, address2, "", "");
            // 목록에 사용자 정보dto 추가.
            list.add(member);
         }
         // 사용자 목록 List를 만들어서 req에 set해야 한다.
         req.setAttribute("user_list", list);
         if(list.size() == 0) {
            System.out.println("사용자 목록이 없습니다!");
         } else {
            System.out.println("사용자 목록 생성 완료!");
         }
      } catch (SQLException e) {
         System.out.println(e);
      } finally {
         JdbcUtil.close(con, st, rs);
      }
   }
}