<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

<h1>프로퍼티스 주소록 출력</h1>
<hr>
<c:forEach var="prop" items="${addProp }">
	<p>${prop.key } : ${prop.value} </p>
</c:forEach>

</body>
</html>