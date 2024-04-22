
package controller;

import DAO.AccountDAOImpl;
import java.util.*;
import model.Account;

public class DangKy {
   
    public  boolean DangKy(){
         AccountDAOImpl accountDAOImpl = new AccountDAOImpl();
       
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập tên tài khoản muốn đăng kí:");
        String userName = sc.nextLine();
        System.out.println("Nhập mật khẩu muốn đăng kí:");
        String passWord = sc.nextLine();
        Account account = new Account(userName,passWord);
        if(!accountDAOImpl.CheckAccount(userName)){
             accountDAOImpl.AddAccount(account);      
              System.out.println("Đăng ký thành công");
              return true;
               
        }
        else System.out.println("Tài khoản đã tồn tại");
        return false;
    }

    
}
