<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ include file="/inc/header.jsp" %>

<h1>회원 정보 입력</h1>
<form action="input.do" method="POST">
성명:<input type="text" name="name"><br>
키:<input type="text" name="height"><br>
몸무게:<input type="text" name="weight"><br>
나이:<input type="text" name="age"><br>
성별:
<select>
	<option value="남">남</option>
	<option value="여">여</option>
</select>
<br>
<input type="submit" value="저장">
</form>

<%@ include file="/inc/footer.jsp"%>