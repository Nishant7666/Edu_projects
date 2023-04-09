package app_33;
import java.sql.Connection;

public class app_33 
{

	public static void main(String[] args) 
	{
		 try
		 {
			 Connection conn = connectin_db.getConnection();
			 
		 }
		 catch(Exception e)
		 {
			 e.printStackTrace();
		 }
	}
	
	 

}
