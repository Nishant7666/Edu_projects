<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<%
	String username = (String) session.getAttribute("un");
%>
	 <div align="right">
            <h3> User, <%= username %></h3>
            <br>
            <h3> <a href=""> Logout </a> </h3>
        </div>
        <hr>
        <div align="center">
            <h1> welcome user , to home page....</h1>
        </div>
</body>
</html>