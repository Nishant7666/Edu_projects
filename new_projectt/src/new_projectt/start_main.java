package new_projectt;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;



public class start_main {

	public static void main(String[] args)
	{
       dto_entity en = new dto_entity();
		 
		 
		 en.setTitle("kkkk442");
		 en.setCreate_task("no_1");
		 en.setStatus("in_progress");
		 
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
