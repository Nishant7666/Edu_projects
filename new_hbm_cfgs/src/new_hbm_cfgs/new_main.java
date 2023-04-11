package new_hbm_cfgs;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class new_main
{

	public static void main(String[] args)
	{
		 students st = new students();
		 
		 st.setId(1);
		 st.setName("harish");
		 st.setEmail("@harish.gmail");
		 st.setContact(12232);
		 st.setAge(15);
		 st.setStd(7);
		 
		  
		 // configuration object and setting xml file into config usging its obj
		 Configuration cf = new Configuration();
		 cf.configure("new_xml.xml");
		 
		 //create sessionfactory obj and use openSession();
		  
		 SessionFactory sf = cf.buildSessionFactory();
		 Session session = sf.openSession();
		 
		 session.beginTransaction();
		 session.save(st);
		// session.update(st);
		// session.delete(st);
		 
		 session.close();
		 sf.close();
	}

}
