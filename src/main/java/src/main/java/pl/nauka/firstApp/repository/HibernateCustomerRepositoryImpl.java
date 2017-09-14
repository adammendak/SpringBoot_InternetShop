package src.main.java.pl.nauka.firstApp.repository;

import org.springframework.stereotype.Repository;
import src.main.java.pl.nauka.firstApp.model.Customer;

import java.util.ArrayList;
import java.util.List;

@Repository("customerRepository")
public class HibernateCustomerRepositoryImpl implements CustomerRepository {

	@Override
	public List<Customer> findAll() {
		List<Customer> customers = new ArrayList<>();
		
		Customer customer = new Customer();
		
		customer.setFirstname("Adam");
		customer.setLastname("Mendak");
		
		customers.add(customer);
		
		return customers;
	}
}
