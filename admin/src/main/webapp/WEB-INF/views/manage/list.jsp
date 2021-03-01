<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ page session="false"%>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>
<%@ taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions"%>

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
div#bottom {
	position: absolute;
	top: 77%;
	left: 44%;
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

				<!-- Content -->
				<section>
					<div class="col-2 col-12-small">
						
							<table class="alt" style="width: 700px;">
								<tr>
									<th>번호</th>
									<th>아이디</th>
									<th>이름</th>
									<th>등급</th>
								</tr>
								<c:forEach var="row" items="${list }">
									<tr>
										<td><c:out value="${row.seq }" /></td>
										<td><a href="detail?seq=${row.seq }"> <c:out
													value="${row.id }" />
										</a></td>
										<td><c:out value="${row.name }" /></td>
										<td><c:out value="${row.grade }" /></td>
									</tr>
								</c:forEach>
							</table>
							
							<form action="list" method="POST">
								<select name="searchCondition">
									<option value="userName">이름</option>
									<option value="userID">아이디</option>
								</select> <input type="text" name="keyword"> 
								<input type="submit" value="검색">
							</form>
							<a href="write">회원등록</a>
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