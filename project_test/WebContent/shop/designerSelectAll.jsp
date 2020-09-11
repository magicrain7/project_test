<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h3>디자이너 목록</h3>
	<table class="designer" border="1">
		<tr>
			<th>아이디</th>
			<th>폰번호</th>
			<th>email</th>
			<th>휴일</th>
			<th>근무시작</th>
			<th>근무종료</th>
		</tr>
		<c:forEach items="${list}" var="designer">
			<tr>
				<td>${designer.id }</td>
				<td>${designer.phone }</td>
				<td>${designer.email }</td>
				<td>${designer.holiday }</td>
				<td>${designer.workstart }</td>
				<td>${designer.workend }</td>
			</tr>
		</c:forEach>
	</table>
</body>
</html>