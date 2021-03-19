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
					<a href="index" class="logo"><strong>회원관리</strong> </a>
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
							<h1></h1>
						</header>
						<table>
							<tr>
								<th>No</th>
								<th>아이디</th>
								<th>이름</th>
								<th>이메일</th>
								<th>전화번호</th>
								<th>등급</th>
								<th>강퇴</th>
							</tr>
							<!-- 회원가입된 Member DTO 에서 가져오기 -->
							<c:forEach items="${members }" var="dto"> 
							<tr>
								<td>${dto.member_no}</td>
								<td>${dto.member_id }</td>
								<td>${dto.member_name }</td>
								<td>${dto.member_email }</td>
								<td>${dto.member_phone }</td>
								<td>
									<form action="levelUp" method="post">
										<input type="text" name="level" value="${dto.member_level }">
										<input tpye="submit" value="등급조정">
									</form>
								</td>
								<td><a href="./delete?userID=${dto.member_id }">탈퇴</a></td>
							</tr>
							</c:forEach>
						</table>
						<form method="post" action="search.jsp">
							<div>
								<input type="text" placeholder="Search" name="searchword"/>
							</div>
							<button class="btn" type="submit">검색</button>
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
						<h2>Menu</h2>
					</header>
					<ul>
						<li><a href="index">Homepage</a></li>
						<li><a href="generic">Menu2</a></li>
						<li><a href="elements">Menu3</a></li>
						<li><a href="member_management">회원관리</a></li>
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
