package com.food.fd.Model;

public class Users {

    private String name;
    private String phone;
    private String address;
    private String image;
    private String password;

    public Users() {
    }

    public Users(String name, String phone, String address, String image, String password) {
        this.name = name;
        this.phone = phone;
        this.address = address;
        this.image = image;
        this.password = password;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
