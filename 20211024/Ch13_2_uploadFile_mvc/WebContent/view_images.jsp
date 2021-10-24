<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>  
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>顯示圖片</title>
</head>
<body>
	<c:forEach  var="image" items="${imageList}">
		<div><img width="30%" height="30%" alt="${image}" src="/myimages/${image}"></div>  
		</c:forEach>
</body>
</html>