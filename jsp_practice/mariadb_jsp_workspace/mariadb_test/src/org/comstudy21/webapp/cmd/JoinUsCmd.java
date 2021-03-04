package org.comstudy21.webapp.cmd;

import java.io.UnsupportedEncodingException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.SimpleDateFormat;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.comstudy21.webapp.dbcp.JdbcUtil;

public class JoinUsCmd {

   public static void insert(HttpServletRequest request, HttpServletResponse resp) throws UnsupportedEncodingException {
      request.setCharacterEncoding("euc-kr");

      String userid = request.getParameter("userid");
      String username = request.getParameter("username");
      String password = request.getParameter("password");
      String email = request.getParameter("email");
      String zipcode1 = request.getParameter("zipcode1");
      String zipcode2 = request.getParameter("zipcode2");
      String zipcode = zipcode1 + "-" + zipcode2;
      String address1 = request.getParameter("address1");
      String address2 = request.getParameter("address2");
      String phone1 = request.getParameter("phone1");
      String phone2 = request.getParameter("phone2");
      String phone3 = request.getParameter("phone3");
      String phone = phone1 + "-" + phone2 + "-" + phone3;
      String query = "insert into member values ( ?, ?, ?, ?, ?, ?, ?, ?, ?)";

      Connection conn = JdbcUtil.getConnection();
      ResultSet rs = null;
      PreparedStatement pstmt = null;

      java.util.Date yymmdd = new java.util.Date();
      SimpleDateFormat myformat = new SimpleDateFormat("yy-MM-d h:mm a");
      String regdate = myformat.format(yymmdd);

      try {
         pstmt = conn.prepareStatement(query);
         pstmt.setString(1, userid);
         pstmt.setString(2, username);
         pstmt.setString(3, password);
         pstmt.setString(4, email);
         pstmt.setString(5, zipcode1 + "-" + zipcode2);
         pstmt.setString(6, address1);
         pstmt.setString(7, address2);
         pstmt.setString(8, phone1 + "-" + phone2 + "-" + phone3);
         pstmt.setString(9, regdate);
         int cnt = pstmt.executeUpdate();
         if(cnt > 0) {
            System.out.println(">>>> 입력 성공^^");
            conn.commit();
         } else {
            System.out.println(">>>> 입력 실패ㅠㅠ");
            conn.rollback();
         }
      } catch (SQLException e) {
         e.printStackTrace();
      } finally {
         JdbcUtil.close(conn, pstmt, rs);
      }
   }

   public static void service(HttpServletRequest req, HttpServletResponse resp) throws UnsupportedEncodingException {
      if("POST".equals(req.getMethod())) {
         insert(req, resp);
         return;
      } // end of if
      // GET일때 처리
   }

}