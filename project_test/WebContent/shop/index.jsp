<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
	
<!DOCTYPE html>
<html lang="en">
<head>
<title>main</title>
<meta charset="utf-8">
<meta name="viewport" content="width=device-width, initial-scale=1">
<style>
* {
  box-sizing: border-box;
  font-family: Arial, Helvetica, sans-serif;
}

body {
  margin: 0;
  font-family: Arial, Helvetica, sans-serif;
}

/* Style the top navigation bar */
.topnav {
  overflow: hidden;
  background-color: #333;
   text-align: center;
}

/* Style the topnav links */
.topnav a {
font-size: 16;
  float: left;
  display: block;
  color: #f2f2f2;
  text-align: center;
  padding: 14px 16px;
  text-decoration: none;
}

</style>
</head>
<body>

<div class="topnav">
  <a href="${pageContext.request.contextPath}/designerInsertForm.do">회원가입</a>
  <a href="${pageContext.request.contextPath}/designerSelectAll.do">조회</a>
  <a href="#">수정</a>
  <a href="${pageContext.request.contextPath}/designerDelete.do">삭제</a>
</div>


<!-- <div class="content">
  <h2></h2>

</div> -->


</body>
</html>
