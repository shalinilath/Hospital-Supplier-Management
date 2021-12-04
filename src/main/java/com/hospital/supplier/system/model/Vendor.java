package com.hospital.supplier.system.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import java.util.List;

/**
 * @author Joe
 */
@Document(collection = "vendor")
public class Vendor {
    @Id
    private String id;
    private String vendor_id;
    private String vendor_name;
    private String url;
    private String contact_firstname;
    private String contact_lastname;
    private String contact_number;
    private String contact_title;
    private String email;
    private String address;
    private String service_type;
    private List<Product> products;

    public Vendor() {}

    public Vendor(String vendor_id, String vendor_name, String url, String contact_firstname, String contact_lastname,
                  String contact_number, String contact_title, String email, String address, String service_type,
                  List<Product> products) {
        this.vendor_id = vendor_id;
        this.vendor_name = vendor_name;
        this.url = url;
        this.contact_firstname = contact_firstname;
        this.contact_lastname = contact_lastname;
        this.contact_number = contact_number;
        this.contact_title = contact_title;
        this.email = email;
        this.address = address;
        this.service_type = service_type;
        this.products = products;
    }


    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getVendor_id() {
        return vendor_id;
    }

    public void setVendor_id(String vendor_id) {
        this.vendor_id = vendor_id;
    }

    public String getVendor_name() {
        return vendor_name;
    }

    public void setVendor_name(String vendor_name) {
        this.vendor_name = vendor_name;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public String getContact_firstname() {
        return contact_firstname;
    }

    public void setContact_firstname(String contact_firstname) {
        this.contact_firstname = contact_firstname;
    }

    public String getContact_lastname() {
        return contact_lastname;
    }

    public void setContact_lastname(String contact_lastname) {
        this.contact_lastname = contact_lastname;
    }

    public String getContact_number() {
        return contact_number;
    }

    public void setContact_number(String contact_number) {
        this.contact_number = contact_number;
    }

    public String getContact_title() {
        return contact_title;
    }

    public void setContact_title(String contact_title) {
        this.contact_title = contact_title;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getService_type() {
        return service_type;
    }

    public void setService_type(String service_type) {
        this.service_type = service_type;
    }

    public List<Product> getProducts() {
        return products;
    }

    public void setProducts(List<Product> products) {
        this.products = products;
    }

    @Override
    public String toString() {
        return "Vendor{" +
                "id='" + id + '\'' +
                ", vendor_id='" + vendor_id + '\'' +
                ", vendor_name='" + vendor_name + '\'' +
                ", url='" + url + '\'' +
                ", contact_firstname='" + contact_firstname + '\'' +
                ", contact_lastname='" + contact_lastname + '\'' +
                ", contact_number='" + contact_number + '\'' +
                ", contact_title='" + contact_title + '\'' +
                ", email='" + email + '\'' +
                ", address='" + address + '\'' +
                ", service_type='" + service_type + '\'' +
                ", products=" + products +
                '}';
    }
}
