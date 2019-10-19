package edu.mum.cs.cs425.eproduct.model;


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

    @NotBlank(message = "message is required")
    private String productName;

    @NotNull(message = "message is required")
    @Digits(integer = 9,fraction = 0)
    private Long productNumber;

    @NotNull(message = "message is required")
    @Digits(integer = 9,fraction = 2)
    private Double unitPrice;

    @NotNull(message = "message is required")
    @Digits(integer = 9,fraction = 0)
    private Integer quantityInStock;

    @DateTimeFormat(iso = DateTimeFormat.ISO.DATE)
    private LocalDate dateProduct;


    @ManyToOne
    @JoinColumn(name = "supplierId", nullable = false)
    private Supplier supplier;


    public Product(@NotBlank(message = "message is required") String productName, @NotNull(message = "message is required") @Digits(integer = 9, fraction = 0) Long productNumber, @NotNull(message = "message is required") @Digits(integer = 9, fraction = 2) Double unitPrice, @NotNull(message = "message is required") @Digits(integer = 9, fraction = 0) Integer quantityInStock, @NotNull(message = "message is required") LocalDate dateProduct) {
        this.productName = productName;
        this.productNumber = productNumber;
        this.unitPrice = unitPrice;
        this.quantityInStock = quantityInStock;
        this.dateProduct = dateProduct;
    }

    public Product() {
    }

    public Long getProductId() {
        return productId;
    }

    public void setProductId(Long productId) {
        this.productId = productId;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public Long getProductNumber() {
        return productNumber;
    }

    public void setProductNumber(Long productNumber) {
        this.productNumber = productNumber;
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

    public LocalDate getDateProduct() {
        return dateProduct;
    }

    public void setDateProduct(LocalDate dateProduct) {
        this.dateProduct = dateProduct;
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
                ", productName='" + productName + '\'' +
                ", productNumber=" + productNumber +
                ", unitPrice=" + unitPrice +
                ", quantityInStock=" + quantityInStock +
                ", dateProduct=" + dateProduct +
                '}';
    }
}
