

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class req_res
 */
@WebServlet("/req_res")
public class req_res extends HttpServlet
{
	private static final long serialVersionUID = 1L;

    /**
     * Default constructor. 
     */
    public req_res()
    {
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#service(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void service(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException
	{
		 
		res.setContentType ("text/html");
		PrintWriter out = res.getWriter(); 
		
		
		
	    out.print("<form  action = 'res_req_display' method='POST'>");
		out.print("user name : <input type = 'text'  name = 'uname'>");
		out.print("<br>");
		out.print("password : <input type = 'password' name = 'pass'>");
		out.print("<br>");
		out.print("<button type = 'submit' name 'submit'> Login </button>");
		out.print("<br>");
		out.print("</form>");
			
	}

}
