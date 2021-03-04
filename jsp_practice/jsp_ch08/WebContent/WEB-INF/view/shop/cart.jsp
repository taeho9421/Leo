<%@page import="org.comstudy21.ch08.shop.Product"%>
<%@page import="java.util.ArrayList"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
<h2>장바구니 페이지</h2>
<table border="1">
<thead>
	<tr>
		<th>제품번호</th>
		<th>제품명</th>
		<th>가격</th>
		<th>수량</th>
		<th>카트에서 제거</th>
	</tr>
</thead>
<tfoot>
	<tr>
		<th colspan="2">합계</th>
		<th>가격합</th>
		<th>수량합</th>
		<th>-</th>
	</tr>
</tfoot>
<tbody>
<%
if(session.getAttribute("cartList") == null) {
	out.println("<h3>장바구니 목록이 비어있습니다.</h3>");
} else {
	ArrayList<Product> pList = (ArrayList<Product>)session.getAttribute("cartList");
	for(int i=0; i<pList.size(); i++) {
		Product book = pList.get(i);
%>
	<tr>
		<td><%=book.getPno() %></td>
		<td><%=book.getPname() %></td>
		<td><%=book.getPrice() %></td>
		<td><%=book.getEa() %></td>
		<td><a href="cart_remove.shop?pno=<%=book.getPno() %>">삭제하기</a></td>
	</tr>
<%
	}// end of for
}// end of if
%>
</tbody>
</table>
<a href="list.shop">목록</a>
</body>
</html>