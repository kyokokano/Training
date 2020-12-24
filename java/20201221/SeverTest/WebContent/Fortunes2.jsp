<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8" import ="java.util.*" %>
    <%
    	Random rand = new Random();
    	String[] ans = {"大吉","中吉","吉","凶"};
    	}
    %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<p>
		<%
		ans[rand.nextInt(3)]
		%>
	</p>
</body>
</html>