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

<!-- 
이클립스에서 젠코딩 기능 추가 : install new software로 emmet 설치
	location url : http://download.emmet.io/eclipse/updates/ 
-->

<h1>주소록</h1>
<c:forEach var="addr" items="${addrSet }">
	<p><c:out value="${addr }"></c:out></p>
</c:forEach>

</body>
</html>