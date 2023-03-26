<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page session="false" contentType="text/html; charset=UTF-8"%>
<html>
<head>
	<title>Home</title>
</head>
<style>
	h1
	{
		text-align: center;
	}
</style>
<body>
<h3>Hello World!</h3> <br>
<h1>구구단</h1>
<table border = "1">
<%
	for (int i = 1 ; i < 10; i++){
%>
<tr>
	<%
		for (int j=1; j< 10; j++){
	%>
		<td><%=j%>*<%=i%> = <%= j*i %></td>
	<%
		}
	%>
</tr>	
<%
	}
%>
</table>
<%-- <%= sum %> --%>
</body>
</html>
