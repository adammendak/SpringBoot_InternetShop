package src.main.java;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import src.main.java.pl.nauka.firstApp.repository.CustomerRepository;
import src.main.java.pl.nauka.firstApp.repository.HibernateCustomerRepositoryImpl;
import src.main.java.pl.nauka.firstApp.service.CustomerService;
import src.main.java.pl.nauka.firstApp.service.CustomerServiceImpl;

@Configuration
@ComponentScan({"src.main.java.pl.nauka"})
public class AppConfig {

//    @Bean(name="customerRepository")
//    public CustomerRepository getCustomerRepository() {
//        return new HibernateCustomerRepositoryImpl();
//    }

//    @Bean(name="customerService")
//    public CustomerService getCustomerService() {
//        CustomerServiceImpl service = new CustomerServiceImpl();
//        service.setCustomerRepository(getCustomerRepository());
//        return service;
//    }

}
