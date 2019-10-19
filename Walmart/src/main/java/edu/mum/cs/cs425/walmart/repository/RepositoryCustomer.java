package edu.mum.cs.cs425.walmart.repository;

import edu.mum.cs.cs425.walmart.model.Customer;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RepositoryCustomer extends JpaRepository<Customer,Long> {
}
