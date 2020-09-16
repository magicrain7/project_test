<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.1.3/css/bootstrap.min.css">
<title>Insert title here</title>
<style>
input, select {
	width: 50%;
	padding: 12px 20px;
	margin: 8px 0;
	display: inline-block;
	border: 1px solid #ccc;
	border-radius: 4px;
	box-sizing: border-box;
}
input[type=text]:focus {
	background-color: lightblue;
	border: 3px solid #555;
}
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
	<div class="frmtag">
		<h3>디자이너 등록</h3>
		<form method="post" id="frm" name="frm"
			action="${pageContext.request.contextPath}/designerInsert.do">

			<label>id</label> <input type="text" id="id" name="id"><br>
			<label>phone</label> <input type="text" id="phone" name="phone"><br>
			<label>email</label> <input type="text" id="email" name="email"><br>
			<label>password</label> <input type="password" id="pw" name="pw"><br>
			<label>휴무일</label> <input type="text" id="holiday" name="holiday"><br>
			<labeL>근무시작</labeL> <input type="text" id="workstart"
				name="workstart"><br> <label>근무종료</label> <input
				type="text" id="workend" name="workend"><br>

			<button class ="button">입력</button>
			<button class ="button" type="button" onclick="location.href='shop/index.jsp'">뒤로가기</button>

		</form>
	</div>
</body>
</html>