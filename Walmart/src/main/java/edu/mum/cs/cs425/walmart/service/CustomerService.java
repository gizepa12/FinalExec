package edu.mum.cs.cs425.walmart.service;

import edu.mum.cs.cs425.walmart.model.Customer;

import java.util.List;

public interface CustomerService {
    List<Customer> getAllCustomers();
    Customer saveCustomer(Customer customer);
    Customer getCustomerById(Long customerId);
    void deleteCustomerById(Long customerId);

}
