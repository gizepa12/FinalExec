package edu.mum.cs.cs425.eproduct.repository;

import edu.mum.cs.cs425.eproduct.model.Supplier;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SupplierRepository extends JpaRepository<Supplier,Integer> {

}
