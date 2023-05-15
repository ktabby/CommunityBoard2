<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<script src="./resource/js/jquery-3.3.1.min.js"></script>
<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/js/bootstrap.bundle.min.js" integrity="sha384-ka7Sk0Gln4gmtz2MlQnikT1wXgYsOg+OMhuP+IlRH9sENBO0LRn5q+8nbTov4+1p" crossorigin="anonymous"></script>
<script src="./resource/js/member.js"></script>
<title>Insert title here</title>
</head>
<body>
	
	<div class="centerContent loginStyle">
		<form id="memberUpdateFrm" action="./setMemberUpdateOk" method="post">
		    <input type="hidden" id="seqMember" name="seqMember" value="${seqMember}">
		    <!-- header -->
		    <h1>글 수정 페이지</h1>
		    <!-- Board -->
		    <div class="form-label">
		        <label for="name" class="form-label">이름 :</label>
		        <input type="text" class="form-control" id="name" name="name" value="${memberVo.name}" readonly="readonly">
		    </div>
		    <div class="form-label">
		        <label for="id" class="form-label">아이디 :</label>
		        <input type="text" class="form-control" id="id" name="id" value="${sesMemId}" readonly="readonly">
		    </div>
		    <div class="form-label">
		        <label for="password" class="form-label">비밀번호 :</label>
		        <input type="text" class="form-control" id="password" name="password" value="${memberVo.password}" readonly="readonly"/>
		    </div>
		    <div class="form-label">
		        <label for="email" class="form-label">이메일 :</label>
		        <input type="text" class="form-control" name="email" id="email" value="${memberVo.email}">
		    </div>
		    <div class="form-label">
		        <label for="address" class="form-label">주소 :</label>
		        <textarea class="form-control" rows="10" name="address" id="address">${memberVo.address}</textarea>
		    </div>
		    <!-- footer -->
		    <button id="memberUpdateBtn" type="button">수정</button>
		    <button id="backBtn" type="button" onclick="history.back()">뒤로가기</button>
		</form>
	</div>
</body>
</html>