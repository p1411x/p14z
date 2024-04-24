/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

/**
 *
 * @author SAD
 */
public class Bank {
    private String userName;
    private String matKhau;
    private int balance;

    public Bank() {
    }

    public void setMatKhau(String matKhau) {
        this.matKhau = matKhau;
    }

    public Bank(String userName, String matKhau, int balance) {
        this.userName = userName;
        this.matKhau = matKhau;
        this.balance = balance;
    }

    public String getMatKhau() {
        return matKhau;
    }

    public Bank(String userName, int balance) {
        this.userName = userName;
        this.balance = balance;
    }

  

    
    public int getBalance() {
        return balance;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getUserName() {
        return userName;
    }

   

    public void setBalance(int balance) {
        this.balance = balance;
    }
    
}
