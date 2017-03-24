package ru.stqa.pft.addressbook.model;

public class ContactData {
    private final String name;
    private final String middlename;
    private final String lastname;
    private final String nickname;
    private final String address;

    public ContactData(String name, String middlename, String lastname, String nickname, String address) {
        this.name = name;
        this.middlename = middlename;
        this.lastname = lastname;
        this.nickname = nickname;
        this.address = address;
    }

    public String getName() {
        return name;
    }

    public String getMiddlename() {
        return middlename;
    }

    public String getLastname() {
        return lastname;
    }

    public String getNickname() {
        return nickname;
    }

    public String getAddress() {
        return address;
    }
}
