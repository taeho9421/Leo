<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ page session="false"%>
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
						<strong>회원등록</strong>
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
				
				<!-- content -->
				<section>
					<div class="col-6 col-12-small">
						<h4>회원등록페이지</h4>
						<form action="write" method="POST">
							<table>
								<tr>
									<th>id</th>
									<td><input type="text" name="id" value="아이디입력" /></td>
								</tr>
								<tr>
									<th>name</th>
									<td><input type="text" name="name" value="이름입력" /></td>
								</tr>
								<tr>
									<th>grade</th>
									<td><input type="text" name="grade" value="새싹" /></td>
								</tr>
								<tr>
									<td colspan="2"><input type="submit" value="저장하기"/></td>
								</tr>
							</table>
						</form>
					</div>
				</section>
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
						<ul>
							<li><a href="list">Management</a></li>
						</ul>
				</nav>
				
				<footer id="footer">
					<p class="copyright">&copy; Untitled. All rights reserved.</p>
				</footer>
			</div>
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