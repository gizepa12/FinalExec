package edu.mum.cs.cs425.eproduct.service.impl;

import edu.mum.cs.cs425.eproduct.model.Supplier;
import edu.mum.cs.cs425.eproduct.repository.SupplierRepository;
import edu.mum.cs.cs425.eproduct.service.IsupplierService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SupplierServiceImpl implements IsupplierService {

@Autowired
private SupplierRepository supplierRepository;

    @Override
    public Supplier saveSupplier(Supplier supplier) {
        return supplierRepository.save(supplier);
    }

    @Override
    public List<Supplier> suppliers() {
        return supplierRepository.findAll();
    }

    @Override
    public Supplier getSupplierId(Integer supplierId) {
        return supplierRepository.findById(supplierId).orElse(null);
    }

    @Override
    public void delete(Integer supplierId) {
    supplierRepository.deleteById(supplierId);
    }
}
