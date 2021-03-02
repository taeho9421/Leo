<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>Insert title here</title>
</head>
<body>
	<h2>상세보기</h2>
	<table width="550" border="1">
		<tr>
			<th>번호</th>
			<td><c:out value="${board.seq }"/></td>
		</tr>
		<tr>
			<th>제목</th>
			<td><c:out value="${board.title}"/></td>
		</tr>
		<tr>
			<th>작성자</th>
			<td><c:out value="${board.writer }"/></td>
		</tr>
		<tr>
			<th>내용</th>
			<td><c:out value="${board.content }"/></td>
		</tr>
		<tr>
			<th>날짜</th>
			<td><c:out value="${board.regdate }"/></td>
		</tr>
		<tr>
			<th>조회수</th>
			<td><c:out value="${board.cnt }"/></td>
		</tr>
	</table>
	<a href="list.do">목록</a> |
	<a href="update?seq=${board.seq }">수정</a> | 
	<a href="delete?seq=${board.seq }">삭제</a>
</body>
</html>