<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>input_form.jsp</title>
</head>
<body>

<h2>사용자 정보 입력 페이지</h2>
<form action="input.do" method="POST">
<table>
   <tr>
      <th>아이디</th>
      <td><input type="text" name="id" value="kim"></td>
   </tr>
   <tr>
      <th>비밀번호</th>
      <td><input type="password" name="password" value="1234"></td>
   </tr>
   <tr>
      <th>성명</th>
      <td><input type="text" name="name" value="김길동"></td>
   </tr>
   <tr>
      <th>Role</th>
      <td><input type="text" name="role" value="User"></td>
   </tr>
   <tr>
      <th><input type="submit" value="저장"></th>
   </tr>
</table>
</form>
</body>
</html>