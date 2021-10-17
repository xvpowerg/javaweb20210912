<%@page import="tw.com.bean.Item"%>
<%@ page language="java" contentType="text/html; charset=BIG5"
    pageEncoding="BIG5"%>
 <%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>  
<!DOCTYPE html>
<html>
<head>
<meta charset="BIG5">
<title>Insert title here</title>
</head>
<body>
	<%
	 Item item =  (Item)request.getAttribute("item");
	
	%>
	
	
	<p>Item Name <%=item.getName()%></p>
	<p>Item Price<%=item.getPrice()%></p>
	
	<p>Item Name ${item.name}</p>
	<p>Item Price ${item.price}</p>
	
	<p>user name: ${user.name}</p>
	<p>user age: ${user.age}</p>
	<ol>
		<c:forEach  var="myuser" items="${userList}">
		<li>${myuser.name}</li>
		</c:forEach>
	</ol>
	
	<p>${userMap.User2 }</p>
	<p>${userMap["User4 AA"]}</p>
	<p>${empty test_empty ?"無資料":test_empty["User3"]}  </p>
	
</body>
</html>