<%@ page contentType="text/html; charset=EUC-KR" %> 
<%@ page language="java" import="java.sql.*" %> 
<%
 String admPwd = "manager";
 String password = request.getParameter("password");
 if (admPwd.equals(password))
  response.sendRedirect(response.encodeRedirectURL("select_all.jsp"));
 else {
%>
<script>alert("������ ���� ����� ���� �մϴ�. Ȯ�� ��ư�� ��������!"); 
</script>
<html>
<head>
<title>�츮 ȸ�� ��������</title>
<meta http-equiv="Content-Type" content="text/html; charset=euc-kr">
<link rel="StyleSheet" href="style.css" type="text/css">
</head>
<body>
 <table width="500" border="1" bordercolorlight="#999999" bordercolordark="#FFFFFF" cellpadding="3" cellspacing="0" align="center" class="style2">
  <TH background="image/sky_bar.gif">������ ����</TH>
  <tr>
   <td align="center">
    <FORM  name=form1 method=post action="admin.jsp"> 
     <BR> ������ ��й�ȣ   : 
     <INPUT type=password name=password>  
     <p>
     <INPUT type=submit  name=change value="Ȯ��" > &nbsp;
     <INPUT type="button" value="��   ��"  onClick="javascript:history.go(-1);">
    </FORM>
   </td>
  </tr>
  <tr>
   <td align="center">Copyright by JSP STUDY</td>
  </tr>
 </table>
</body>
</html> 
<% }%>