<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8" import = "java.util.*" %>
<%
	int rand = new Random().nextInt(3);
	String[] str1 ={"大吉","吉","凶"};
%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<p><%= str1[rand] %>です</p>
</body>
</html>