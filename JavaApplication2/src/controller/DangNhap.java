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
    public void DangNhap () {
         Scanner sc = new Scanner(System.in);
         System.out.println("Nhập tài khoản :");
         String userName = sc.nextLine();
         System.out.println("Nhập mật khẩu : ");
         String passWord = sc.nextLine();
         if(accountDAOImpl.CheckAccount(userName,passWord)){
             System.out.println("Đăng nhập thành công");
         }
          else System.out.println("Tài khoản đăng nhập không chính xác");
        
    }
    
}
