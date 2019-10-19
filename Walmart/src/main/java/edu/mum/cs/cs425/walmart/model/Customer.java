package edu.mum.cs.cs425.walmart.model;

import org.springframework.format.annotation.DateTimeFormat;

import javax.persistence.*;
import javax.validation.constraints.NotBlank;
import java.time.LocalDate;
@Entity
@Table(name = "customer")
public class Customer {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long customerId;

    @NotBlank(message = "customer number is required")
    private String customerNumber;


    @NotBlank(message = "name is required")
    private String name;

    @NotBlank(message = "phone number is required ")
    private String contactPhoneNumber;

@DateTimeFormat(iso = DateTimeFormat.ISO.DATE)

   private LocalDate dateOfBirth;

    public Customer() {
    }

    public Customer(Long customerId, String customerNumber, String name, String contactPhoneNumber, LocalDate dateOfBirth) {
        this.customerId = customerId;
        this.customerNumber = customerNumber;
        this.name = name;
        this.contactPhoneNumber = contactPhoneNumber;
        this.dateOfBirth = dateOfBirth;
    }

    public Long getCustomerId() {
        return customerId;
    }

    public void setCustomerId(Long customerId) {
        this.customerId = customerId;
    }

    public String getCustomerNumber() {
        return customerNumber;
    }

    public void setCustomerNumber(String customerNumber) {
        this.customerNumber = customerNumber;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getContactPhoneNumber() {
        return contactPhoneNumber;
    }

    public void setContactPhoneNumber(String contactPhoneNumber) {
        this.contactPhoneNumber = contactPhoneNumber;
    }

    public LocalDate getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(LocalDate dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    @Override
    public String toString() {
        return "Customer{" +
                "customerId=" + customerId +
                ", customerNumber='" + customerNumber + '\'' +
                ", name='" + name + '\'' +
                ", contactPhoneNumber='" + contactPhoneNumber + '\'' +
                ", dateOfBirth=" + dateOfBirth +
                '}';
    }
}
