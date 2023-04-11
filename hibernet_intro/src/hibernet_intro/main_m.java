package hibernet_intro;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;


public class main_m 
{

	public static void main(String[] args)
	{
		 dto_entity en = new dto_entity();
		 
		 
		 en.setName("newkeys");
		 en.setPrice(9000);
		 en.setQuantity(2);
		 
		 Configuration cfg = new Configuration();
		 cfg.configure("new_xml.xml");
		 
		 SessionFactory sf = cfg.buildSessionFactory();
		 Session ss = sf.openSession();
		 
		 ss.beginTransaction();
		 
		 ss.save(en);
		 
		 ss.getTransaction().commit();
		 ss.close();
		 
		 sf.close();

	}

}
