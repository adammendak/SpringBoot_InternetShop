package src.main.java.pl.nauka.firstApp.repository;

import src.main.java.pl.nauka.firstApp.model.Customer;

import java.util.List;

public interface CustomerRepository {

        List<Customer> findAll();

}
