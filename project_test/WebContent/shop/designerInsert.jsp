<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<link rel="stylesheet"
	href="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/css/bootstrap.min.css"
	integrity="sha384-Gn5384xqQ1aoWXA+058RXPxPg6fy4IWvTNh0E263XmFcJlSAwiGgFAW/dAiS6JXm"
	crossorigin="anonymous">
<script src="https://code.jquery.com/jquery-3.2.1.slim.min.js"
	integrity="sha384-KJ3o2DKtIkvYIK3UENzmM7KCkRr/rE9/Qpg6aAZGJwFDMVNA/GpGFF93hXpG5KkN"
	crossorigin="anonymous"></script>
<script
	src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.12.9/umd/popper.min.js"
	integrity="sha384-ApNbgh9B+Y1QKtv3Rn7W3mgPxhU9K/ScQsAP7hUibX39j7fakFPskvXusvfa0b4Q"
	crossorigin="anonymous"></script>
<script
	src="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/js/bootstrap.min.js"
	integrity="sha384-JZR6Spejh4U02d8jOt6vLEHfe/JQGiRRSQQxSfFWpi1MquVdAyjUar5+76PVCmYl"
	crossorigin="anonymous"></script>
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

		<div><button>입력</button></div>
	</form>

</body>
</html>