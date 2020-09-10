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
<h3>전체회원</h3>
<table id = "customer" border="1">
	<tr>
		<th>id</th>
		<th>email</th>
		<th>name</th>
		<th>phone</th>
		<th>birth</th>
		<th>gender</th>
		<th>address</th>
	</tr>
	<c:forEach items="${list}" var="customer">
		<tr>
			<td></td>
			<td></td>
			<td></td>
			<td></td>
			<td></td>
			<td></td>
			<td></td>
		</tr>
	</c:forEach>
	
</table>
</body>
</html>