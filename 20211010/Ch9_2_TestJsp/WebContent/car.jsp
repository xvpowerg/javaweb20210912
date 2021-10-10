<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@page  import="java.util.ArrayList"%>    
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>購物車</title>
</head>
<body>
<% 
ArrayList<String> carList = (ArrayList)session.getAttribute("carList");
%>
<ol>
<% for(String item : carList){  %>
 <li><%=item%>  </li>
<%} %>
</ol>

<div></div><a href="index.html">HOME</a></div>
</body>
</html>