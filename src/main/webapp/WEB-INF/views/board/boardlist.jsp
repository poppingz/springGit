<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
    
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<script src="https://code.jquery.com/jquery-3.6.0.js"></script>

</head>
<body>
	   <table border=1 align="center">
	      <tr>
	    	  <th colspan=5>List
	     </tr>
	      <tr>
	         <td> No.
	         <td> Title
	         <td> Writer
	         <td> View
	         <td> Write_Date
	      </tr>
	   <c:forEach var="i" items="${list}">
	         <tr>
	            <td>${i.board_seq}   
	            <td>${i.title}   
	            <td>${i.id}
	            <td>${i.view_count}
	            <td>${i.write_date}
	         </tr>
	         
	         
	      </c:forEach>
	   </table>
</body>
</html>