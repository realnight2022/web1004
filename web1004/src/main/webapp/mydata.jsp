<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>MyData page</title>
</head>
<body>
<jsp:useBean  id="data1" class="beans.MyData"  scope="session"></jsp:useBean>
<% 
     data1.setValue1(7);
     data1.setValue2(9);
%>
MyData Value1 :<jsp:getProperty property="value1" name="data1"/><p>
MyData Value2 : <jsp:getProperty property="value2" name="data1"/>
</body>
</html>