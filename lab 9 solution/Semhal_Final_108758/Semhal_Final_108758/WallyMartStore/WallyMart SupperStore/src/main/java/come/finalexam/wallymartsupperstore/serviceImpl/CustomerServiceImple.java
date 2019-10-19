package come.finalexam.wallymartsupperstore.serviceImpl;

import come.finalexam.wallymartsupperstore.model.Customer;
import come.finalexam.wallymartsupperstore.repository.CustomerRepository;
import come.finalexam.wallymartsupperstore.service.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class CustomerServiceImple implements CustomerService {
    @Autowired
    CustomerRepository  customerRepository;
    @Override
    public List<Customer> findAll() {
        return customerRepository.findAll();
    }

    @Override
    public void save(Customer customer) {
        customerRepository.save(customer);
    }
}
