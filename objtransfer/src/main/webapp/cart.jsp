<%@page import="bean.product"%>
<%@page import="java.util.ArrayList"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<div class="div-1">
        <table>
            <thead>
                <tr>
                    <th>Name</th>
                    <th>Price</th>
                </tr>
            </thead>
       

        <tbody>
            <%
            ArrayList<product> list = (ArrayList<product>) session.getAttribute("cartlist");
                for(product p2 : list )
                {
            %>
            <tr>
                <td> <%= p2.getPname() %></td>
                <td> <%= p2.getPrice() %></td>
            </tr>
            <% } %>
        </tbody>
         </table>
    </div>
</body>
</html>