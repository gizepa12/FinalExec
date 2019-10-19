package edu.mum.cs.cs425.esupermarket.service;

import edu.mum.cs.cs425.esupermarket.model.Supplier;

import java.util.List;

public interface SupplierService {
    Supplier saveSupplier(Supplier supplier);
    List<Supplier> suppliers();
    Supplier getSupplierId (Long supplierId);
    void delete(Long supplierId);

}
