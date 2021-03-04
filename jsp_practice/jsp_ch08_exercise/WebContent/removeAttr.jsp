<%@page import="java.util.Enumeration"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>removeAttr.jsp</title>
</head>
<body>
 <%
 session.setAttribute("name1", "오징어");
 session.setAttribute("name2", "꼴뚜기");
 session.setAttribute("name3", "대구");
 session.setAttribute("name4", "명태");
 
 Enumeration names = session.getAttributeNames();
 while(names.hasMoreElements()){
	 String attrName = names.nextElement().toString();
	 out.println(attrName+"=>"+session.getAttribute(attrName));
 }
 
 out.println("<hr>");
 session.invalidate(); // 새로고침 또는 request.getSession() 해야 다시 사용가능. 
 names = session.getAttributeNames();
 while(names.hasMoreElements()){
	 String attrName = names.nextElement().toString();
	 out.println(attrName+"=>"+session.getAttribute(attrName));
 }
 
 // 세션아이디가 유효한가? 
out.println("세션 아이디가 유효한가?");
out.println(request.isRequestedSessionIdValid());
 %>
</body>
</html>