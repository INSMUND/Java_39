package ru.stqa.pft.addressbook.model;

public class ContactData {
    private int Id;
    private final String name;
    private final String middlename;
    private final String lastname;
    private final String nickname;
    private final String address;
    private String group;

    public ContactData(String name, String middlename, String lastname, String nickname, String address,String group) {
        this.name = name;
        this.middlename = middlename;
        this.lastname = lastname;
        this.nickname = nickname;
        this.address = address;
        this.group = group;
        this.Id=Integer.MAX_VALUE;
    }
    public int getId() {
        return Id;
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

    public String getGroup() {
        return group;
    }
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        ContactData that = (ContactData) o;

        if (name != null ? !name.equals(that.name) : that.name != null) return false;
        return lastname != null ? lastname.equals(that.lastname) : that.lastname == null;
    }

    @Override
    public int hashCode() {
        int result = name != null ? name.hashCode() : 0;
        result = 31 * result + (lastname != null ? lastname.hashCode() : 0);
        return result;
    }

    @Override
    public String toString() {
        return "ContactData{" +
                "Id=" + Id +
                ", name='" + name + '\'' +
                ", middlename='" + middlename + '\'' +
                ", lastname='" + lastname + '\'' +
                ", nickname='" + nickname + '\'' +
                ", address='" + address + '\'' +

                ", group='" + group + '\'' +
                '}';
    }

    public ContactData(int Id, String name, String middlename, String lastname, String nickname, String address, String group) {
        this.Id=Id;
        this.name = name;

        this.middlename = middlename;
        this.lastname = lastname;
        this.nickname = nickname;
        this.address = address;
        this.group = group;
    }
}
