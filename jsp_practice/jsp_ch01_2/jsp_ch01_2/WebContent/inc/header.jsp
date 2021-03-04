<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>

<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">

<h1>길동이의 쇼핑몰</h1>
<%
if(request.getAttribute("message") != null) {
	String message = (String)request.getAttribute("message");
	out.println("<p>message => "+ message +"</p>");
}
%>
<%
String user = request.getParameter("user");
out.println("<p>user => "+ user +"</p>");
%>