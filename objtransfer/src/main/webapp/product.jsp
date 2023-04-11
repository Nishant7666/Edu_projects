<%@page import="bean.product"%>
<%@page import="java.util.ArrayList"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Product page</title> 
</head>
<style>
     
    div
    {
        text-align: center;
        margin: 4px;
        background-color: rgb(177, 208, 228);
        border-radius: 7px;
        padding: 5px;
       
        border: 1px solid black;
    }
    body
    {
        background-color: cadetblue;
    }
</style>
<body>
	 
	 <%
	  ArrayList<product> list = (ArrayList<product>) session.getAttribute("cartlist");
	  
	  Integer total = 0;
	  
	  if(list == null)
	  {
		  total = 0;
	  }
	  else
	  {
		  
		  total = list.size();
	  }
	 %>
        <div>

        <h1> Product cart </h1>
        <h4> total items <%= total %></h4>
        <h2> <a href="cart.jsp"> show cart </a> </h2>
        <!-- list == null ? 0 : list.size(); -->

        <div>
            <h2> name : smart phone </h2>
            <h2> price : 32000 </h2>
            <h2><a href="add-to-cart?pid=1&name=smart phone &price=32000"> Add to cart </a></h2>
        </div>

        <div>
            <h2> name : smart  tv </h2>
            <h2> price : 52000 </h2>
            <h2><a href="add-to-cart?pid=2&name=smart tv &price=22000"> Add to cart </a></h2>
        </div>

        <div>
            <h2> name : smart watch </h2>
            <h2> price : 2000 </h2>
            <h2><a href="add-to-cart?pid=3&name=smart watch &price=42000"> Add to cart </a></h2>
        </div>

        <div>
            <h2> name : bluetooth speaker </h2>
            <h2> price : 34000 </h2>
            <h2><a href="add-to-cart?pid=4&name=smart phone &price=132000"> Add to cart </a></h2>
        </div>

         <div>
            <h2> name : bike </h2>
            <h2> price : 1,24000 </h2>
            <h2><a href="add-to-cart?pid=4&name=bike &price=342000"> Add to cart </a></h2>
        </div>
        
        </div>

</body>
</html>