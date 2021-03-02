<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ page session="false"%>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>
<%@ taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>List</title>
</head>
<body>
	<h2>게시판목록</h2>
	<table>
		<tr>
			<th width="77"><p align="center">글번호</p></th>
			<th width="327"><p align="center">제목</p></th>
			<th width="197"><p align="center">작성자</p></th>
			<th width="155"><p align="center">내용</p></th>
			<th width="225"><p align="center">작성일</p></th>
			<th width="55"><p align="center">조회수</p></th>
		</tr>
		
		<c:forEach items="${list }" var="board">
		<tr>
			<td><p align="center"><c:out value="${board.seq }"/></p></td>
			<td><p align="center"><a href="detail?seq=${board.seq }"><c:out value="${board.title }"/></a></p></td>
			<td><p align="center"><c:out value="${board.writer }"/></p></td>
			<td><p align="center"><c:out value="${board.content}"/></p></td>
			<td><p align="center"><c:out value="${board.regdate}"/></p></td>
			<td><p align="center"><span class="badge bg-red"><c:out value="${board.cnt }"/></span></p></td>		
		</tr>
		</c:forEach>
	</table>
	<form action="list" method="POST">
		<select name="searchCondition">
			<option value="title">제목</option>
			<option value="writer">작성자</option>
		</select>
		<input type="submit" value="검색">
	</form>
	<a href="write">글쓰기</a>
</body>
</html>