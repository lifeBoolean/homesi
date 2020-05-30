<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	
	<h2>리스트</h2>

	<table>
		<tr>
			<td>아이디</td>
			<td>이름</td>
			<td>이메일</td>
			<td>전화번호</td>
			<td>성별</td>
			<td>생년월일</td>
		</tr>
		<c:forEach items="${members}" var="member">
		<tr>
			<td>${member.userId}</td>
			<td>${member.userName}</td>
			<td>${member.email}</td>
			<td>${member.phone}</td>
			<td>${member.gender}</td>
			<td>${member.birthday}</td>
		</tr>		
		</c:forEach>
		
	</table>

</body>
</html>