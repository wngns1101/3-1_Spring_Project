<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>

<%@include file="../include/header.jsp"%>

<html>
	<div>
		<h3><b><center>게시물 열람</center></b></h3>
	</div>
	
	<div>
		<label> 제 목 </label>
		<input type="text" value = "${boardVO.title}" readonly="readonly">
	</div>
	
	<div>
		<label> 내 용 </label>
		<textArea rows="5" readonly="readonly">${boardVO.content}</textArea>
	</div>
	
	<div>
		<label> 글쓴이 </label>
		<input type="text" value = "${boardVO.writer}" readonly="readonly">
	</div>
	<div>
	<a href="/board/modify?bno=${boardVO.bno}">
		<button>수정</button>
	</a>
	<a href="/board/remove?bno=${boardVO.bno}">
		<button>삭제</button>
	</a>
	<a href="/board/listAll">
		<button>목록보기</button>
	</a>
</div>
</html>

<%@include file="../include/footer.jsp"%>
