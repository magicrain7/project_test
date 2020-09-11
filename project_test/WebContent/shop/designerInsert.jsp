<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h3>디자이너 등록</h3>
	<form method="post" id="frm" name="frm"
		action="${pageContext.request.contextPath}/designerInsert.do">
		<div>
			<label>id</label> <input type="text" id="id" name="id">
		</div>

		<div>
			<label>phone</label> <input type="text" id="phone" name="phone">
		</div>

		<div>
			<label>email</label> <input type="text" id="email" name="email">
		</div>

		<div>
			<label>password</label> <input type="password" id="pw" name="pw">
		</div>

		<div>
			<label>휴무일</label> <input type="text" id="holiday" name="holiday">
		</div>

		<div>
			<labeL>근무시작</labeL> <input type="text" id="workstart"
				name="workstart">
		</div>

		<div>
			<label>근무종료</label> <input type="text" id="workend" name="workend">
		</div>

		<button>입력</button>
	</form>

</body>
</html>