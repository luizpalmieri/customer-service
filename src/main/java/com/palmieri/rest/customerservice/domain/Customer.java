package com.palmieri.rest.customerservice.domain;

import java.io.Serializable;
import java.time.LocalDate;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Table(name="CUSTOMER")
@Entity
public class Customer implements Serializable{

    private static final long serialVersionUID = 2806421523585360625L;

    @Id
    @GeneratedValue
    @Column(name="CUSTOMERID",updatable = false)
    private Integer customerId;

    @Column(name="NAME")
    private String customerName;

    @Column(name="DATEOFBIRTH" ,nullable=true)
    private LocalDate dateOfBirth;

    @Column(name="PHONENUMBER")
    private String phoneNumber;


    public Integer getCustomerId() {
        return customerId;
    }

    public void setCustomerId(Integer customerId) {
        this.customerId = customerId;
    }

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public LocalDate getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(LocalDate dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

}