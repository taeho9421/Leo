<%@ page contentType="text/html; charset=euc-kr" %> 
<%@ page language="java" import="java.sql.*,java.io.*,java.text.*,java.net.*,java.util.*"%>
<%
 String userid   = request.getParameter("userid");
 String password = request.getParameter("password");
 Connection conn = null;
 Statement  stmt = null;
 ResultSet  rs   = null;
 String query    = new String();
 String name	    = new String();
 
try {
 Class.forName("org.mariadb.jdbc.Driver");
} catch (ClassNotFoundException e ) {
 out.println(e);
}    
try {
 conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/comstudy21?useUnicode=true&characterEncoding=euckr","comstudy21","comstudy21");
 stmt = conn.createStatement();
} catch(SQLException e) {
 out.println(e);
}
boolean bLogin = false;
try{
 query = "select * from member where userid = '"+userid+"'";
 query = query + " and password = '"+password+"'";
 rs = stmt.executeQuery(query);
 if(rs.next()){
  name   = rs.getString("username");
  bLogin = true;
 }else{
  bLogin = false;
 }
 rs.close();
} catch(SQLException e) {
 out.println(e);
} finally {
 conn.close();
}
if (bLogin){
 session.setAttribute("member_id",userid); 
 session.setAttribute("member_name",name); 
 response.sendRedirect("left_Frame.jsp");
}else{
 out.println("<script>alert('���̵�� ��й�ȣ�� Ȯ���ϼ���');history.back();</script>");
}
%>