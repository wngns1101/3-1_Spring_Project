<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page import="java.util.Random" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<%
	Random rand = new Random();
	int[] arr = new int[6];

	for(int i=0; i<6; i++) {
	    arr[i] = rand.nextInt(45)+1;
	    for(int j=0; j<i; j++) {
	        if(arr[i] == arr[j]) {
            	i--;
	        }
	    }
	}

	for(int i=0; i<6; i++) {
    	out.print(i+1 + "번째 숫자: " + arr[i] + "<br>");
	}
%>
</body>
</html>