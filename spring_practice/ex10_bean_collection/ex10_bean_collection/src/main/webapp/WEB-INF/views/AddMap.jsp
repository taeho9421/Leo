<%@page import="org.comstudy21.myweb.app.MyMessage"%>
<%@page import="java.util.Map.Entry"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h1>메세지 맵 출력</h1>
	<hr>
	<!-- Map 구조를 forEach하려면 Map의 Entry가 추출 된다. -->
	<c:forEach var="msgKey" items="${msgMap }">
		<%
			Entry entry = (Entry)pageContext.getAttribute("msg");
			MyMessage myMessage = (MyMessage)entry.getValue();
		%>
		<p><c:out value="${msg.key }: ${msg.value}"/></p>
	</c:forEach>
</body>
</html>