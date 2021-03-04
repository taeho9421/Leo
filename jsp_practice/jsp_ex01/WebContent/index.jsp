<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
<%!
	// 선언부 - 메소드 외부에 구현하는 부분
	// 필드나 메소드를 선언하는 부분 
	JspWriter jspOut;
	public void sayHello(String message) throws IOException {
		jspOut.println(message);
}
%>

<% 
	// 스크립트 릿 - 자바에서 메소드 내부에서 구현하는 부분 
	// Service() 라는 메소드 내부가 된다.  
	jspOut = out;
	String title = "Hellow world";
	sayHello("안녕하세요!");
%>

<! -- html 주석 --> 
<!-- 표현식(익스 프레션) -->
<h2>제목: <%=title %> </h2>

</body>
</html>