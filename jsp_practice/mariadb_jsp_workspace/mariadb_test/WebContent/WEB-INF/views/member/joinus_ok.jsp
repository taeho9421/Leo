<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<%@ page info="insert" errorPage="error.jsp" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<%@ page language="java" import="java.sql.*,java.text.*,java.util.*" %>
<% 
request.setCharacterEncoding("euc-kr"); 
String userid   = request.getParameter("userid");
String username   = request.getParameter("username");
String password   = request.getParameter("password");
String email      = request.getParameter("email");
String zipcode1   = request.getParameter("zipcode1");
String zipcode2   = request.getParameter("zipcode2");
String zipcode   = zipcode1+"-"+zipcode2;
String address1   = request.getParameter("address1");
String address2   = request.getParameter("address2");
String phone1 = request.getParameter("phone1");
String phone2 = request.getParameter("phone2");
String phone3 = request.getParameter("phone3");
String phone   = phone1+"-"+phone2+"-"+phone3;
%>

<html>
<head>
<title>���� �Ϸ�</title>
<meta http-equiv="Content-Type" content="text/html; charset=euc-kr">
<%-- �ܺ� ��Ÿ�Ͻ�Ʈ ���� --%>
<link rel="StyleSheet" href="style.css" type="text/css">
<script language="JavaScript">
<!--
function doSubmit() {
 form = document.join;
 if(!form.userid.value){
  alert('���̵� �Է����� �ʾҽ��ϴ�.');
  form.userid.focus();
  return;
  }
 form.submit();
}
//-->
</script>
</head>
<body text="#000000" bgcolor="#FFFFFF">
<br>
<br>
<form name="join" method="post" action="modify.jsp">
<input type=hidden name="userid" value="<%=userid%>">
<input type=hidden name="mode" value="modify">
<table width="500" border="1" bordercolorlight="#999999" bordercolordark="#FFFFFF" cellpadding="3" cellspacing="0" align="center" class="style2">
 <tr align="center"> 
  <td colspan="2" background="image/sky_bar.gif">������ ���ϵ帳�ϴ�. �Է��Ͻ� ������ Ȯ���ϼ���.</td>
 </tr>
 <tr> 
  <td width="15%" align="right">���̵�</td>
  <td width="75%"><%=userid%></td>
 </tr>
 <tr> 
  <td width="15%" align="right">�̸�</td>
  <td width="75%"><%=username%></td>
 </tr>
 <tr> 
  <td width="15%" align="right">��й�ȣ</td>
  <td width="75%">���Ȼ� �������� �ʽ��ϴ�.</td>
 </tr>
 <tr> 
  <td width="15%" align="right">EMAIL</td>
  <td width="75%"><%=email%></td>
 </tr>
 <tr> 
  <td width="15%" align="right">�����ȣ</td>
  <td width="75%"><%=zipcode1+"-"+zipcode2%></td>
 </tr>
 <tr> 
  <td width="15%" align="right">�ּ�1</td>
  <td width="75%"><%=address1%></td>
 </tr>
 <tr> 
  <td width="15%" align="right">�ּ�2</td>
  <td width="75%"><%=address2%></td>    
 </tr>
 <tr> 
  <td width="15%" align="right">�޴���</td>
  <td width="75%">
  <% 
   if(phone.equals("--")) {
    out.println("<font color='blue'>�������� �ʾҽ��ϴ�.</font>");
    }else{
     out.println(); 
    } 
   %>
   </td>
 </tr>
 <tr >
  <td colspan="2" align="center">
   <input type="button" value="Ȯ   ��" onClick="location='login.do'">
   <input type="button" value="��   ��" onClick="doSubmit()"></td>
 </tr>
</table>
</body>
</html>