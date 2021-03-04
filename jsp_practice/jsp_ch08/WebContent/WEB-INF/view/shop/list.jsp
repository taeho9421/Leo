<%@page import="org.comstudy21.ch08.shop.Product"%>
<%@page import="java.util.ArrayList"%>
<%@page import="com.sun.xml.internal.bind.v2.runtime.unmarshaller.XsiNilLoader.Array"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
<script src="http://code.jquery.com/jquery.js"></script>
<script>
$(function() {
	
});

function addProduct(i, pno) {
	var eaVal = $("#ea"+i).val();
	var url = "cart.shop?pno="+pno+"&ea="+eaVal;
	location.href = url;
	// Ajax로 변경 해 보세요...
}
</script>
</head>
<body>
<h2>상품 목록 페이지</h2>
<table border="1">
<tr>
	<th>제품번호</th>
	<th>제품명</th>
	<th>가격</th>
	<th>수량</th>
	<th>카트에 추가</th>
</tr>
<%
ArrayList<Product> pList = (ArrayList<Product>)request.getAttribute("product_list");
if(pList.size() == 0) {
	out.println("<h3>상품 목록이 비어있습니다.</h3>");
} else {
	for(int i=0; i<pList.size(); i++) {
		Product book = pList.get(i);
%>
	<tr class="productRow">
		<td><%=book.getPno() %></td>
		<td><%=book.getPname() %></td>
		<td><%=book.getPrice() %></td>
		<td>
			<input id="ea<%=i%>" type="number" value="1" min="1" max="5">
		</td>
		<%-- <td><a href="cart.shop?pno=<%=book.getPno() %>">추가하기</a></td> --%>
		<td><a href="javascript:addProduct(<%=i%>, <%=book.getPno() %>)">추가하기</a></td>
	</tr>
<%
	}// end of for
}// end of if
%>
</table>
<a href="cart.shop">카트보기</a>
</body>
</html>