package edu.mum.cs.cs425.esupermarket.model;

import org.springframework.format.annotation.DateTimeFormat;

import javax.persistence.*;
import javax.validation.constraints.Digits;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import java.time.LocalDate;

@Entity
@Table(name = "products")
public class Product {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long productId;

    @NotNull(message = "message is required")
    @Digits(integer = 9,fraction = 0)
    private Long productNumber;

    @NotBlank(message = "message is required")
    private String productName;

    @NotNull(message = "message is required")
    @Digits(integer = 9,fraction = 2)
    private Double unitPrice;

    @NotNull(message = "message ir required")
    @Digits(integer = 9,fraction = 0)
    private Integer quantityInStock;

    @DateTimeFormat(iso = DateTimeFormat.ISO.DATE)
    private LocalDate productDate;

    @ManyToOne
    @JoinColumn(name = "supplierId",nullable = false)
    private Supplier supplier;

    public Product() {
    }

    public Product(Long productId, Long productNumber, String productName, Double unitPrice, Integer quantityInStock, LocalDate productDate) {
        this.productId = productId;
        this.productNumber = productNumber;
        this.productName = productName;
        this.unitPrice = unitPrice;
        this.quantityInStock = quantityInStock;
        this.productDate = productDate;
    }

    public Long getProductId() {
        return productId;
    }

    public void setProductId(Long productId) {
        this.productId = productId;
    }

    public Long getProductNumber() {
        return productNumber;
    }

    public void setProductNumber(Long productNumber) {
        this.productNumber = productNumber;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public Double getUnitPrice() {
        return unitPrice;
    }

    public void setUnitPrice(Double unitPrice) {
        this.unitPrice = unitPrice;
    }

    public Integer getQuantityInStock() {
        return quantityInStock;
    }

    public void setQuantityInStock(Integer quantityInStock) {
        this.quantityInStock = quantityInStock;
    }

    public LocalDate getProductDate() {
        return productDate;
    }

    public void setProductDate(LocalDate productDate) {
        this.productDate = productDate;
    }

    public Supplier getSupplier() {
        return supplier;
    }

    public void setSupplier(Supplier supplier) {
        this.supplier = supplier;
    }

    @Override
    public String toString() {
        return "Product{" +
                "productId=" + productId +
                ", productNumber=" + productNumber +
                ", productName='" + productName + '\'' +
                ", unitPrice=" + unitPrice +
                ", quantityInStock=" + quantityInStock +
                ", productDate=" + productDate +
                '}';
    }
}
