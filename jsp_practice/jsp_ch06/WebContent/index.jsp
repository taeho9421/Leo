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
// 세션을 소멸한다
session.invalidate();
%>
	<h1>범준쌤 코딩교실</h1>
	<ul>
		<ul><a href="initParam.do">초기파라미터(init parameter)</a></ul>
		<ul><a href="file.do">파일읽기(getResourceAsStream)</a></ul>
		<ul><a href="session.do">파일읽기(session(isNew()))</a></ul>
		<ul><a href="login.do">로그인(login)</a></ul>
	</ul>
</body>
</html>