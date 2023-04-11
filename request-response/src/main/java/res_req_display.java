

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class res_req_display
 */
@WebServlet("/res_req_display")
public class res_req_display extends HttpServlet 
{
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#service(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void service(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException 
	{
		 res.setContentType ("text/html");
		 PrintWriter out = res.getWriter();
		 
		 String name = req.getParameter("uname");
		 String pass = req.getParameter("pass");
		 
		 if("admin".equals(name) && "123".equals(pass))
		 {
			 out.print("succeeded");
			 out.print("welcome");
		 }
		 else
		 {
			 out.print("sorry invalid things");
			 out.print(" <h1> <a href='req_res'> go back </a>  go back </h1>");
		 }
			 	 
	}

}
