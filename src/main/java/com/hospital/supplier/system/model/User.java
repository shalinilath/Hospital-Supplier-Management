package com.hospital.supplier.system.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;



/**
 * @author Joe
 */
@Document(collection = "user")
public class User {
    @Id
    private String id;
    private String user_id;

    public String getUser_name() {
        return user_name;
    }

    public void setUser_name(String user_name) {
        this.user_name = user_name;
    }

    private String user_name;
    private String first_name;
    private String last_name;
    private String password;
    private String gender;
    private String address;
    private String designation;
    private String phone_number;

    public User() {

    }

    public User(String user_id, String user_name, String first_name, String last_name, String password, String gender,
                String address, String designation, String phone_number) {
        this.user_id = user_id;
        this.user_name = user_name;
        this.first_name = first_name;
        this.last_name = last_name;
        this.password = password;
        this.gender = gender;
        this.address = address;
        this.designation = designation;
        this.phone_number = phone_number;
    }




    @Override
    public String toString() {
        return "User{" +
                "id='" + user_id + '\'' +
                ", firstName='" + first_name + '\'' +
                ", lastName=" + last_name +
                ", sex='" + gender + '\'' +
                ", address=" + address + '\'' +
                ", password=" + password + '\'' +
                ", designation=" + designation + '\'' +
                ", contact number=" + phone_number +
                '}';
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getUser_id() {
        return user_id;
    }

    public void setUser_id(String user_id) {
        this.user_id = user_id;
    }

    public String getFirst_name() {
        return first_name;
    }

    public void setFirst_name(String first_name) {
        this.first_name = first_name;
    }

    public String getLast_name() {
        return last_name;
    }

    public void setLast_name(String last_name) {
        this.last_name = last_name;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getDesignation() {
        return designation;
    }

    public void setDesignation(String designation) {
        this.designation = designation;
    }

    public String getPhone_number() {
        return phone_number;
    }

    public void setPhone_number(String phone_number) {
        this.phone_number = phone_number;
    }
}
