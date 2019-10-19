package edu.mum.cs.cs425.eproduct.service;


import edu.mum.cs.cs425.eproduct.model.Supplier;

import java.util.List;

public interface IsupplierService {
    Supplier saveSupplier(Supplier supplier);
    List<Supplier> suppliers();
     Supplier getSupplierId (Integer supplierId);
    void delete(Integer supplierId);


}
