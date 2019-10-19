package edu.mum.cs.cs425.esupermarket.model;

import javax.persistence.*;
import javax.validation.constraints.Digits;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import java.util.List;


@Entity
@Table(name = "suppliers")
public class Supplier {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long supplierId;

    @NotNull(message = "supplier Number is required")
    @Digits(integer = 9, fraction = 0)
    private Long supplierNumber;

    @NotBlank(message = "Product name is required")
    private String supplierName;

    @NotBlank(message = "contact number required")
    private String contactPhoneNumber;

    @OneToMany(mappedBy = "supplier", cascade = CascadeType.ALL, fetch = FetchType.LAZY)

    private List<Product> productList;

    public Supplier() {
    }

    public Supplier(Long supplierNumber, String supplierName, String contactPhoneNumber) {
        this.supplierNumber = supplierNumber;
        this.supplierName = supplierName;
        this.contactPhoneNumber = contactPhoneNumber;
    }

    public Long getSupplierId() {
        return supplierId;
    }

    public void setSupplierId(Long supplierId) {
        this.supplierId = supplierId;
    }

    public Long getSupplierNumber() {
        return supplierNumber;
    }

    public void setSupplierNumber(Long supplierNumber) {
        this.supplierNumber = supplierNumber;
    }

    public String getSupplierName() {
        return supplierName;
    }

    public void setSupplierName(String supplierName) {
        this.supplierName = supplierName;
    }

    public String getContactPhoneNumber() {
        return contactPhoneNumber;
    }

    public void setContactPhoneNumber(String contactPhoneNumber) {
        this.contactPhoneNumber = contactPhoneNumber;
    }

    @Override
    public String toString() {
        return "Supplier{" +
                "supplierId=" + supplierId +
                ", supplierNumber=" + supplierNumber +
                ", supplierName='" + supplierName + '\'' +
                ", contactPhoneNumber='" + contactPhoneNumber + '\'' +
                '}';
    }
}
