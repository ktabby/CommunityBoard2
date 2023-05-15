<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<meta charset="UTF-8">
<script src="./resource/js/jquery-3.3.1.min.js"></script>
<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/js/bootstrap.bundle.min.js" integrity="sha384-ka7Sk0Gln4gmtz2MlQnikT1wXgYsOg+OMhuP+IlRH9sENBO0LRn5q+8nbTov4+1p" crossorigin="anonymous"></script>
<script src="./resource/js/member.js"></script>
<title>Insert title here</title>
</head>
<body>
<div class="all">
<form action="./setMemberDelete" method="post" name="memberDeleteOk" id="memberDeleteOk">
<input type="hidden" id="seqMember" name="seqMember" value="${seqMember}">
<table>
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
<button type="button" id="upBtn" onclick="goMmeberUpdate(${seqMember})">수정하기</button>
<button type="button" id="delBtn">삭제하기</button>
</form>
</div>
</body>
</html>