<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@page import ="java.util.ArrayList"%>    
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<H3>以下產品已加入購物車</H3>	
	<ol>
	<%ArrayList<String> selectedList = (ArrayList)request.getAttribute("selectedItemList"); %>
	<%for(String selectItem : selectedList){ %>
	<li><%=selectItem %></li>	
	<%} %>
	</ol>
	<div><a href="index.html">HOME</a></div>
</body>
</html>