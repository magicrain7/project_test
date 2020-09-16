<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<style>
th { width: 80px; background-color: #ddd; }
th:first-child { border-radius: 10px 0 0 0; }
th:last-child { border-radius: 0 10px 0 0; }
tr { border-top: 1px solid black; border-bottom: 1px solid black; }
tr:nth-child(odd) { background-color: #cce4ff; }
tr:nth-child(even) { background-color: #e6f1ff; }
tr:hover { background-color: #ffc5c2; cursor: pointer; }
td { padding: 3px; }

.button {
  background-color: gray;
  border: none;
  color: white;
  padding: 15px 30px;
  text-align: center;
  text-decoration: none;
  display: inline-block;
  font-size: 16px;
  margin: 4px 2px;
  cursor: pointer;
border-radius: 5px;
}
.button:hover {
    background-color: blue;
}
</style>
</head>
<body>
	<h1>디자이너 목록</h1>
	<table class="designer" >
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

	<div><button class ="button" type="button" onclick="location.href='shop/index.jsp'">메인페이지로</button></div>
</body>
</html>