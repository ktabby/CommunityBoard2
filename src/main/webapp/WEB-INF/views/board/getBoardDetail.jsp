<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt" %>  
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
<script src="./resource/js/jquery-3.3.1.min.js"></script>
<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/js/bootstrap.bundle.min.js" integrity="sha384-ka7Sk0Gln4gmtz2MlQnikT1wXgYsOg+OMhuP+IlRH9sENBO0LRn5q+8nbTov4+1p" crossorigin="anonymous"></script>
<script src="https://cdnjs.cloudflare.com/ajax/libs/jquery/3.6.0/jquery.min.js" integrity="sha512-894YE6QWD5I59HgZOGReFYm4dnWc1Qt5NtvYSaNcOP+u1T9qYdvdihz0PPSiiqn/+/3e7Jo4EaG7TubfWGUrMQ==" crossorigin="anonymous" referrerpolicy="no-referrer"></script>
<script src="./resource/js/board.js"></script>
<script src="./resource/js/member.js"></script>

<!-- 부트스트랩 -->
<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-1BmE4kWBq78iYhFldvKuhfTAU6auU8tT94WrHftjDbrCEXSU1oBoqyl2QvZ6jIW3" crossorigin="anonymous">
<link rel="stylesheet" href="./resource/css/style.css">
<meta charset="UTF-8">
<title>boardDetail</title>
</head>
<body>
<!-- 헤더 -->
<%@ include file="/WEB-INF/views/include/header.jsp" %>
<!-- 본문 -->
<div class="detailAll">
<form action="./deleteOk" method="post" name="deleteOk" id="deleteOk">
	<input type="hidden" id="seqBoard" name=seqBoard value="${boardDto.seqBoard}">
	<h1 style="text-align: center;">상세 페이지</h1>
	<table class="table table-striped-columns">
		<tr>
			<th>제 목 :</th>
			<td>${boardDto.title}</td>
		</tr>
		
		<tr>
		
			<th>작성자 :</th>
			<td>${boardDto.id}</td>
		</tr>
		
		<tr>
			<th>내 용 :</th>
			<td>${boardDto.contents}</td>
		</tr>
		
	</table>
	<div style="text-align: right;">
		<button class="btn btn-outline-dark" id="backBtn" type="button" onclick="history.back()">뒤로가기</button>
		<c:choose>
			<c:when test="${sesMemId eq boardDto.id}">
					<button type="button" class="btn btn-outline-dark" id="uBtn" onclick="goUpdate(${boardDto.seqBoard})">수정하기</button>
					<button type="button" class="btn btn-outline-dark" id="delBtn" name="delBtn">삭제하기</button>
			</c:when>
		</c:choose>
	</div>
</form>
</div>
<!-- 푸터 -->
<%@ include file="/WEB-INF/views/include/footer.jsp" %>
</body>
</html>