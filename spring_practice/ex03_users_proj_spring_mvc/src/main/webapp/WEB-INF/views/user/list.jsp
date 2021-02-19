<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

<h2>사용자 목록</h2>
<table border="1" width="80%">
<tr><th>아이디</th><th>비밀번호</th><th>성명</th><th>Role</th></tr>
<c:forEach var="user" items="${list }">
	<tr>
		<td><c:out value="${user.id }" /></td>
		<td><c:out value="${user.password }" /></td>
		<td><c:out value="${user.name }" /></td>
		<td><c:out value="${user.role }" /></td>
	</tr>
</c:forEach>
</table>
<hr>
<a href="input.do">사용자 추가</a>
</body>
</html>