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
		 <h1> 1 of 4 pages </h1>
    <br>
    <hr>
        <%
        	String code = request.getParameter("c");
        	String msg = "";
        	String color = "";
        	if ( code != null)
        	{
        		switch (code)
        		{
        		case "0":
        		msg="sorry..";
        		color = "red";
        		break;
        		
        		case "1":
        			msg="success...";
        			color = "green";
        			break;
        		}
        	}
        %>
    <h3 style="color:<%= color %>"><%=msg %> </h3>
    <h2> Enter user details </h2>
    <form action="address.jsp">
        name <input type="text" name="name">
        <br> <br>
        contact <input type="text" name="contact">
        <br> <br>
        email <input type="text" name="email" id="">
        <br> <br>
        <input type="submit" name="submit" id="" value="next">
        
         </form>
    
        
        
        </div>
   
</body>
</html>