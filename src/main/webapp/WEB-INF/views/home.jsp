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
		$("#toBoardWrite").on("click",function(){
			location.href="/board/boardWrite";
		})
	})
</script>
</head>
<body>
	<button type="button" id="toBoardWrite">이동</button>
</body>
</html>