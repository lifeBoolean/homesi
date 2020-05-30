<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
	<meta charset="UTF-8">
	<title>Home</title>
	<script src="http://code.jquery.com/jquery-latest.js"></script>
	<script src="<c:url value="/resources/js/common.js" />"></script>
</head>
<body>

	<h1>
		Hello world!  
	</h1>
	
	<P>  The time on the server is ${serverTime}. </P>
	
	<a href="user/join">회원가입</a>
	<button type="button" id="btn1">alert창</button>
	<h3>깃 사용 테스트</h3>
	
</body>
</html>
