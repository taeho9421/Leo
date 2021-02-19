<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>handleIt.jsp</title>
</head>
<body>

<!-- jstl을 이용하여 param.msg가 있으면 msg를 보여주고 아니면 로그인하세요를 보여주게한다. -->
<c:if test="${param.msg != null}">
	<p>${param.msg }</p>
</c:if>
<c:if test="${param.msg == null}">
	<p>로그인하세요~</p>
</c:if>
<form action="hello.jsp" method="GET">
Name: <input type="text" name="userName">
<input type="submit" value="로그인"> 
</form>

</body>
</html>