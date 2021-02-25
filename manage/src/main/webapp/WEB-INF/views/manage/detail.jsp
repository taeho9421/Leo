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

<h1>회원상세보기</h1>
<table width="550" border="1">
	<tr>
		<th>SEQ</th>
		<td><c:out value="${board.seq }"/></td>
	</tr>
	<tr>
		<th>ID</th>
		<td><c:out value="${board.id }"/></td>
	</tr>
	<tr>
		<th>NAME</th>
		<td><c:out value="${board.name }"/></td>
	</tr>
	<tr>
		<th>GRADE</th>
		<td><c:out value="${board.grade }"/></td>
	</tr>
</table>
<a href="list">목록</a> |
<a href="modify?seq=${board.seq }">수정</a> |
<a href="delete?seq=${board.seq }">삭제</a>

</body>
</html>