<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<script src="https://code.jquery.com/jquery-3.4.1.min.js"></script>
<script src="${pageContext.request.contextPath }/resources/js/login.js"></script>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<div>
<label>id : </label><input type="text" id="id"><br>
<label>password : </label><input type="password" id="pwd"><br>
<button onclick="generalUserLogin()">로그인</button>
</div>
</body>
</html>