<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>

<%@include file="../include/header.jsp"%>

<b><center> 게시물 등록 </center></b>

<form role="form" method="post">
	<div>
		<label>제목</label>
		<input type="text" name="title">
	</div>
	<div>
		<label>내용</label>
		<textarea name="content" row="5"></textarea>
	</div>
	<div>
		<label>글쓴이</label>
		<input type="text" name="writer">
	</div>
	<div>
		<button type="submit">저장</button>
	</div>
</form>

<%@include file="../include/footer.jsp"%>
