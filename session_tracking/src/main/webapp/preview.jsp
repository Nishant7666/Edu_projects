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
	
	// address details
	String city = request.getParameter("city");
	String pin = request.getParameter("pin");
	String state = request.getParameter("state");
	
	// education details
	String title = request.getParameter("title");
	String percent = request.getParameter("percent");
	String year = request.getParameter("year");
	
	//modify url
	String url ="save_info?name="+name+"&contact="+contact+"&email="+email
	+"&city="+city+"&pin="+pin+"&state="+state+"&title="+title+"&percent="
	+percent+"&year="+year;
%>
	
	 <h1> 4 of 4 pages </h1>
     <br>
     <h2> preview </h2>
     <br>
     <form>

        <h1> personal details </h1>
        <br> <br>
        <h3> name : <%= name %></h3>
        <h3> contact : <%= contact %></h3>
        <h3> email : <%= email %></h3>
        <br> <br>
        <h1> address details </h1>
        <br> <br>
        <h3> city : <%= city %></h3>
        <h3> pin : <%= pin %></h3>
        <h3> state : <%= state %></h3>
        <br> <br>
        <h1> educational details </h1>
        <br> <br>
        <h3> title : <%= title %></h3>
        <h3> percent : <%= percent %></h3>
        <h3> year : <%= year %></h3>

		<a href="<%= url %>"> enter to next </a>
     </form>
     </div>
</body>
</html>