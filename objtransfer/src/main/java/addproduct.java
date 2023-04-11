

import java.io.IOException;
import java.util.ArrayList;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import javax.websocket.Session;

import bean.product;

 
@WebServlet("/add-to-cart")
public class addproduct extends HttpServlet 
{
	private static final long serialVersionUID = 1L;
       
     
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException
	{
		 String id = request.getParameter("pid");
		 String name = request.getParameter("name");
		 String price = request.getParameter("price");
		 
		 product p1 = new product();
		 
		 p1.setPid(Integer.parseInt(id));
		 p1.setPname(name);
		 p1.setPrice(Double.parseDouble(price));
		 
		 HttpSession session = request.getSession();
		 
		 ArrayList<product> list = (ArrayList<product>) session.getAttribute("cartlist") ;
		 
		 if(list == null)
		 {
			 list = new ArrayList<product>();
			 list.add(p1);
		 }
		 else
		 {
			 list.add(p1);
		 }
		 
		 session.setAttribute("cartlist", list);
		 response.sendRedirect("product.jsp");
	}

}
