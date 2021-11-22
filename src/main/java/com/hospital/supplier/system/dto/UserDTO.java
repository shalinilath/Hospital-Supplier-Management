package com.hospital.supplier.system.dto;

/**
 * @author Joe
 */

public class UserDTO {
    private String id;
    private String lastName;
    private String firstName;
    private String password;
    private String sex;
    private String address;
    private String occupant;
    private long contactNumber;

    public UserDTO() {}

    public UserDTO(String id, String lastName, String firstName, String password,
                      String sex, String address, String occupant, long contactNumber) {
        this.id = id;
        this.lastName = lastName;
        this.firstName = firstName;
        this.password = password;
        this.sex = sex;
        this.address = address;
        this.occupant = occupant;
        this.contactNumber = contactNumber;
    }


    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getOccupant() {
        return occupant;
    }

    public void setOccupant(String occupant) {
        this.occupant = occupant;
    }

    public long getContactNumber() {
        return contactNumber;
    }

    public void setContactNumber(long contactNumber) {
        this.contactNumber = contactNumber;
    }
}
