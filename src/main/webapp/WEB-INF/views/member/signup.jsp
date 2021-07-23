<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>    
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap@4.6.0/dist/css/bootstrap.min.css">
<script src="https://code.jquery.com/jquery-3.6.0.js"></script>
<script
	src="https://cdn.jsdelivr.net/npm/bootstrap@4.6.0/dist/js/bootstrap.bundle.min.js"></script>

</head>
<body>

<div class="container p-3 col-12"
				style="margin-bottom: 200px; width: 40%; height: 30%; margin-top: 10%; border: 1px solid rgb(141, 137, 137); border-radius: 10px;">
				<form action="/member/signupProc" method="post">
				<h3>회원가입</h3>
					<div class="form-group">
						<label for="exampleInputEmail1">아이디</label> <input type="text"
							class="form-control" id="id" name="id"
							placeholder="아이디를 입력하세요" aria-describedby="emailHelp"> <small
							id="emailHelp" class="duplCheck form-text text-muted"></small>
					</div>
					<div class="form-group">
						<label for="exampleInputPassword1">비밀번호</label> <input
							type="password" class="form-control" id="pw" name="pw"
							placeholder="비밀번호를 입력하세요">
                        <label for="exampleInputPassword1">비밀번호 확인</label> <input
							type="password" class="form-control" id="pwCheck" 
							placeholder="비밀번호를 한번 더 입력하세요">
						<div id="pwCheck"></div>
					</div>
                    <div class="form-group">
						<label for="exampleInputEmail1">이름</label> <input type="text"
							class="form-control" id="name" name="name"
							placeholder="이름을 입력하세요"> 
					</div>
                    <div class="form-group">
						<label for="exampleInputEmail1">전화번호</label> <input type="text"
							class="form-control" id="phone" name="phone"
							placeholder="전화번호를 입력하세요"> 
					</div>
                    <div class="form-group">
						<label for="exampleInputEmail1">이메일</label> <input type="text"
							class="form-control" id="email" name="email"
							placeholder="이메일을 입력하세요">
					</div>
                    <div class="form-group">
						<label for="exampleInputEmail1">우편번호</label> <input type="text"
							class="form-control" id="zip" name="zipcode"
							placeholder="우편번호를 입력하세요">
					</div>
                    <div class="form-group">
						<label for="exampleInputEmail1">주소1</label> <input type="text"
							class="form-control" id="adr1" name="address1"
							placeholder="주소1을 입력하세요">
					</div>
                    <div class="form-group">
						<label for="exampleInputEmail1">주소2</label> <input type="text"
							class="form-control" id="adr2" name="address2"
							placeholder="주소2를 입력하세요">
					</div>
                    

					<button type="submit" class="btn btn-secondary">가입하기</button>
                    <button type="button" class="btn btn-secondary" id="goHome">홈으로</button>
				</form>

			</div>


</body>
</html>