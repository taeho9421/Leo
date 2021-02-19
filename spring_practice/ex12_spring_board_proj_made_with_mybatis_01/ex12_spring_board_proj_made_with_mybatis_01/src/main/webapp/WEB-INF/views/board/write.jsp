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
<h1>글쓰기</h1>
<form action="write" method="POST">
<table width="550" border="1">
	<tr>
		<th>제목</th>
		<td><input type="text" name="title" value="글쓰기 연습" /></td>
	</tr>
	<tr>
		<th>작성자</th>
		<td><input type="text" name="writer" value="강감찬" /></td>
	</tr>
	<tr>
		<th>내용</th>
		<td><textarea name="content" cols="50" rows="10">강감찬은 최고의 장수이다.</textarea></td>
	</tr>
	<tr>
		<td colspan="2">
			<input type="submit" value="저장하기" />
		</td>
	</tr>
</table>
</form>

</body>
</html>