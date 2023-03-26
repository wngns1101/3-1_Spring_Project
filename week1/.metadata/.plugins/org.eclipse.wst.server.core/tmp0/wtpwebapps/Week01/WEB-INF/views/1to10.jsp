<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page session="false" contentType="text/html; charset=UTF-8"%>
<html>
<head>
	<title>Home</title>
</head>
<body>
<h1>
	Hello world!  
</h1>

<%
	int sum = 0;
	for (int i=1; i<=10; i++){
		sum += i;
	}
%>
	<p>1부터 10까지의 합: <%=sum %></p>
</body>
</html>
