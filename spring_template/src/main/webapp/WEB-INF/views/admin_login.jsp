<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ page session="false"%>
<%@taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<!DOCTYPE html>
<html>
<head>
<title>관리자 로그인</title>
<meta charset="UTF-8">
<meta name="viewport"
	content="width=device-width, initial-scale=1, user-scalable=no" />
<link href="<c:url value="/resources/assets/css/main.css" />"
	rel="stylesheet">
</head>
<body class="is-preload">
	<div id="wrapper">
	<div id="main">
	<div class="inner">
	<div>
		<span style="color: green; font-weight: bold;">관리자로그인</span>
	</div>
	<hr>
	<br>
	<div>
			<form action="admin_login_ok.do" method="post">
				<div>
					<br> 
						<label>관리자아이디:</label><input type="text" name="admin_id"
						placeholder="아이디를 입력하세요."><br><br> 
						<label>관리자비밀번호:</label><input type="password" name="admin_pass" placeholder="*******"><br><br>
					<button type="submit" name="submit">로그인</button>
					<br> 
					<br>
				</div>
	</div>
	</form>
	</div>
	</div>
	</div>
</body>
<script src="http://ajax.googleapis.com/ajax/libs/jquery/1.11.1/jquery.min.js"></script>
<script>
	$(function() {
		var Message = "<c:out value="${message}"/>";
		if(Message != "" ){
			alert(Message);
		}
	});
</script>
</html>