<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<script src="./resource/js/jquery-3.3.1.min.js"></script>
<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/js/bootstrap.bundle.min.js" integrity="sha384-ka7Sk0Gln4gmtz2MlQnikT1wXgYsOg+OMhuP+IlRH9sENBO0LRn5q+8nbTov4+1p" crossorigin="anonymous"></script>
<script src="https://cdnjs.cloudflare.com/ajax/libs/jquery/3.6.0/jquery.min.js" integrity="sha512-894YE6QWD5I59HgZOGReFYm4dnWc1Qt5NtvYSaNcOP+u1T9qYdvdihz0PPSiiqn/+/3e7Jo4EaG7TubfWGUrMQ==" crossorigin="anonymous" referrerpolicy="no-referrer"></script>
<script src="./resource/js/board.js"></script>
<script src="./resource/js/member.js"></script>

<!-- 부트스트랩 -->
<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-1BmE4kWBq78iYhFldvKuhfTAU6auU8tT94WrHftjDbrCEXSU1oBoqyl2QvZ6jIW3" crossorigin="anonymous">
<link rel="stylesheet" href="./resource/css/style.css">
<title>Insert title here</title>
</head>
<body>
	<div class="centerContent loginStyle">
		<form id="updateFrm" action="./updateOk" method="post">
		    <input type="hidden" id="seqBoard" name="seqBoard" value="${boardDto.seqBoard}">
		    <!-- header -->
		    <h1>글 수정 페이지</h1>
		    <!-- Board -->
		    <div class="form-label">
		        <label for="id" class="form-label">아이디 :</label>
		        <input type="text" class="form-control" id="id" name="id" value="${sesMemId}" readonly="readonly">
		    </div>
		    <div class="form-label">
		        <label for="title" class="form-label">제목 :</label>
		        <input type="text" class="form-control" id="title" name="title" value="${boardDto.title}"/>
		    </div>
		    <div class="form-label">
		        <label for="contents" class="form-label">내용 :</label>
		        <textarea class="form-control" rows="10" name="contents" id="contents">${boardDto.contents}</textarea>
		    </div>
		    <!-- footer -->
		    <button id="updateBtn" type="button">수정</button>
		    <button id="backBtn" type="button" onclick="history.back()">뒤로가기</button>
		</form>
	</div>
</body>
</html>