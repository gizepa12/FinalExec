package come.finalexam.wallymartsupperstore.service;

import come.finalexam.wallymartsupperstore.model.Customer;

import java.util.List;

public interface CustomerService {
    List<Customer> findAll();
    void save(Customer customer);
}
