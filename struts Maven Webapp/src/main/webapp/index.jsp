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
  <s:form action="first.action">
  <s:fielderror fieldName="nameError" errorPosition="bottom"/>
  	<s:textfield name="name" label="用户名"/><br/>
  	<s:fielderror fieldName="ageError"/>
  	<s:textfield name="age" label="年龄"/><br/>
  	<s:fielderror fieldName="passwordError"/>
  	<s:password name="password" label="密码"/><br/>
  	<s:submit/>
  </s:form>
  <a href="<s:url action="index" namespace="config-browser" />">Launch the configuration browser</a>
  <a href="ajax/first" >dianji</a>
  </body>
</html>
