<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>Insert title here</title>
</head>
<body>
	<h2>글쓰기</h2>
	<form action="write" method="post">
		<table>
			<tr>
				<th>제목</th>
				<td><input type="text" name="title" value="제목"></td>
			</tr>
			<tr>
				<th>글쓴이</th>
				<td><input type="text" name="writer" value="글쓴이"></td>
			</tr>
			<tr>
				<th>내용</th>
				<td><textarea cols="50" rows="10" name="content">게시판에 등록한 글을 작성해주세요.</textarea></td>
			</tr>
			<tr>
				<td colspan="2">
					<input type="submit" value="저장하기">
				</td>
			</tr>
		</table>
	</form>
</body>
</html>