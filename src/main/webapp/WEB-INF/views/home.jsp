<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Home</title>
<script src="https://code.jquery.com/jquery-3.6.0.js"></script>
<script>
	$(function() {
		$("#logout").on("click", function() {
			location.href = "/member/logout";
		})
		$("#memberOut").on("click", function() {
			location.href = "/member/memberOut";
		})
	})
</script>
<style>
	.wrapper{margin:40px 120px 0px 120px; text-align:center;}
	.img>img{width:100% height:100%}
    .title{margin:30px 0px 60px 0px;}
	.menu{width:800px; height:150px; overflow:hidden;  display: flex; margin:auto;}
	.menu>div{ height:70px; width:200px; border:1px solid #ddd; margin: auto; line-height: 60px;}
	.menu>div:hover{background-color: #ddd;}
	a{text-decoration: none; color: black; display: block;  width:100%; height:100%;}
</style>
</head>
<body>
<a href="modifyForm">d</a>
	<c:choose>
		<c:when test="${loginID==null }">

		</c:when>
		<c:otherwise>
			<div class=wrapper>
				<div class=img>
					<img src="/img/user.png">
				</div>
				<div class="title">${loginID }님</div>
				<div class="menu">
					<div>
						<a href="#">게시판</a>
					</div>
					<div>
						<a href="/member/logout">로그아웃</a>
					</div>
					<div>
						<a href="/member/memberOut">회원탈퇴</a>
					</div>
				</div>

			</div>
		</c:otherwise>

	</c:choose>
</body>
</html>