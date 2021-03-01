<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ page session="false"%>
<%@taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<!DOCTYPE HTML>

<html>

<head>
<title>delete</title>
<meta charset="utf-8" />
<meta name="viewport"
	content="width=device-width, initial-scale=1, user-scalable=no" />
<link href="<c:url value="/resources/assets/css/main.css" />"
	rel="stylesheet">
</head>
<style>
.th-1 {
	width: 50px;
}

.th-2 {
	width: 100px;
}

.th-3 {
	width: 400px;
}

.th-4 {
	width: 100px;
}

div#btn {
	position: absolute;
	top: 65%;
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
						<strong>회원강제퇴장</strong>
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
					<header class="main">
						<h4>
							<strong>Are you sure?</strong>
						</h4>
						<h3>
							<strong>${board.name } 회원을 정말 삭제하시겠습니까?</strong>
						</h3>
					</header>
					
					<div id="btn">
						<form action="delete" method="post">
							<input type="hidden" name="seq" value="${board.seq }" />
							<input type="submit" value="정말로 삭제하기" />
						</form>
					</div>
				</section>
			</div>
		</div>

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
				<!-- Section -->


				<!-- Section -->


				<!-- Footer -->
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