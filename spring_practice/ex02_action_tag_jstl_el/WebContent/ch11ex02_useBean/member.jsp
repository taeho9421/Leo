<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<% request.setCharacterEncoding("UTF-8"); %>
<%  %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>member.jsp</title>
<style>
	label {
		width:100px; 
		display:inline-block;
	}
</style>
</head>
<body>
	<div>
		<jsp:useBean id="m" class="test.web.MemberBean"></jsp:useBean>
		<jsp:setProperty property="*" name="m"/>
		<h2>빈 객체에 담아서 확인</h2>
		<p><label>이름</label>${m.name }</p>
		<p><label>나이</label>${m.age }</p>
		<p><label>몸무게</label>${m.weight }</p>
		<p><label>키</label>${m.height }</p>
		<p><label>성별</label>${m.sex }</p>
	</div>
	<hr>
	<div>
		<h2>전달 받은 멤버 정보를 el로 바로 확인하기</h2>
		<p><label>이름</label>${param.name }</p>
		<p><label>나이</label>${param.age }</p>
		<p><label>몸무게</label>${param.weight }</p>
		<p><label>키</label>${param.height }</p>
		<p><label>성별</label>${param.sex }</p>
	</div>
</body>
</html>