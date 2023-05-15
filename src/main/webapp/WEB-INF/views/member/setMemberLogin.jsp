<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<script src="./resource/js/jquery-3.3.1.min.js"></script>
<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/js/bootstrap.bundle.min.js" integrity="sha384-ka7Sk0Gln4gmtz2MlQnikT1wXgYsOg+OMhuP+IlRH9sENBO0LRn5q+8nbTov4+1p" crossorigin="anonymous"></script>
<script src="./resource/js/member.js"></script>

<!-- 부트스트랩 -->
<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-1BmE4kWBq78iYhFldvKuhfTAU6auU8tT94WrHftjDbrCEXSU1oBoqyl2QvZ6jIW3" crossorigin="anonymous">
<link rel="stylesheet" href="./resource/css/style.css">
<title>Insert title here</title>
</head>
<body>
	
		<div class="centerContent loginStyle">
			<h1>로그인 페이지</h1>
			<form id="loginFrm" method="POST" accept-charset="utf-8">
				

				<div class="form-label">
					<label for="joinId" class="form-label">아이디 :</label>
					<input type="text"  class="form-control" id="joinId" name="id">
					
				</div>
				<div class="form-label">
					<label for="joinPwd" class="form-label">비밀번호 :</label>
					<input type="password" class="form-control" id="joinPwd" name="password">
					
				</div>
				
				
				<button id="loginBtn">로그인</button>
				<button id="joinBtn" type="button" onclick="location.href='/member'">회원가입</button>
			</form>
		</div>
</body>
</html>