package src.main.java;

//import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import src.main.java.pl.nauka.firstApp.service.CustomerService;

public class Application {

	public static void main(String[] args) {

		ApplicationContext appConf = new AnnotationConfigApplicationContext(AppConfig.class);
			
		CustomerService service = appConf.getBean("customerService", CustomerService.class);
		
		System.out.println(service.findAll().get(0).getFirstname());
	}

}
