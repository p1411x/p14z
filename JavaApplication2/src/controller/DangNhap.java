/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controller;

import DAO.AccountDAOImpl;
import java.sql.SQLException;
import java.util.*;

    
public class DangNhap {
    AccountDAOImpl accountDAOImpl = new AccountDAOImpl();
    public boolean DangNhap (String userName,String passWord) {
         
         if(accountDAOImpl.CheckAccount(userName,passWord)){
            // System.out.println("Đăng nhập thành công");
             return true;
         }
          else {
             System.out.println("Tài khoản hoặc mật khẩu không chính xác");
             
         }
        return false;
        
    }
    
}
