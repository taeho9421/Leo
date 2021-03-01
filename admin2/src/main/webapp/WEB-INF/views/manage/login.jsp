<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<!DOCTYPE HTML>
<html>
<head>
<title>list</title>
<meta charset="utf-8" />
<meta name="viewport"
	content="width=device-width, initial-scale=1, user-scalable=no" />
<link href="<c:url value="/resources/assets/css/main.css" />"
	rel="stylesheet">
</head>
<style>
/* div#bottom {
	position: absolute;
	top: 70%;
	left: 24%;
} */
input#demo-name {
	width: 160px;
}
</style>
<body class="is-preload">

	<!-- Wrapper -->
	<div id="wrapper">

		<!-- Main -->
		<div id="main">
			<div class="inner">

				<!-- Header -->
				<header id="header">
					<h3>
						<strong>회원목록</strong>
					</h3>
					<ul class="icons">
						<li><a href="https://twitter.com/"
							class="icon brands fa-twitter"><span class="label">Twitter</span></a></li>
						<li><a href="https://www.facebook.com/"
							class="icon brands fa-facebook-f"><span class="label">Facebook</span></a></li>
						<li><a href="https://www.snapchat.com/"
							class="icon brands fa-snapchat-ghost"><span class="label">Snapchat</span></a></li>
						<li><a href="https://www.instagram.com/"
							class="icon brands fa-instagram"><span class="label">Instagram</span></a></li>
						<li><a href="https://medium.com/"
							class="icon brands fa-medium-m"><span class="label">Medium</span></a></li>
					</ul>
				</header>

				<section>
					<div class="col-6 col-12-small">
						<h3>관리자 로그인 페이지</h3>
						<c:choose>
							<c:when test="${loginAdmin == null }">
								<h1>로그인 페이지</h1>
								<form action="login" method="POST">
									<label for="adminId">아이디</label> 
									<input type="text" name="adminId" id="adminId" value="bitcamp" /><br />
									<label for="adminPassword">비밀번호</label> 
									<input type="password" name="adminPassword" id="adminPassword" value="12345" /><br />
									<input type="submit" value="Login" />
								</form>
							</c:when>
							<c:otherwise>
								<h3>
									<c:out value="${loginAdmin.adminName} 관리자님 어서오세요!"></c:out>
								</h3>
								<ul>
								<li><a href="logout">로그아웃</a></li>
								<li><a href="list">관리자페이지</a></li>
								</ul>
							</c:otherwise>
						</c:choose>
					</div>
				</section>
			</div>
		</div>

		<!-- Sidebar -->
		<div id="sidebar">
			<div class="inner">

				<!-- Search -->
				<section id="search" class="alt">
					<form method="post" action="#">
						<input type="text" name="query" id="query" placeholder="Search" />
					</form>
				</section>

				<!-- Menu -->
				<nav id="menu">
					<header class="major">
						<h2>MANAGER-MENU</h2>
					</header>
					
				</nav>

				<footer id="footer">
					<p class="copyright">&copy; Untitled. All rights reserved.</p>
				</footer>
			</div>
		</div>
	</div>

	<!-- Scripts -->
	<script src="assets/js/jquery.min.js"></script>
	<script src="assets/js/browser.min.js"></script>
	<script src="assets/js/breakpoints.min.js"></script>
	<script src="assets/js/util.js"></script>
	<script src="assets/js/main.js"></script>

</body>

</html>