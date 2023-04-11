import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.SprngCfg.SprngCfg;
import com.Studnt.Studnt;

/**
 * @author nisha
 *
 */
public class Main 
{

	public static void main(String[] args) 
	{
		 ApplicationContext ctx = new AnnotationConfigApplicationContext(SprngCfg.class);
		 Studnt stud = ctx.getBean(Studnt.class);
		 System.out.println(stud.getAdd());
		 System.out.println(stud.getEdu());
	}

}
