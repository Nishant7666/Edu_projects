<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<div align="center">
	<%
	// personal details
	String name = request.getParameter("name");
	String contact = request.getParameter("contact");
	String email = request.getParameter("email");
	%>
	<h1> 2 of 4 pages </h1>
    <br>
    <h2> Enter Address details </h2>
    <form action="edu.jsp">
    
        city <input type="text" name="city">
        <br> <br>
        pin <input type="text" name="pin">
        <br> <br>
        state <input type="text" name="state" id="">
        <br> <br>

        <input type="submit" name="submit" id="" value="next">
        
        
        <input type="hidden" name="name" value="<%=name%>">
        <input type="hidden" name="contact"   value="<%=contact%>">
        <input type="hidden" name="email"  value="<%=email%>">
    </form>
    </div>
</body>
</html>