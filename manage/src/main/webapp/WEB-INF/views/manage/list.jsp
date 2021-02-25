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

<h1>회원 리스트</h1>
<hr />
<form action="list" method="POST">
	<select name="searchCondition">
		<option value="userName">이름</option>
		<option value="userID">아이디</option>
	</select>
	<input type="text" name="keyword">
	<input type="submit" value="검색">
</form>
<table width="700" border="1">
	<tr>
		<th>번호</th>
		<th>아이디</th>
		<th>이름</th>
		<th>등급</th>
	</tr>
<c:forEach var="row" items="${list }">	
	<tr>
		<td><c:out value="${row.seq }" /></td>
		<td>
			<a href="detail?seq=${row.seq }">
				<c:out value="${row.id }" />
			</a>
		</td>
		<td><c:out value="${row.name }" /></td>
		<td><c:out value="${row.grade }" /></td>
	</tr>
</c:forEach>
</table>
<a href="write">회원등록</a>




</body>
</html>