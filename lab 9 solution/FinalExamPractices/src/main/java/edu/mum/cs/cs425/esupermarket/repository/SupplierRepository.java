package edu.mum.cs.cs425.esupermarket.repository;

import edu.mum.cs.cs425.esupermarket.model.Supplier;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SupplierRepository extends JpaRepository <Supplier,Long> {
}
