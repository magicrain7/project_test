<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<h3> 회원가입 </h3>
<form method="post" name="frm"
		id="frm" action="customerInsert">
	<div>
		<label for="id">id</label>
		<input type="text" id="id" name="id"> 
	</div>
	
		<div>
		<label for="pw">pw</label>
		<input type="password" id="pw" name="pw"> 
	</div>
		<div>
		<label for="mail">Email</label>
		<input type="text" id="mail" name="mail">
	</div>
	
	<div>
		<label for="name">name</label>
		<input type="text" id="name" name="name">
	</div>
	
	<div>
		<label for="phone">phone</label>
		<input type="text" id="phone" name="phone">
	</div>
	
	<div>
		<label>생년월일</label>
		<input type="date" id="date">
	</div>
	
	<div>
	<label>성별</label>
		<input type="radio" id="male" name="gender" value="male">
		<label for="male" class="label">남</label>
		<input type="radio" id="female" name="gender" value="female">
		<label for="female" class="label">여</label>
	</div>
	
	<div>
		<label>address</label>
		<input type="text" id="address" name="address">
	</div>
	
	<button >가입하기</button>
	<button type="reset">초기화</button>

</form>
</body>
</html>