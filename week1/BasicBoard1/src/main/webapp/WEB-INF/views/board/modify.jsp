<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>

<%@include file="../include/header.jsp"%>
<html>
	<h3><b><center>게시물 수정</center></b></h3>
	<form role="form" method="post">
		<div>
			<label>게시물 번호</label>
			<input type="text" name="bno" value="${boardVO.bno}" readonly="readonly">
		</div>
		<div>
			<label>게시물 제목</label>
			<input type="text" name="title" value="${boardVO.title}">
		</div>
		<div>
			<label>게시물 내용</label>
			<textarea rows="5" name="content">${boardVO.content}</textarea>
		</div>
		<div>
			<label>작성자</label>
			<input type="text" name="writer" value="${boardVO.writer}">
		</div>
		<button> 저장 </button>
	</form>
		<a href="/board/listAll"><button>취소</button></a>
</html>

<%@include file="../include/footer.jsp"%>
