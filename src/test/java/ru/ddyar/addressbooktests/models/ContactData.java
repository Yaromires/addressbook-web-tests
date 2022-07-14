package ru.ddyar.addressbooktests.models;

public class ContactData {

    private String firstName;
    private String lastName;
    private String mobileTelNumber;
    private String group;


    public ContactData(String firstName, String lastName, String mobileTelNumber, String group) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.mobileTelNumber = mobileTelNumber;
        this.group = group;
    }


    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getMobileTelNumber() {
        return mobileTelNumber;
    }

    public String getGroup() {
        return group;
    }
}
