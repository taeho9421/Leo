<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h1>로그인 폼</h1>
	<form action="login.do" method="POST">
		사용자 아이디: <input type="text" name="userID" value="김범준"><br> 
		비밀 번호: <input type="password" name="passwd" value="12345"><br> 
		관심 분야: 
			<input type="checkbox" name="checkValues" value="JAVA">JAVA<br>
			<input type="checkbox" name="checkValues" value="jquery">jQuery<br>
			<input type="checkbox" name="checkValues" value="spring">Spring<br>
			<input type="checkbox" name="checkValues" value="nodejs">Node.js<br> 
		<input type="submit" value="로그인">
	</form>
</body>
</html>