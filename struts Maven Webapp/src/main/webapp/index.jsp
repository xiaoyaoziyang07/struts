<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%@ taglib uri="/struts-tags" prefix="s" %>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    
    <title>My JSP 'index.jsp' starting page</title>
    
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
  <s:form action="first.action" namespace="/">
  <s:fielderror fieldName="nameError"></s:fielderror>
  	用户名：<s:textfield name="name"/><br/>
  	<s:fielderror fieldName="ageError"/>
  	年龄：<s:textfield name="age"/><br/>
  	<s:fielderror fieldName="passwordError"/>
  	密码：<s:password name="password"/><br/>
  	<s:submit/>
  </s:form>
  </body>
</html>
