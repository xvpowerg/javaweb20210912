<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<p><%=request.getAttribute("msg") %></p>
	<img src="images/<%=request.getAttribute("image")%>">
</body>
</html>