<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <title>My JSP '1.jsp' starting page</title>
    
	<meta http-equiv="pragma" content="no-cache">
	<meta http-equiv="cache-control" content="no-cache">
	<meta http-equiv="expires" content="0">    
	<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
	<meta http-equiv="description" content="This is my page">
	<!--
	<link rel="stylesheet" type="text/css" href="styles.css">
	-->

  </head>
  
  <body>
  	<form action="test">
  		姓名：<input type="text" name="name"/><br/>
  		年龄：<input type="text" name="age"/><br/>
  		兴趣：<input type="checkbox" name="hobby" value="football"/>足球
             <input type="checkbox" name="hobby" value="basketball"/>篮球
             <input type="checkbox" name="hobby" value="ppball"/>乒乓球
  		<input type="submit" value="提交">
  	</form>
  </body>
</html>
