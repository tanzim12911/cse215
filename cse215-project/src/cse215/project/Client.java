/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package cse215.project;

/**
 *
 * @author tanzi
 */
public class Client {
    private String name;
    private int acc_num;
    private String password;

    public Client(String name, int acc_num, String password) {
        this.name = name;
        this.acc_num = acc_num;
        this.password = password;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAcc_num() {
        return acc_num;
    }

    public void setAcc_num(int acc_num) {
        this.acc_num = acc_num;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    @Override
    public String toString() {
        return "Client{" + "name=" + name + ", acc_num=" + acc_num + ", password=" + password + '}';
    }
}
