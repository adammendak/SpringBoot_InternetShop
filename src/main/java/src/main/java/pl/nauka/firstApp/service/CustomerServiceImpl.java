package src.main.java.pl.nauka.firstApp.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Service;
import src.main.java.pl.nauka.firstApp.model.Customer;
import src.main.java.pl.nauka.firstApp.repository.CustomerRepository;
import src.main.java.pl.nauka.firstApp.repository.HibernateCustomerRepositoryImpl;

import java.util.List;

@Service("customerService")
@Scope("prototype")
public class CustomerServiceImpl implements CustomerService {


	private CustomerRepository customerRepository;

	public CustomerServiceImpl(CustomerRepository customerRepository) {
		this.customerRepository = customerRepository;
	}

//	@Autowired
	public void setCustomerRepository(CustomerRepository customerRepository) {
		this.customerRepository = customerRepository;
	}

	/* (non-Javadoc)
             * @see com.pluralsight.service.CustomerService#findAll()
             */
	@Override

	public List<Customer> findAll() {
		return customerRepository.findAll();
	}
}
