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
<!-- http://xmlns.jcp.org -->
<!-- 주말과제: 지금까지 학습한 스프링 총 정리하기 -->

<h1>주소록</h1>
<hr>
<c:forEach var="addr" items="${addrList}">
	<p><c:out value="${addr }"></c:out></p>
</c:forEach>


</body>
</html>