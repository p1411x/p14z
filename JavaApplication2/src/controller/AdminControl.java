/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controller;

import DAO.AccountDAOImpl;
import java.util.Scanner;
import jdk.nashorn.internal.ir.BreakNode;
import static movie.main.pressAnyKey;
import static movie.main.start;

/**
 *
 * @author SAD
 */
public class AdminControl {

    AccountDAOImpl accountDAOImpl = new AccountDAOImpl();

    public boolean Admin(String userName,String passWord) throws Exception {

        
        if (accountDAOImpl.CheckAccount(userName, passWord)) {
            System.out.println("Đăng nhập thành công");

            if (userName.equals("admin") ) {
                return true;
                
            }

        }
        
        else {
            System.out.println("Tài khoản hoặc mật khẩu không chính xác");
           
        }
        return false;
        
    }
}
