package ch_11.q2;

public class Person {
    private String name;
    private String address;
    private String phoneNum;
    private String emailAdress;

    Person() {

    }

    Person(String name, String address, String phoneNum, String emailAdress) {
        this.name = name;
        this.address = address;
        this.phoneNum = phoneNum;
        this.emailAdress = emailAdress;
    }

    public String getName() {
        return name;
    }

    public String getAddress() {
        return address;
    }

    public String getPhoneNum() {
        return phoneNum;
    }

    public String getEmailAdress() {
        return emailAdress;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public void setPhoneNum(String phoneNum) {
        this.phoneNum = phoneNum;
    }

    public void setEmailAdress(String emailAdress) {
        this.emailAdress = emailAdress;
    }
}
