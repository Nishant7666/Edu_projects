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
       //personal details
	String name = request.getParameter("name");
	String contact = request.getParameter("contact");
	String email = request.getParameter("email");
	
		//address details
	String city = request.getParameter("city");
	String pin = request.getParameter("pin");
	String state = request.getParameter("state");
	
	%>
	<h1> 3 of 4 pages </h1>
     <br> <br>
     <h2> Enter education details </h2>
     <br> <br>
     <form action="preview.jsp">

        title <input type="text" name="title" id="">
        <br> <br>
        percent <input type="text" name="percent" id="">
        <br> <br>
        year <input type="text" name="year" id="">
			 <br> <br>
        <input type="submit" name="submit" id="" value="next">
        
         <!-- personal details -->
        <input type="hidden" name="name" value= "<%=name%>">
        <input type="hidden" name="contact"  value= "<%=contact %>">
        <input type="hidden" name="email"  value= "<%=email %>">
        
         <!-- address details -->
        <input type="hidden" name="city" value="<%=city %>">
        <input type="hidden" name="pin"  value="<%= pin %>">
        <input type="hidden" name="state"  value= "<%=state%>">
     </form>
     </div>
</body>
</html>