package src.main.java.pl.nauka.firstApp.repository;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Repository;
import src.main.java.pl.nauka.firstApp.model.Customer;

import java.util.ArrayList;
import java.util.List;

@Repository("customerRepository")
public class HibernateCustomerRepositoryImpl implements CustomerRepository {

	@Value("${dbUserName}")
	private String dbUserName;


	@Override
	public List<Customer> findAll() {
		List<Customer> customers = new ArrayList<>();
		System.out.println(dbUserName);

		Customer customer = new Customer();
		
		customer.setFirstname("Adam");
		customer.setLastname("Mendak");
		
		customers.add(customer);
		
		return customers;
	}
}
