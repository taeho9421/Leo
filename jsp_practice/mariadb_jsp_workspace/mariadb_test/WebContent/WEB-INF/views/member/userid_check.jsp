<%@ page info="userid check" errorPage="error.jsp" %>
<%@ page contentType="text/html; charset=euc-kr" %> 
<%@ page language="java" import="java.sql.*" %>
<%
 String userid =request.getParameter("userid");
 String query  = new String();

 int check_count = 0;
 boolean bJoin = false;
    
 Connection conn = null;
 Statement  stmt = null;
 ResultSet  rs   = null;

 try {
  Class.forName("org.mariadb.jdbc.Driver");
 } catch (ClassNotFoundException e ) {
  out.println(e);
 }
    
 try {
  conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/comstudy21?useUnicode=true&characterEncoding=euckr","comstudy21","comstudy21");
  stmt = conn.createStatement();

  query = "Select count(*) as count from member where userid='" + userid + "'";
  rs = stmt.executeQuery(query);
  rs.next();
  check_count = rs.getInt("count");
  rs.close();
 } catch(SQLException e){
 } finally {
  conn.close();
 }
%>

<html>
<head>
<title>���̵� �ߺ��˻�</title>
<meta http-equiv="Content-Type" content="text/html; charset=euc-kr">
<link rel="StyleSheet" href="style.css" type="text/css">
<script language="JavaScript">
<!--
function checkEnd(){
 var form = document.id_check;
 opener.join.userid.value       = form.userid.value;
 opener.join.userid_check.value = form.check_count.value;
 self.close();
}

function doCheck(){
 var form = document.id_check;
 if(!checkValue(form.userid, '���̵�', 5, 16)){
  return;
 }
 form.submit();
}

function checkValue(target, cmt, lmin, lmax){
 var Alpha = 'abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ';
 var Digit = '1234567890';
 var astr = Alpha+Digit;
 var i;
 var tValue = target.value;
 if(tValue.length < lmin || tValue.length > lmax){
  if(lmin==lmax) alert(cmt+'��'+lmin+'Byte�̾�� �մϴ�.');
  else alert(cmt+'��'+lmin+'~'+lmax+'Byte �̳��� �Է��ϼž� �մϴ�.');
  target.focus();
  return false;
 }
 if(astr.length > 1){
  for (i=0; i<tValue.length; i++){
   if(astr.indexOf(tValue.substring(i,i+1))<0){
    alert(cmt+'�� ����� �� ���� ���ڰ� �ԷµǾ����ϴ�.');
    target.focus();
    return false;
   }
  }
 }
 return true;
}
-->
</script>
</head>

<body text="#000000" bgcolor="#FFFFFF" leftmargin="0" topmargin="0" marginwidth="0" marginheight="0">
 <br/>
 <br/>
 <form name="id_check" method="post" action="userid_check.jsp">
  <input type="hidden" name="check_count" value="<%=check_count%>">
 <table width="300" border="0" cellspacing="0" cellpadding="0" align="center" class="style1">
  <tr>
   <td>���ϴ� ���̵� �Է��ϼ���.</td>
  </tr>
 </table>
 <table width="300" border="0" bgcolor="#B6C1D6" height="39" align="center" class="style1">
  <tr> 
   <td bgcolor="#ffffff" width="40%" align="center"> 
    <input type="text" name="userid" value="<%=userid%>" onFocus="this.value=''" maxlength="16" size="16" class="input_style1">
    <input type="button" value="�ߺ�Ȯ��" onClick="doCheck()" class="input_style1">
   </td>
  </tr>
  <tr>
   <td>
   <%
    if(check_count > 0){
   %>
     �� [<%=userid%>]�� ��ϵǾ��ִ� ���̵��Դϴ�.<br>�� �ٽ� �õ����ֽʽÿ�.
   <%
    }else{
   %>
     �� [<%=userid%>]�� ��� �����մϴ�.
   <%
    }
   %>
   </td>
  </tr>
 </table>
 <table width="100%" border="0" cellspacing="0" cellpadding="0" align="center">
  <tr>
   <td align="center">
    <input type="button" value="Ȯ��" onClick="checkEnd()" class="style1">
   </td>
  </tr>
 </table>
 </form>
</body>
</html>