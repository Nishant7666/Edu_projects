

import java.io.IOException;
import java.util.HashMap;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * Servlet implementation class httpsession_ex
 */
@WebServlet("/httpsession_ex")
public class httpsession_ex extends HttpServlet
{
	private static final long serialVersionUID = 1L;

	 HashMap<String, String> users = new HashMap<String,String>();
	 
	 public httpsession_ex()
	 {
		 users.put("Admin","admin123");
		 users.put("abc","abc123");
		 users.put("xyz","xyz123");
		 users.put("lmn","lmn123");
	 }
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException
	{
		String name = request.getParameter("uname");
		String pass = request.getParameter("upass");
		
		if(users.containsKey(name))
		{
			String value = users.get(name);
			if(value.equals(pass))
			{
				// create a session
				HttpSession session = request.getSession();
				
				
				session.setAttribute("un", name);
				response.sendRedirect("new_home.jsp");
			}
			else
			{
				response.sendRedirect("login.jsp?c=-1");
			}
		}
		else
		{
			response.sendRedirect("login.jsp?c=-1");
		}
				
		 
	}

}
