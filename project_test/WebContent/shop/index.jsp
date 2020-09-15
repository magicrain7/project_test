<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="en">
<head>
<title>CSS Template</title>
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
  float: left;

  display: block;
  color: #f2f2f2;
  text-align: center;
  padding: 14px 16px;
  text-decoration: none;
}

/* Change color on hover */
.topnav a:hover {
  background-color: #ddd;
  color: black;
}

/* Style the content */
.content {
  background-color: #ddd;
  padding: 10px;
  height: 200px; /* Should be removed. Only for demonstration */
}

/* Style the footer */

</style>
</head>
<body>

<div class="topnav">
  <a href="<%=application.getContextPath() %>/designerInsert.do">회원가입</a>
  <a href="<%=application.getContextPath() %>/designerList.do">조회</a>
  <a href="#">수정</a>
  <a href="#">삭제</a>
</div>

<!-- <div class="content">
  <h2></h2>

</div> -->


</body>
</html>
