<%@ page pageEncoding="UTF-8" contentType="text/html; charset=UTF-8" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page session="false" %>
<html>
<head>
	<meta charset="UTF-8">
	<title>Home</title>
</head>
<body>
<h1>Hello world!</h1>

<P>  The time on the server is ${serverTime}. </P>
<hr>
<ul>
	<li><a href="user/list.do">user list</a></li>
</ul>

</body>
</html>
