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
	session.setAttribute("index_massage", "태호의 코딩교실");
// invalidate() 세션을 초기화한다(세션을 새로 생성하고 저장값을 모두 소멸한다.)
// setMaxInactiveInterval() , getMaxInactiveInterval() : 유효기간을 설정
// setAttribute() getAttribute(), removeAttribute() 
// getLastAccessedTime() : 마지막 접속 시간 
// isNew() : 새 세션인지 확인 

// request 객체는 URL(주소)가 변경되면 초기화 된다.
// Session 객체는 URL(주소)가 변경되더라도 브라우저만 안꺼지면 계속 사용 가능하다. 
request.setAttribute("admin","이태호" );
%>
<!-- 
	쿠키는 클라이언트 쪽 컴퓨터에 저장되는 접속정보이다  
	세션은 서버쪽 컴퓨터에 저장된다.
	 - 컨텍스트는 모든 세션(브라우저) 공유가능한 내장객체
	 - 세션은 브라우저 단위의 내장 객체가 된다. 	
	 - 세션 정보는 휘발성이다.(DB나 파일에 사용자의 상태를 저장 가능하다.)
	 
	서블릿에서는 request.getSession() 을 이용해서 세션 객체(세션 정보)를 얻는다.
	JSP에서는 자동으로 Session()이라는 객체가 만들어진다.  
	 
-->
	<div class="container">
		<header>
			<p>
			<%
				if(session.getAttribute("userTypeName") != null) {
					String userTypeName = (String)session.getAttribute("userTypeName");
			%>
				<strong><%=userTypeName %></strong>님 안녕하세요!
				<a href="member/Logout.jsp">로그아웃</a>
			<% 
				} else {
					out.println("아직 로그인 전입니다! <a href=\"member/Login.jsp?user=HONG\">Login</a>");
				}
			%>
			</p>
			<h1>태호의 코딩교실</h1>
			<hr>
			<ul>
				<li>Home</li>
				<li>Lecture</li>
				<li><a href="shop/list.jsp">Shop</a></li>
				<li>joinUs</li>
				<li><a href="member/Login.jsp?user=HONG">Login</a></li>
			</ul>
		</header>
	</div>
</body>
</html>