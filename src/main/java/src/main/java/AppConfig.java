package src.main.java;

import org.springframework.context.annotation.*;
import org.springframework.context.support.PropertySourcesPlaceholderConfigurer;
import src.main.java.pl.nauka.firstApp.repository.CustomerRepository;
import src.main.java.pl.nauka.firstApp.repository.HibernateCustomerRepositoryImpl;
import src.main.java.pl.nauka.firstApp.service.CustomerService;
import src.main.java.pl.nauka.firstApp.service.CustomerServiceImpl;

@Configuration
@ComponentScan({"src.main.java.pl.nauka"})
@PropertySource("app.properties")
public class AppConfig {

    @Bean
    public static PropertySourcesPlaceholderConfigurer getPropertySourcesPlaceholderConfigurer() {
        return new PropertySourcesPlaceholderConfigurer();
    }

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
