<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Home</title>
<script src="https://code.jquery.com/jquery-3.6.0.js"></script>
<script>
	$(function(){
		$("#signup").on("click",function(){
			location.href="/member/signup";
		})
		$("#toBoardWrite").on("click",function(){
			location.href="/board/boardWrite";
		})
	})
</script>
</head>
<body>
	<c:choose>
		<c:when test="${loginID == null }">
			<form action="/member/loginProc" method="post">
				<table border=1 align=center>
					<tr>
						<th>Login Box
					</tr>
					<tr>
						<td><input type=text placeholder="ID를 입력하세요." name=id>
					</tr>
					<tr>
						<td><input type=password placeholder="PW를 입력하세요." name=pw>
					</tr>
					<tr>
						<td align=center>
						<button id="login">Login</button>
						<button type="button" id="signup">SignUp</button>
					</tr>
				</table>
			</form>	
		</c:when>
		<c:otherwise>
			${loginID } 님 안녕하세요.<button type="button" id="toBoardWrite">이동</button>
		</c:otherwise>
	</c:choose>
</body>
</html>