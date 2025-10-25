package org.browserstack.models;

public class UserData {

    private  String userName;
    private  String password;
    private  String firstName;
    private  String lastName;
    private  String address;
    private  String state;
    private  String postalCode;

    public UserData(String userName, String password, String firstName, String lastName, String address, String state, String postalCode) {
        this.userName = userName;
        this.password = password;
        this.firstName = firstName;
        this.lastName = lastName;
        this.address = address;
        this.state = state;
        this.postalCode = postalCode;
    }


    public String getPostalCode() {
        return postalCode;
    }

    public String getState() {
        return state;
    }

    public String getAddress() {
        return address;
    }

    public String getLastName() {
        return lastName;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getPassword() {
        return password;
    }

    public String getUserName() {
        return userName;
    }
}
