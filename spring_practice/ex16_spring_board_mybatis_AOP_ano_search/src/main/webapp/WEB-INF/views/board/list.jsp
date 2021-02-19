<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<style>
table {
	border-collapse : collapse;
	margin: 10px 0;
}
td {
	padding: 5px;
}
</style>
</head>
<body>

<h1>자유 게시판</h1>
<hr />
<form action="list" method="POST">
<table  width="700" border="0">
	<tr>
		<td align="right">
			<select name="searchCondition">
				<c:forEach var="option" items="${conditionMap }">
					<option value="${option.value }">${option.key }</option>
				</c:forEach>
			</select>
			<input type="text" name="keyword" />
			<input type="submit" value="검색" />
		</td>
	</tr>
</table>
</form>
<table width="700" border="1">
	<tr>
		<th>번호</th>
		<th>제목</th>
		<th>글쓴이</th>
		<th>작성일</th>
		<th>조회수</th>
	</tr>
<c:forEach var="row" items="${list }">	
	<tr>
		<td><c:out value="${row.seq }" /></td>
		<td>
			<a href="detail?seq=${row.seq }">
				<c:out value="${row.title }" />
			</a>
		</td>
		<td><c:out value="${row.writer }" /></td>
		<td><c:out value="${row.regDate }" /></td>
		<td><c:out value="${row.cnt }" /></td>
	</tr>
</c:forEach>
</table>
<a href="write">글쓰기</a>




</body>
</html>