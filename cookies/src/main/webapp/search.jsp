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
	// to get all the cookies and display
	Cookie cks[] = request.getCookies();
	String lastsearch = "";
	String lastvisit = "";
	
	if(cks != null) 
	{
		for(Cookie ch : cks)
			
		{
			if("time&date".equals(ch.getName()))
			{
				lastvisit = ch.getValue();
			}
			if("search".equals(ch.getName()))
			{
				lastsearch = ch.getValue();
			}
		}
	}
%>
	<div>
	<form action="cookies_search" align="center">
	
	<h4> your last visit : <%= lastvisit %></h4>
	<h5> your previous search : <%= lastsearch %> </h5>
	
	<h3> search engine</h3>
	<br>
	<br>
	search for <input type="text" name="search">
	<input type="submit" values="search">
	</form>
	</div>
</body>
</html>