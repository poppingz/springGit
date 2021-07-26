<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>회원가입</title>
<script src="https://code.jquery.com/jquery-3.6.0.js"></script>
<script>
	$(function(){
		$("#duplCheck").on("click",function(){
			$.ajax({
				url:"/member/duplCheck",
				data:{id:$("#id").val()}
			}).done(function(resp){
				if(resp == "1"){
					$("#message").text("이미 사용중인 ID 입니다.");
				}else{
					$("#message").text("사용할 수 있는 ID 입니다.");
				}
			})
		})
	})
</script>
</head>
<body>
	<form action="/member/signupProc" method="post">
		아이디 <input type=text id="id" name=id>
			 <button type="button" id="duplCheck">중복검사</button><br>
			 <div id="message"></div>
		패스워드 <input type=password name=pw><br>
		이름 <input type=text name=name><br>
		<button>가입하기</button>
	</form>
</body>
</html>