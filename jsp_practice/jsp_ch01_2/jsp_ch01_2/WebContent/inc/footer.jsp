<%@page import="java.util.ArrayList"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>

<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">

<address>길동이 사는곳</address>
<%
if(request.getAttribute("fishList") != null) {
	ArrayList<String> fishList = (ArrayList<String>)request.getAttribute("fishList");
	for(String fish :  fishList) {
		out.println(fish + "<br>");
	}
}
%>