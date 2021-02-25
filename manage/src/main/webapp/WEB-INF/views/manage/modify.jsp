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

<h1>회원정보수정</h1>
<form action="modify" method="POST">
<input type="hidden" name="seq" value="${board.seq }">
<table>
	<tr>
		<th>아이디</th>
		<td><input type="text" name="id" value="${board.id }"/></td>
	</tr>
	<tr>
		<th>이름</th>
		<td><input type="text" name="name" value="${board.name }"/></td>
	</tr>
	<tr>
		<th>등급</th>
		<td><input type="text" name="grade" value="${board.grade }"/></td>
	</tr>
	<tr>
		<td colspan="2">
			<input type="submit" value="수정하기">
		</td>
	</tr>
</table>
</form>

</body>
</html>