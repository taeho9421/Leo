<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ page session="false"%>
<%@taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<!DOCTYPE HTML>

<html>
<head>
<title>index</title>
<meta charset="utf-8" />
<meta name="viewport"
	content="width=device-width, initial-scale=1, user-scalable=no" />
<link href="<c:url value="/resources/assets/css/main.css" />"
	rel="stylesheet">
</head>
<body class="is-preload">

	<!-- Wrapper -->
	<div id="wrapper">

		<!-- Main -->
		<div id="main">
			<div class="inner">

				<!-- Header -->
				<header id="header">
					<a href="index" class="logo"><strong>관리자페이지</strong> </a>
					<ul class="icons">
						<li><a href="#" class="icon brands fa-twitter"><span
								class="label">Twitter</span></a></li>
						<li><a href="#" class="icon brands fa-facebook-f"><span
								class="label">Facebook</span></a></li>
						<li><a href="#" class="icon brands fa-snapchat-ghost"><span
								class="label">Snapchat</span></a></li>
						<li><a href="#" class="icon brands fa-instagram"><span
								class="label">Instagram</span></a></li>
						<li><a href="#" class="icon brands fa-medium-m"><span
								class="label">Medium</span></a></li>
					</ul>
				</header>

				<!-- Banner -->
				<section id="banner">
					<div class="content">
						<header>
							<h2>관리자 정보</h2>
						</header>
						<table class="adminInfo">	
							<tr>
								<th scope="row">이름</th>
								<td>홍 길 동</td>
							</tr>
							<tr>
								<th scope="row">아이디</th>
								<td>Gildongs</td>
							</tr>
							<tr>
								<th scope="row">전화번호</th>
								<td>010-1111-2222</td>
							</tr>
							<tr>
								<th scope="row">이메일</th>
								<td>mygil@naver.com</td>
							</tr>
							<tr>
								<th scope="row">등급</th>
								<td>manager</td>
							</tr>
						</table>
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
						<h2>Menu</h2>
					</header>
					<ul>
						<li><a href="index">Homepage</a></li>
						<li><a href="generic">Menu2</a></li>
						<li><a href="elements">Menu3</a></li>
						<li><a href="member_management">MemberManagement</a></li>
						<li><a href="#">Menu4</a></li>
					</ul>
				</nav>

				<!-- Section -->
				<section>
					<header class="major">
						<h2></h2>
					</header>
					<p></p>
					<ul class="contact">
						<li class="icon solid fa-envelope"><a href="#">1234@naver.com</a></li>
						<li class="icon solid fa-phone">(000) 000-0000</li>
						<li class="icon solid fa-home">adress<br /> Nashville, TN
							00000-0000
						</li>
					</ul>
				</section>

				<!-- Footer -->
				<footer id="footer">
					<p class="copyright">&copy; Untitled. All rights reserved.</p>
				</footer>

			</div>
		</div>

	</div>

	<!-- Scripts -->

	<script src="<c:url value="/resources/assets/js/jquery.min.js"/>"></script>
	<script src="<c:url value="/resources/assets/js/browser.min.js"/>"></script>
	<script src="<c:url value="/resources/assets/js/breakpoints.min.js"/>"></script>
	<script src="<c:url value="/resources/assets/js/util.js"/>"></script>
	<script src="<c:url value="/resources/assets/js/main.js"/>"></script>

	<!-- <script src="assets/js/jquery.min.js"></script> 
	<script src="assets/js/browser.min.js"></script>
	<script src="assets/js/breakpoints.min.js"></script>
	<script src="assets/js/util.js"></script>
	<script src="assets/js/main.js"></script> -->

</body>
</html>
