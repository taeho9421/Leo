<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ page session="false"%>
<%@taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<!DOCTYPE HTML>

<html>

<head>
    <title>detail</title>
    <meta charset="utf-8" />
    <meta name="viewport" content="width=device-width, initial-scale=1, user-scalable=no" />
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
    div#btn{
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
                    <h3><strong>회원상세보기</strong></h3>
                    <ul class="icons">
                        <li><a href="https://twitter.com/" class="icon brands fa-twitter"><span
                                    class="label">Twitter</span></a></li>
                        <li><a href="https://www.facebook.com/" class="icon brands fa-facebook-f"><span
                                    class="label">Facebook</span></a></li>
                        <li><a href="https://www.snapchat.com/" class="icon brands fa-snapchat-ghost"><span
                                    class="label">Snapchat</span></a></li>
                        <li><a href="https://www.instagram.com/" class="icon brands fa-instagram"><span
                                    class="label">Instagram</span></a></li>
                        <li><a href="https://medium.com/" class="icon brands fa-medium-m"><span
                                    class="label">Medium</span></a></li>
                    </ul>
                </header>

                <section>
                    <header class="main">
                        <h4><strong>회원정보</strong></h4>
                    </header>
                    <div class="row">
                        <div class="col-1.5 col-12-small">
                            <table class="alt" style="width: 90px;">
                                <tbody>
                                    <tr>
                                        <td>SEQ</td>
                                    </tr>
                                    <tr>
                                        <td>ID</td>
                                    </tr>
                                    <tr>
                                        <td>NAME</td>
                                    </tr>
                                    <tr>
                                        <td>GRADE</td>
                                    </tr>
                                </tbody>
                            </table>
                        </div>
                        <div class="row">
                            <div class="col-8 col-12-small">
                                <table class="alt" style="width: 500px;">
                                    <tbody>
                                        <tr>
                                            <td>${board.seq }</td>
                                        </tr>
                                        <tr>
                                            <td>${board.id }</td>
                                        </tr>
                                        <tr>
                                            <td>${board.name }</td>
                                        </tr>
                                        <tr>
                                            <td>${board.grade}</td>
                                        </tr>
                                    </tbody>
                                </table>
                            </div>
                </section>
                <div id="btn">
                    <ul class="actions">
                        <li><a href="list" class="button primary">회원목록</a></li>
                        <li><a href="modify?seq=${board.seq }" class="button primary">수정</a></li>
                        <li><a href="delete?seq=${board.seq }" class="button primary">삭제</a></li>
                    </ul>
                </div>
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
                <!-- Section -->


                <!-- Section -->


                <!-- Footer -->
                <footer id="footer">
                    <p class="copyright">&copy; Un
                    titled. All rights reserved.</p>
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