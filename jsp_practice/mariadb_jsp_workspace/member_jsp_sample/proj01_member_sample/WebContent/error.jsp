<%@ page info="Error Page" %>
<%@ page contentType="text/html; charset=euc-kr" %> 
<%@ page isErrorPage="true" %>
<html>
<head>
<title>Error Page</title>
<meta http-equiv="Content-Type" content="text/html; charset=euc-kr">
<link rel="StyleSheet" href="style.css" type="text/css">
</head>
<body bgcolor="#FFFFFF" text="#000000">
<table width="100%" height="100%" border="0" cellspacing="0" cellpadding="0">
 <tr> 
  <td> 
   <table width="60%" border="1" cellspacing="0" cellpadding="0" align="center" bordercolorlight="#000000" bordercolordark="#FFFFFF">
    <tr> 
     <td bgcolor="#CCCCFF" align="center" height="25"><font color="#FF0000"> ����(ERROR)</font></td>
    </tr>
    <tr> 
     <td align="center"> 
      <table border="0" cellspacing="0" cellpadding="10">
       <tr> 
        <td>&nbsp;</td>
       </tr>
       <tr> 
        <td>�ý��ۿ� ������ �߻��Ͽ����ϴ�. ����� �ٽ� �̿��� �ּ���.</td>
       </tr>
       <tr>
        <td>�������� : <%=exception.getMessage()%></td>
       </tr>
       <tr> 
        <td>&nbsp;</td>
       </tr>
      </table>
     </td>
    </tr>
   </table>
  </td>
 </tr>
</table>
</body>
</html>