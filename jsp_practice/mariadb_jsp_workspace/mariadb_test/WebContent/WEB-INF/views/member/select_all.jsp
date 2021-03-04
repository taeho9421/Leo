<%@page import="org.comstudy21.webapp.dto.MemberDTO"%>
<%@page import="java.util.ArrayList"%>
<%@ page contentType="text/html; charset=EUC-KR" %> 
<%@ page language="java" import="java.sql.*" %> 
<html>
<head>
<title>우리 회원 정보관리</title>
<meta http-equiv="Content-Type" content="text/html; charset=euc-kr">
<link rel="StyleSheet" href="style.css" type="text/css">
<table width="500" border="1" bordercolorlight="#999999" bordercolordark="#FFFFFF" cellpadding="3" cellspacing="0" align="center" class=style2>
 <TH background="image/sky_bar.gif">사용자 ID</TH>
 <TH background="image/sky_bar.gif">이 름</TH>
 <TH background="image/sky_bar.gif">주 소</TH>
 <TH background="image/sky_bar.gif">삭 제</TH>
<% 
    if (request.getAttribute("user_list") == null)  {
%>
    <TR><TD colspan=4>등록된 회원이 없습니다.</TD></TR>
<%  
    } else {
       ArrayList<MemberDTO> userList = (ArrayList<MemberDTO>)request.getAttribute("user_list");
         for(int i=0; i<userList.size(); i++) {
            MemberDTO member = userList.get(i);
%>
    <TR>
       <TD align='center'><%=member.getUserid() %></TD>
       <TD align='center'>
       		<a href="detail.do?userid=<%=member.getUserid()%>">
       			<%=member.getUsername() %>		
       		</a>
       </TD>
       <TD><%=member.getAddress1() %><%=member.getAddress2() %></TD>        
       <td><a href="delete.do?userid=<%=member.getUserid()%>">삭제하기</a></td> 
    </TR> 
<%
         }
  }
%>
</TABLE>
</CENTER> 
</BODY>
</HTML>