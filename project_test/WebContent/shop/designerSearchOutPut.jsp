<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<h1>조회</h1>
	<div>전화번호 : ${designer.phone }</div>
	<div>email : ${designer.email } </div>
	<div> 휴무 : ${designer.holiday }</div>
	<div> 근무시작 : ${designer.workstart }</div>
	<div> 끝 :  ${designer.workend }</div>
	<div>
		<button type="button" onclick="location.href='shop/index.jsp'">메인페이지로</button>
	</div>
</body>
</html>