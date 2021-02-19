<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<jsp:useBean id="member" class="test.web.MemberBean"></jsp:useBean>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

<!-- page, request, session, application의 setAttribute() 와 같다. -->
<!-- page에 m이라는 이름으로 member를 넣어준것. -->
<c:set var="m" target="test.web.MemberBean" property="name" value="홍길동"/>
<!-- m 이라는 속성을 삭제한다. -->
<c:remove var="m"/>

<p>성명: <c:out value="${m.name}"></c:out></p>
Name: <%= pageContext.getAttribute("m") %><br>
${m.name}
</body>
</html>