<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<script src="./resource/js/jquery-3.3.1.min.js"></script>
<script src="https://cdnjs.cloudflare.com/ajax/libs/jquery/3.6.0/jquery.min.js" integrity="sha512-894YE6QWD5I59HgZOGReFYm4dnWc1Qt5NtvYSaNcOP+u1T9qYdvdihz0PPSiiqn/+/3e7Jo4EaG7TubfWGUrMQ==" crossorigin="anonymous" referrerpolicy="no-referrer"></script>
<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/js/bootstrap.bundle.min.js" integrity="sha384-ka7Sk0Gln4gmtz2MlQnikT1wXgYsOg+OMhuP+IlRH9sENBO0LRn5q+8nbTov4+1p" crossorigin="anonymous"></script>
<script src="./resource/js/member.js"></script>

<!-- 부트스트랩 -->
<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-1BmE4kWBq78iYhFldvKuhfTAU6auU8tT94WrHftjDbrCEXSU1oBoqyl2QvZ6jIW3" crossorigin="anonymous">
<link rel="stylesheet" href="./resource/css/style.css">
<title>Insert title here</title>
</head>
<body>
<!-- 헤더 -->
<%@ include file="/WEB-INF/views/include/header.jsp" %>
<!-- 본문 -->
<div class="detailAll">
<form action="./setMemberDelete" method="post" name="memberDeleteOk" id="memberDeleteOk">
<input type="hidden" id="seqMember" name="seqMember" value="${seqMember}">
<h1 style="text-align: center;">나의 정보</h1>
<table class="table table-striped-columns">
	<tr>
		<th>이 름:</th>
		<td>${memberVo.name}</td>
	</tr>
	
	<tr>
		<th>i d:</th>
		<td>${memberVo.id}</td>
	</tr>
	
	<tr>
		<th>이메일:</th>
		<td>${memberVo.email}</td>
	</tr>
	
	<tr>
		<th>주 소:</th>
		<td>${memberVo.address}</td>
	</tr>
</table>
<div style="text-align: right;">
	<button id="backBtn" class="btn btn-outline-dark" type="button" onclick="history.back()">뒤로가기</button>
	<button type="button" class="btn btn-outline-dark" id="upBtn" onclick="goMmeberUpdate(${seqMember})">수정하기</button>
	<button type="button" class="btn btn-outline-dark" id="delBtn">삭제하기</button>
</div>
<br>
</form>
</div>
<!-- 푸터 -->
<%@ include file="/WEB-INF/views/include/footer.jsp" %>
</body>
</html>