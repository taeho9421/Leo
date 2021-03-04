<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>


<%
session.setMaxInactiveInterval(10);
String sessionId = session.getId(); // 세션의 아이디 
Long createTime = session.getCreationTime(); // 세션 생성 시간
int inactive = session.getMaxInactiveInterval(); // 세연의 수명 
boolean newSession = session.isNew();
%>

<p>sessionId : <%=sessionId %></p>
<p>createTime : <%=createTime / 6000 %>분</p>
<p>inactive : <%=inactive / 60 %></p>
<p>newSession : <%=newSession %></p>

</body>
</html>