<%@page import="java.sql.*"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>member_form_ok.jsp</title>
</head>
<body>
	<%!static String url = "jdbc:oracle:thin:@localhost:1521:XE";
	static String user = "comstudy21";
	static String password = "comstudy21";

	static Connection conn;
	static PreparedStatement pstmt;

	static final String INSERT = "INSERT INTO member VALUES(mem_seq.nextval,?,?,?)";%>

	<%
		request.setCharacterEncoding("UTF-8");

		String name = request.getParameter("name");
		String email = request.getParameter("email");
		String phone = request.getParameter("phone");
	%>

	NAME => <%=name%><br> 
	EMAIL => <%=email%><br> 
	PHONE => <%=phone%><br>

	<%
		Class.forName("oracle.jdbc.OracleDriver");
		conn = DriverManager.getConnection(url, user, password);
		pstmt = conn.prepareStatement(INSERT);

		pstmt.setString(1, name);
		pstmt.setString(2, email);
		pstmt.setString(3, phone);
		// 적용하기
		int cnt = pstmt.executeUpdate();
		if (cnt != 0) {
			System.out.println("입력 성공");
			conn.commit();
		} else {
			System.out.println("입력 실패");
			conn.rollback();
		}
		// sql 객체 닫아 주기
		if (pstmt != null)
			pstmt.close();
		if (conn != null)
			conn.close();
	%>

	<%
		// 리스트 페이지로 갱신된다.
		response.sendRedirect("member_list.jsp");
	%>

</body>
</html>