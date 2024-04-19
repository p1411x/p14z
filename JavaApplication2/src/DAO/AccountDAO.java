/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package DAO;

import model.Account;

/**
 *
 * @author SAD
 */
public interface AccountDAO {
     public boolean CheckAccount(String userName,String passWord);
    public boolean CheckAccount(String userName);
    // thêm mới tài khoản
    public void AddAccount(Account account);
}
