<%@page import="java.util.Enumeration"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
<!-- Latest compiled and minified CSS -->
<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/css/bootstrap.min.css">

<!-- jQuery library -->
<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.5.1/jquery.min.js"></script>

<!-- Latest compiled JavaScript -->
<script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/js/bootstrap.min.js"></script>
</head>
<body>
	<div class="container">
		<h1>로그인 페이지</h1>
		<!-- 모델1방식 JSP -> JSP -->
		<form action="LoginOk.jsp" method="post">
			<label>ID</label> : <input type="text" name="userID"><br>
			<label>PASSWD</label> : <input type="text" name="passwd"><br>
			<input type="radio" name="userType" value="1">사용자 
			<input type="radio" name="userType" value="2">관리자<br> 
			<input type="submit" value="로그인">
		</form>
	</div>

	<%
		// session.getAttribute("hello");
		Enumeration enu = session.getAttributeNames();
		while (enu.hasMoreElements()) {
			out.println((String) enu.nextElement() + "<br>");
		}

		String indexMessage = (String) session.getAttribute("indexMessage");
		out.println(indexMessage);
	%>
</body>
</html>