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
	// service() 메소드의 로컬영역
	String userID = request.getParameter("userID");	
	String passwd = request.getParameter("passwd");	
	String userType = request.getParameter("userType");	
	%>
	
	userID : <%=userID %><br>
	passwd : <%=passwd %><br>
	userType : <%=userType %><br>
	
	<%
	// 전달받은 정보를 Session에 저장한다.
	session.setAttribute("userID", userID);
	session.setAttribute("userType", userType);
	session.setAttribute("userName", userType.equals("2")?"관리자":"사용자");
	
	// session 저장후 index.jsp 페이지로 갱신된다.(refresh)
	// JSP는 그냥 사용이 가능한 내장객체 : page, request, session, respones, application(context)
	response.sendRedirect(request.getContextPath()+"/");
	%>
</body>
</html>