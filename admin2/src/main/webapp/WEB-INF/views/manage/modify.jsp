<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ page session="false"%>
<%@taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<!DOCTYPE HTML>
<html>
<head>
<title>modify</title>
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
						<strong>회원정보수정</strong>
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
						<h4>회원정보수정</h4>
						<form action="modify" method="POST">
						<input type="hidden" name="seq" value="${board.seq }">
							<table>
								<tr>
									<th>아이디</th>
									<td><input type="text" name="id" value="${board.id }" /></td>
								</tr>
								<tr>
									<th>이름</th>
									<td><input type="text" name="name" value="${board.name }" /></td>
								</tr>
								<tr>
									<th>등급</th>
									<td><input type="text" name="grade" value="${board.grade }"/></td>
								</tr>
								<tr>
									<td colspan="2"><input type="submit" value="수정하기"/></td>
								</tr>
							</table>
						</form>
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
					<ul>
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

	<!-- Scripts -->
	<script src="assets/js/jquery.min.js"></script>
	<script src="assets/js/browser.min.js"></script>
	<script src="assets/js/breakpoints.min.js"></script>
	<script src="assets/js/util.js"></script>
	<script src="assets/js/main.js"></script>

</body>

</html>