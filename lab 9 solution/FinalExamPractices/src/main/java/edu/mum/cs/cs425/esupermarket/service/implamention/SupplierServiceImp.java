package edu.mum.cs.cs425.esupermarket.service.implamention;

import edu.mum.cs.cs425.esupermarket.model.Supplier;
import edu.mum.cs.cs425.esupermarket.repository.SupplierRepository;
import edu.mum.cs.cs425.esupermarket.service.SupplierService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SupplierServiceImp implements SupplierService {

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
    public Supplier getSupplierId(Long supplierId) {
        return supplierRepository.findById(supplierId).orElse(null);
    }

    @Override
    public void delete(Long supplierId) {
        supplierRepository.deleteById(supplierId);

    }
}
