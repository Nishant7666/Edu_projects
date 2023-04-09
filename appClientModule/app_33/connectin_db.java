package app_33;
import java.sql.Connection;
import java.sql.DriverManager;

public class   connectin_db 
{
	public static Connection getConnection()
	{
		Connection con = null;
		try
		{
			Class.forName("oracle.jdbc.driver.OracleDriver");
			 con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","system","772250");
			
		}
		catch (Exception e)
		{
			e.printStackTrace();
		}
		return con;
	}
}
