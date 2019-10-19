package edu.mum.cs.cs425.eproduct.model;



import javax.persistence.*;
import javax.validation.constraints.Digits;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import java.util.List;


@Entity
    @Table(name = "suppliers")
    public class Supplier {
        @Id
        @GeneratedValue(strategy = GenerationType.IDENTITY)
        private Integer supplierId;

        @NotBlank(message = "* NAME is required")
        private String supplierName;

        @NotNull(message = "* Supplier Title is required")
        @Digits(integer = 9,fraction = 0)
        private Integer supplierNumber;


        private String contactPhoneNumber;


        @OneToMany(mappedBy = "supplier",cascade = CascadeType.ALL,fetch = FetchType.LAZY)

        private List<Product> productList ;

        public Supplier() {
        }

        public Supplier(Integer supplierId, String supplierName, Integer supplierNumber,
                        String contactPhoneNumber) {
            this.supplierId = supplierId;
            this.supplierName = supplierName;
            this.supplierNumber = supplierNumber;
            this.contactPhoneNumber = contactPhoneNumber;

        }

        public Integer getSupplierId() {
            return supplierId;
        }

        public void setSupplierId(Integer supplierId) {
            this.supplierId = supplierId;
        }

        public String getSupplierName() {
            return supplierName;
        }

        public void setSupplierName(String supplierName) {
            this.supplierName = supplierName;
        }

        public Integer getSupplierNumber() {
            return supplierNumber;
        }

        public void setSupplierNumber(Integer supplierNumber) {
            this.supplierNumber = supplierNumber;
        }

        public String getContactPhoneNumber() {
            return contactPhoneNumber;
        }

        public void setContactPhoneNumber(String contactPhoneNumber) {
            this.contactPhoneNumber = contactPhoneNumber;
        }

    public List<Product> getProductList() {
        return productList;
    }

    public void setProductList(List<Product> productList) {
        this.productList = productList;
    }

    @Override
        public String toString() {
            return "Supplier{" +
                    "supplierId=" + supplierId +
                    ", supplierName='" + supplierName + '\'' +
                    ", supplierNumber='" + supplierNumber + '\'' +
                    ", contactPhoneNumber='" + contactPhoneNumber + '\'' +

                    '}';
        }
    }


