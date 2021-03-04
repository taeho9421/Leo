<%@ page info="member modify" errorPage="error.jsp" %>
<%@ page contentType="text/html; charset=euc-kr" %>
<%@ page language="java" import="java.sql.*,java.io.*,java.net.*,java.util.*,java.text.*" %>
<% request.setCharacterEncoding("euc-kr"); %>
<%
 Connection conn = null;
 Statement  stmt = null;
 ResultSet  rs   = null;
 PreparedStatement pstmt = null;
 String mode		= request.getParameter("mode");
 String userid	    = (String)session.getAttribute("member_id");
 String username	= request.getParameter("username");
 String password	= request.getParameter("password");
 String email		= request.getParameter("email");
 String zipcode1	= request.getParameter("zipcode1");
 String zipcode2	= request.getParameter("zipcode2");
 String address1	= request.getParameter("address1");
 String address2	= request.getParameter("address2");
 String phone1 = request.getParameter("phone1");
 String phone2 = request.getParameter("phone2");
 String phone3 = request.getParameter("phone3");
 String query        = new String();
 StringTokenizer st_zipcode		= null;
 StringTokenizer st_phone	= null;

 java.util.Date yymmdd = new java.util.Date() ;
 SimpleDateFormat myformat = new SimpleDateFormat("yy-MM-d h:mm a");
 String regdate=myformat.format(yymmdd);

 try {
  Class.forName("org.mariadb.jdbc.Driver");
 } catch (ClassNotFoundException e ) {
  out.println(e);
 }

 try {
  conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/comstudy21?useUnicode=true&characterEncoding=euckr","comstudy21","comstudy21");
  stmt = conn.createStatement();
  if(mode.equals("null") || mode.equals("modify")){
   query = "select * from member where userid='"+userid+"'";
   rs = stmt.executeQuery(query);
            
   if(rs.next()){
    username	= rs.getString("username");
    password	= rs.getString("password");
    email		= rs.getString("email");
    st_zipcode = new StringTokenizer(rs.getString("zipcode"), "-");
    address1	= rs.getString("address1");
    address2	= rs.getString("address2");
    st_phone = new StringTokenizer(rs.getString("phone"), "-");
 
    if(st_zipcode.hasMoreTokens()){
     zipcode1 = st_zipcode.nextToken();
    }                
    if(st_zipcode.hasMoreTokens()){
     zipcode2 = st_zipcode.nextToken();
    } 
                  
    if(st_phone.hasMoreTokens()){
     phone1 = st_phone.nextToken();
    }                
    if(st_phone.hasMoreTokens()){
     phone2 = st_phone.nextToken();
    }                
    if(st_phone.hasMoreTokens()){
     phone3 = st_phone.nextToken();
    }
   }
   rs.close();
  
  }else if(mode.equals("update")){
   query = "update member set username=?, password=?, email=?, zipcode=?, address1=?, address2=?, phone=? where userid='"+userid+"'";
   pstmt = conn.prepareStatement(query);
   pstmt.setString(1, username);
   pstmt.setString(2, password);
   pstmt.setString(3, email);
   pstmt.setString(4, zipcode1+"-"+zipcode2);
   pstmt.setString(5, address1);
   pstmt.setString(6, address2);
   pstmt.setString(7, phone1+"-"+phone2+"-"+phone3);
   pstmt.executeUpdate();
   response.sendRedirect("select.jsp");
  }
 } catch(SQLException e) {
 } finally {
  conn.close();
 }
%>
<html>
<head>
<title>** ȸ������ ���� **</title>
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<meta http-equiv="Content-Type" content="text/html; charset=euc-kr">
<link rel="stylesheet" href="style.css" type="text/css">
<script language="JavaScript">
<!--
 function MM_openBrWindow(theURL,winName,features) {
  window.open(theURL,winName,features);
 }
 function doSubmit() {
  form = document.join;
  if(!form.username.value){
   alert('�̸��� �Է����� �ʾҽ��ϴ�.');
   form.username.focus();
   return;
  }
  if(!form.email.value){
   alert('Email�� �Է����� �ʾҽ��ϴ�.');
   form.email.focus();
   return;
  }
  if(form.email.value.indexOf("@") < 0){
   alert('Email�ּ� ������ Ʋ���ϴ�.');
   form.email.focus();
   return;
  }
  if(form.email.value.indexOf(".") < 0){
   alert('Email �ּ� ������ Ʋ���ϴ�.');
   form.email.focus();
   return;
  }
  if(!form.zipcode1.value || !form.zipcode2.value){
   alert('�����ȣ�� �Է����� �ʾҽ��ϴ�.');
   MM_openBrWindow('zipcode_search.jsp','zipcode_search','scrollbars=yes,width=500,height=250');
   return;
  }
  if(!form.address1.value){
   alert('�ּ�1�� �Է����� �ʾҽ��ϴ�.');
   MM_openBrWindow('zipcode_search.jsp','zipcode_search','scrollbars=yes,width=500,height=250');
   return;
  }
  if(!form.address2.value){
   alert('�ּ�2�� �Է����� �ʾҽ��ϴ�.');
   form.address2.focus();
   return;
  }
  form.submit();
}
//-->
</script>
</head>
<body bgcolor="#FFFFFF" text="#000000">
<div align="center">
 <form name="join" method="post" action="modify_session.jsp">
  <table width="622" height="536" border="1" cellspacing="0" cellpadding="0" bordercolor="#A3C2F6">
   <tr> 
    <td width="15%" align="right"><font color="#FF0000" class="style2"> <font color="#FF0000" size=1>��</font></font><font class="style2">���̵�&nbsp;&nbsp;</font></td>
    <td width="75%">&nbsp;
     <input type="text" name="userid" size="10" maxlength="10" class="box" value="<%=userid%>" readonly></font></font></td>
   </tr>
   <tr> 
    <td width="15%" align="right" ><font color="#FF0000" size=1>��</font><font class="style2">��й�&nbsp;&nbsp;</font></td>
    <td width="75%">&nbsp; 
     <input type="text" name="password" size="12" maxlength="12" class="box" value="<%=password%>">
     <font class="style2">�ٽ��ѹ�&nbsp;&nbsp; </font>
     <input type="password" name="password2" size="12" maxlength="12" class="box" value="<%=password%>">
     <font class="style2">(����+���� 4~12�ڸ�)</font></td>
   </tr>          
   <tr > 
    <td width="15%" align="right"><font color="#FF0000" size=1>��</font><font class="style2" >�̸�&nbsp;&nbsp;</font></td>
    <td width="75%">&nbsp; 
     <input type="text" name="username" size="10" maxlength="10" class="box" value="<%=username%>"></td>
   </tr>
   <tr > 
    <td width="15%" align="right"><font color="#FF0000" size=1>��</font><font class="style2">EMAIL&nbsp;&nbsp;</font></td>
    <td width="75%">&nbsp;
     <input type="text" name="email" size="20" maxlength="50" class="box" value="<%=email%>"></td>
   </tr>
   <tr > 
    <td width="15%" align="right"><font color="#FF0000" size=1>��</font><font class="style2">�����ȣ&nbsp;&nbsp;</font></td>
    <td width="75%">&nbsp; 
     <input type="text" name="zipcode1" size="3" maxlength="3" class="box" readonly value="<%=zipcode1%>"> - 
     <input type="text" name="zipcode2" size="3" maxlength="3" class="box"      readonly value="<%=zipcode2%>">
     <input name="button" type="button" onClick="MM_openBrWindow('zipcode_search.jsp','zipcodesearch','scrollbars=yes,width=500,height=250')" value="�����ȣ �˻�">
     <font color="#0099FF">�����ȣ �˻� ��ư�� ��������.</font></td>
   </tr>
   <tr > 
    <td width="15%" align="right"><font color="#FF0000" size=1>��</font><font class="style2">�ּ�&nbsp;&nbsp;</font></td>
    <td width="75%">&nbsp; 
     <input type="text" name="address1" size="50" maxlength="100" class="box" readonly value="<%=address1%>"></td>
   </tr>
   <tr > 
    <td width="15%" align="right"><font color="#FF0000" size=1>��</font><font class="style2" >������ �ּ�&nbsp;&nbsp;</font></td>
    <td width="75%">&nbsp; 
     <input type="text" name="address2" size="50" maxlength="100" class="box" value="<%=address2%>"></td>
   </tr>
   <tr > 
    <td width="15%" align="right"><font class="style2">�޴���&nbsp;&nbsp;</font></td>
    <td width="75%">&nbsp; 
     <input type="text" name="phone1" size="4" maxlength="4" class="box" value="<%=phone1%>"> -
     <input type="text" name="phone2" size="4" maxlength="4" class="box" value="<%=phone2%>"> - 
     <input type="text" name="phone3" size="4" maxlength="4" class="box" value="<%=phone3%>"></td>
   </tr>
  </table>
 <br/>
  <table width="614" border="0" cellspacing="0" cellpadding="0" align="center" >
   <tr>
    <td width=100% align="center"> 
     <input type="hidden" name="mode" value="update">
     <input type="button" value="��   ��"  onClick="doSubmit()">&nbsp;
     <input type="button" value="��   ��"  onClick="javascript:history.go(-1);">
    </td>
   </tr>
  </table>
 </form>
</TD></TR></TABLE>
</div>
<div align="center">
 <table width="638" border="0" cellpadding="0" cellspacing="0">
  <tr> 
   <td bgcolor="#FFFFFF" width="638" nowrap><p align="center"><br>
   Copyright by JSP STUDY</p></td>
  </tr>
 </table>
</div>
</body>
</html>