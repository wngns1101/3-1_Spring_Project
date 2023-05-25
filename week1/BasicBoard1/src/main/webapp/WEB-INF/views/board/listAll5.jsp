<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>
<%@ page session="false"%>

<%@include file="../include/header.jsp"%>

<html>
	<div>
		<h3><b><center>게시물 목록</center></b></h3>
	</div>
	<table>
		<tr>
			<th style="width: 50px">BNO</th>
			<th style="width: 300px">제목</th>
			<th style="width: 300px">글쓴이</th>
			<th style="width: 200px">등록시간</th>
			<th style="width: 50px">조회수</th>
		</tr>
		
		<c:forEach items="${list}" var="boardVO">
			<tr>
				<td>${boardVO.bno}</td>
				<td>
					<a href="/board/read?bno=${boardVO.bno}">${boardVO.title}</a>
				</td>
				<td>${boardVO.writer}</td>
				<td>
					<fmt:formatDate pattern="yyyy-MM-dd HH:mm" value = "${boardVO.regDate}"/>
				</td>
				<td>${boardVO.viewcnt}</td>
			</tr>
		</c:forEach>
	</table>
</html>

<%@include file="../include/footer.jsp"%>
