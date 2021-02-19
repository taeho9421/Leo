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

<h1>멤버 목록</h1>
<table border="1">
   <tr>
      <th>이름</th><th>나이</th><th>몸무게</th><th>키</th><th>성별</th>
   </tr>
   <c:forEach var="member" items="${list }">
      <tr>
         <td><c:out value="${member.name }"></c:out></td>
         <td><c:out value="${member.age }"></c:out></td>
         <td><c:out value="${member.weight }"></c:out></td>
         <td><c:out value="${member.height }"></c:out></td>
         <td><c:out value="${member.sex }"></c:out></td>
      </tr>
   </c:forEach>
</table>

</body>
</html>