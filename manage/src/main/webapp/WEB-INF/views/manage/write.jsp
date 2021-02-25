<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

<h1>회원등록</h1>
<form action="write" method="POST">
<table>
	<tr>
		<th>id</th>
		<td><input type="text" name="id" value="아이디입력"/></td>
	</tr>
	<tr>
		<th>name</th>
		<td><input type="text" name="name" value="이름입력"/></td>
	</tr>
	<tr>
		<th>grade</th>
		<td><input type="text" name="grade" value="새싹"/></td>
	</tr>
	<tr>
		<td colspan="2">
			<input type="submit" value="저장하기">
		</td>
	</tr>
</table>
</form>

</body>
</html>