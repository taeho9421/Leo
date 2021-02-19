<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>hello.jsp</title>
</head>
<body>
<!-- userName 파라미터값이 0일 경우 로그인페이지로 다시 forwarding -->
<!-- jstl을 이용한 조건 검사 (라이브러리가 필수적이다) -->
<c:if test="${fn:length(param.userName) ==0 }">
	<!-- action tag를 이용한 forward 처리(라이브러리 필요없음) -->
	<jsp:forward page="handeIt.jsp">
		<jsp:param value="We`re sorry. . .you need to login again." name="msg"/>
	</jsp:forward>
</c:if>

<p>Welcome to our page!!</p>
<!-- EL를 이용한 파라미터 값 확인(라이브러리 필요없음) -->
<h3>Hello ${param.userName }</h3>

</body>
</html>