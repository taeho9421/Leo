<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>관리자 로그인 페이지</title>
<style>
label {
	display: inline-block;
	width: 80px;
}
</style>
</head>
<script type="text/javascript">
	$(document).ready(function() {
		$("#logoutBtn").on("click", function() {
			location.href = "member/logout";
		})
	})
</script>
<body>
	<form name='homeForm' method="post" action="admin/login">
		<c:if test="${admin == null}">
			<div>
				<label for="userId">아이디</label> <input type="text" id="id"
					name="id">
			</div>
			<div>
				<label for="userPass">비밀번호</label> <input type="password" id="password"
					name="password">
			</div>
			<div>
				<button type="submit">로그인</button>
			</div>
		</c:if>
		<c:if test="${admin != null }">
			<div>
				<p>${admin.id}님환영 합니다.</p>
				<button id="logoutBtn" type="button">로그아웃</button>
			</div>
		</c:if>
		<c:if test="${msg == false}">
			<p style="color: red;">로그인 실패! 아이디와 비밀번호 확인해주세요.</p>
		</c:if>
	</form>
</body>
</html>