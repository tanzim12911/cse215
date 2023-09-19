package ch_11.q2;

public class Person {
    private String name;
    private String address;
    private int phoneNum;
    private String emailAddress;

    Person() {

    }

    Person(String name, String address, int phoneNum, String emailAddress) {
        this.name = name;
        this.address = address;
        this.phoneNum = phoneNum;
        this.emailAddress = emailAddress;
    }

    public String getName() {
        return name;
    }
    public String getAddress() {
        return address;
    }
    public int getPhoneNum() {
        return phoneNum;
    }
    public String getEmailAddress() {
        return emailAddress;
    }

    public void setName(String name) {
        this.name = name;
    }
    public void setAddress(String address) {
        this.address = address;
    }
    public void setPhoneNum(int phoneNum) {
        this.phoneNum = phoneNum;
    }
    public void setEmailAddress(String emailAddress) {
        this.emailAddress = emailAddress;
    }
}
