

import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


/**
 * Servlet implementation class save_info
 */
@WebServlet("/save_info")
public class save_info extends HttpServlet 
{
	private static final long serialVersionUID = 1L;
 
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException 
	{
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
		
		
		int count=1;
		try
		{
			// db connection
			Class.forName("oracle.jdbc.driver.OracleDriver");
			Connection conn = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","system","772250");
			
			// prepare statement
			PreparedStatement stmt = conn.prepareStatement("insert into user_info values (?,?,?,?,?,?,?,?,?)");
			
			stmt.setString(1, name);
			stmt.setString(2, contact);
			stmt.setString(3,email);
			stmt.setString(4, city);
			stmt.setString(5, pin);
			stmt.setString(6, state);
			stmt.setString(7, title); 
			stmt.setString(8,percent); 
			stmt.setString(9, year);
			
			 count = stmt.executeUpdate();
			
			//connection close
			conn.close();
 	
		}
		catch (Exception e)
		{
			e.printStackTrace();
		}
		// go to personal info page
		int code = count>0? 1:0;
		response.sendRedirect("personal_details.jsp?c="+code);
	}

}
