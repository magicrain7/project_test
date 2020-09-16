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
	${error	 }
	<form action="${pageContext.request.contextPath }/designerSearch.do"></form>
	<input type="hidden" name="delete" value="delete"> id:
	<input name="id">
	<button>검색</button>
	<div>전화번호 : ${designer.phone }</div>
	<div>email : ${designer.email }</div>
	<div>휴무 : ${designer.holiday }</div>
	<div>근무시작 : ${designer.workstart }</div>
	<div>끝 : ${designer.workend }</div>
	<hr>

	<form action="${pageContext.request.contextPath}/designerDelete.do">
		<input type="hidden" name="id" value="${designerVO.id}">
		<button>삭제</button>
	</form>
</body>
</html>