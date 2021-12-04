package com.hospital.supplier.system.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import java.util.List;

/**
 * @author Joe
 */
@Document(collection = "vendors")
public class Vendor {
    @Id
    private String id;
    private String companyName;
    private String address;
    private String contactFName;
    private String contactLName;
    private long phoneNumber;
    private String serviceType;
    private List<Product> products;

    public Vendor() {}

    public Vendor(String id, String companyName, String address, String contactFName, String contactLName, long phoneNumber,
                  String serviceType, List<Product> products) {
        this.id = id;
        this.companyName = companyName;
        this.address = address;
        this.contactFName = contactFName;
        this.contactLName = contactLName;
        this.phoneNumber = phoneNumber;
        this.serviceType = serviceType;
        this.products = products;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getCompanyName() {
        return companyName;
    }

    public void setCompanyName(String companyName) {
        this.companyName = companyName;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getContactFName() {
        return contactFName;
    }

    public void setContactFName(String contactFName) {
        this.contactFName = contactFName;
    }

    public String getContactLName() {
        return contactLName;
    }

    public void setContactLName(String contactLName) {
        this.contactLName = contactLName;
    }

    public long getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(long phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getServiceType() {
        return serviceType;
    }

    public void setServiceType(String serviceType) {
        this.serviceType = serviceType;
    }

    public List<Product> getProducts() {
        return products;
    }

    public void setProducts(List<Product> products) {
        this.products = products;
    }

}
