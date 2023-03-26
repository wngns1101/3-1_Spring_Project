<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page session="false" contentType="text/html; charset=UTF-8"%>
<html>
<head>
	<title>Home</title>
</head>
<body>

<%
	for (int i=2; i<=1000; i++){
		boolean result = true;
		for (int j = 2; j<i; j++){
			if (i % j == 0){
				result = false;
				break;
			}
		}
		if (result == true){
			out.println(i + "<br>");
		}
	}
%>

</body>
</html>
