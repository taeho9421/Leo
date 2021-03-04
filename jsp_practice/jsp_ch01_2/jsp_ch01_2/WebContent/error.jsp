<%@page import="java.io.PrintWriter"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page isErrorPage="true" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>에러가 발생 했습니다</title>
<style>
div {
width: 800px;
height: 200px;
overflow: scroll;
border: 6px solid gray;
}
</style>
</head>
<body>
	<h2>에러가 발생되었습니다</h2>
	<h3>Exception 내장 객체 변수</h3>
	<div>
	<%
		exception.printStackTrace(new PrintWriter(out));
	%>
	</div>
</body>
</html>