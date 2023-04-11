

import java.io.IOException;
import java.io.PrintWriter;
import java.time.LocalDateTime;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class cookies_search
 */
@WebServlet("/cookies_search")
public class cookies_search extends HttpServlet
{
	 
	 
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException
	{
		response.setContentType("text/html");
		PrintWriter pr = response.getWriter();
		
		String data = request.getParameter("search");
		String value = data.replaceAll(" ", "_");
		
		// create cookies objects
		
		Cookie ck1 = new Cookie("search",value);
		Cookie ck2 = new Cookie("time&date",LocalDateTime.now().toString());
		
		// set cookies age
		
		ck1.setMaxAge(60*60);
		ck2.setMaxAge(60*60);
		
		// send cookies in form of response
		
		response.addCookie(ck1);
		response.addCookie(ck2);
		
		//print output
		
		pr.print("<h1> hello user, </h1>");
		pr.print("<h1> your searched for: "+data+"</h1>");
		
	}

}
