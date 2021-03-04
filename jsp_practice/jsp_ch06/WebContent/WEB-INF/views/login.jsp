<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>

<%
if(session.getAttribute("login.id") == null) {
%>
<h1>로그인 페이지</h1>
<form action="login.do" method="POST">
아이디 : <input type="text" name="id"><br>
비 번 : <input type="password" name="pass"><br>
<input type="submit" value="로그인">
</form>
<%
} else {
%>
	<h3>로그인 되었습니다!</h3>
	<p>${login.id }님 환영합니다.</p>
	<p><a herf="lonin.do?cmd=logout">로그아웃</a></p>
<%
} // end of if
%>
	<script src="http://code.jquery.com/jquery.js"></script>
	<script>
		$("form").submit(function(event) {
			event.preventDefault();
			if(this.id.value == "") {
				alert("아이디를 입력하세요.")
				this.id.focus();
				return;
			}
			if(this.pass.value == "") {
				alert("패스워드를 입력하세요.")
				this.pass.focus();
				return;
			}
			this.submit();
		});
	</script>
</body>
</html>