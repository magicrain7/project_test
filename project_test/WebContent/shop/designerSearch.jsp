<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<h3>회원조회</h3>
${error}
	<form action="${pageContext.request.contextPath}/designerSearch.do">
		<input type="hidden" name="search" value="search"> id : <input
			name="id">
		<button>검색</button>
	</form>
</body>
</html>