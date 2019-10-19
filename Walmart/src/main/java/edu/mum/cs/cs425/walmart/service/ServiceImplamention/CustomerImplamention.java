package edu.mum.cs.cs425.walmart.service.ServiceImplamention;

import edu.mum.cs.cs425.walmart.model.Customer;
import edu.mum.cs.cs425.walmart.repository.RepositoryCustomer;
import edu.mum.cs.cs425.walmart.service.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CustomerImplamention implements CustomerService {

    @Autowired
    private RepositoryCustomer repositoryCustomer;

    @Override
    public List<Customer> getAllCustomers() {
        return repositoryCustomer.findAll();
    }

    @Override
    public Customer saveCustomer(Customer customer) {
        return repositoryCustomer.save(customer);
    }

    @Override
    public Customer getCustomerById(Long customerId) {
        return repositoryCustomer.findById(customerId).orElse(null);
    }

    @Override
    public void deleteCustomerById(Long customerId) {

    }
}
