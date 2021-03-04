<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
	<%
	// 로그아웃 (세션을 삭제한다) 
	// index.jsp 로 갱신한다.
	String redirectPath = (String)session.getAttribute("redirectPath");
	session.invalidate();
	
	response.sendRedirect(request.getContextPath() + (redirectPath==null?"/":redirectPath));
	%>
</body>
</html>