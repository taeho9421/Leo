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

<h1>게시글 목록</h1>
<hr>
<table border="1" width="80%">
<tr>
	<th>SEQ</th>
	<th>TITLE</th>
	<th>WRITER</th>
	<th>REGDATE</th>
	<th>CNT</th>
</tr>
<c:forEach var="board" items="${list }">
<tr>
	<td><c:out value="${board.seq }"/></td>
	<td>
		<a href="detail.do?seq=${board.seq }">
			<c:out value="${board.title }"/>
		</a>
	</td>
	<td><c:out value="${board.writer }"/></td>
	<td><c:out value="${board.regDate }"/></td>
	<td><c:out value="${board.cnt }"/></td>
</tr>
</c:forEach>
</table>
<a href="write.do">글쓰기</a>
</body>
</html>