$(document).ready(function () {
		$("#loginBtn").on("click", function () {
			
			$.ajax({
				url: "./loginCheck",
				type: "POST",
				data: $("#loginFrm").serialize(),
				dataType: "text",
				async: false,
				success: function (result) {
					if (result == "Y") {
						alert("로그인 성공");
						$("#loginFrm").attr("action", "./getBoardList").submit();
					} else {
						alert("아이디와 비밀번호가 맞지 않습니다.");
					}
				},
				error: function (request, status, error) {
					alert("code:" + request.status);
					alert("message:" + request.responseText);
					alert("error:" + error);
				}
			});
		});
		
		$("#btnSubmit").on("click", function(){
				var ans = confirm("가입하시겠습니까?");
				console.log($("#infoFrm").serialize());
				$.ajax({
					url: "./setCreateMemberInfo",
					type: "POST",
					async: false,
					data: $("#infoFrm").serialize(),
					success: function(result){
						if(ans){
							if(result=="200"){
								alert("성공적으로 회원가입되었습니다.");
								$("#btnSubmit").attr("action", "location.href='/login'");
							}else{
								alert("회원가입에 실패하였습니다.");
							}
						}
					},
				    error:function(request, status, error){
				        alert("code : " + request.status);
						alert("message : " + request.responseText);
						alert("error : " + error);       
					}
				});
			});
		
		$("#memberUpdateBtn").click(function(){
			var email = $("#email").val();
			var address = $("#address").val();
			
			if(email.trim() == '') {
				alert('이메일을 입력해 주세요');
				return;
			}
			var update = confirm("수정하시겠습니까?");
			if(update == true) {
				$("#memberUpdateFrm").submit();
			} else {
				return;
			}
		});
		
		$("#delBtn").click(function(){
			var delCon = confirm("삭제하시겠습니까?");
			if(delCon == true){
				$("#memberDeleteOk").submit();
			}else{
				return;
			}
			
		});
		
});

function goMmeberUpdate(seqMember) {
	location.href="/setMemberUpdate?seqMember=" + seqMember;
}


	
