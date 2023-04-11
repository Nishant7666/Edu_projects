import org.hibernate.Session;


import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class Main
{

	public static void main(String[] args) 
	{
		employee emp = new employee();
		
		emp.setId(1);
		emp.setName("cj");
		emp.setEmail("cj@san-andreas");
		emp.setContact("1222222");
		
		Configuration cfg = new Configuration();
		cfg.configure("hbm-cfg.xml");
		
		SessionFactory sf = cfg.buildSessionFactory();
		Session session=sf.openSession();
		
		session.beginTransaction();
		  session.save(emp);
		//session.update(emp);
		 // session.delete(emp);
//		
//		employee e = session.get(employee.class, 1);
//		
//		System.out.println("Id :" + e.getId());
//		System.out.println("Id :" + e.getContact());
//		System.out.println("Id :" + e.getEmail());
//		System.out.println("Id :" + e.getName());
		
		session.getTransaction().commit();
		
		session.close();
		sf.close();
		
		
	}

}
