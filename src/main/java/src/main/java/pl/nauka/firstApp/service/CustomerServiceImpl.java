package src.main.java.pl.nauka.firstApp.service;

import src.main.java.pl.nauka.firstApp.model.Customer;
import src.main.java.pl.nauka.firstApp.repository.CustomerRepository;
import src.main.java.pl.nauka.firstApp.repository.HibernateCustomerRepositoryImpl;

import java.util.List;

public class CustomerServiceImpl implements CustomerService {

	private CustomerRepository customerRepository = new HibernateCustomerRepositoryImpl();
	
	/* (non-Javadoc)
	 * @see com.pluralsight.service.CustomerService#findAll()
	 */
	@Override
	public List<Customer> findAll() {
		return customerRepository.findAll();
	}
}
