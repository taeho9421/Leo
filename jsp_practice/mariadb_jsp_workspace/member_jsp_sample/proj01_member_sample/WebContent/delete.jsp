<%@ page contentType="text/html; charset=EUC-KR" %> 
<%@ page language="java" import="java.sql.*" %> 
<%
 Object mem_id = session.getAttribute("member_id"); 
 session.putValue(session.getId(), mem_id);
 String userid = (String)session.getValue(session.getId());
 if(userid == null)
  session.putValue(session.getId(), mem_id);
 
  Connection con=null;
  Statement st=null;    
  String sql=null;

  try {
   Class.forName("org.mariadb.jdbc.Driver");
  } catch (ClassNotFoundException e){
   out.println(e.getMessage());
  }

  try {
   con = DriverManager.getConnection("jdbc:mysql://localhost:3306/comstudy21?useUnicode=true&characterEncoding=euckr","comstudy21","comstudy21");
   st = con.createStatement();
   sql = "delete from member  where userid= '" + userid + "'";
   st.executeUpdate(sql);
   con.close();
   st.close();  
  } catch (SQLException e) {
   out.println(e);
  }
 %>
<jsp:forward page="right_Frame.htm" />