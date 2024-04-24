/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controller;

import DAO.AccountDAOImpl;
import DAO.BankDAOImpl;
import java.util.Scanner;
import model.Bank;

/**
 *
 * @author SAD
 */
public class BankControl {
    public void NapTien(){
        Scanner sc = new Scanner(System.in);
        BankDAOImpl bankDAOImpl = new BankDAOImpl();
        System.out.println("Nhập tài khoản :");
        String userName = sc.nextLine();
        System.out.println("Nhập mật khẩu để thanh toán");
        String matKhau = sc.nextLine();
        System.out.println("Số tiền bạn muốn nạp là :");
        Integer balance = sc.nextInt();
        sc.nextLine();
        Bank bank = new Bank(userName, matKhau,balance);
        
        AccountDAOImpl accountDAOImpl = new AccountDAOImpl();
        
        if(accountDAOImpl.CheckAccount(userName)){
            if(!bankDAOImpl.CheckTaiKhoanNapTien(userName)){
              if(bankDAOImpl.CheckMatKhau(matKhau)){
                
            
                  System.out.println("tạo thẻ nạp tiền thành công");
                  bankDAOImpl.NapTien(bank);
            
                }
              else System.out.println(" Mật khẩu không chính xác");
            }
            else { 
                if(bankDAOImpl.CheckMatKhau(matKhau)){
                    System.out.println(" nạp thêm tiền thành công");
                    bankDAOImpl.NapThemTien(userName, balance);
                }
                else System.out.println("Mật khẩu không chính xác");
            }
        }
        else System.out.println("Tài khoản bạn nạp chưa tồn tại");
    }
    public void RutTien() throws Exception {
        Scanner sc = new Scanner(System.in);
        BankDAOImpl bankDAOImpl2 = new BankDAOImpl();
        System.out.println("Nhập tài khoản :");
        String userName = sc.nextLine();
        System.out.println("Nhập mật khẩu : ");
        String matKhau = sc.nextLine();
        System.out.println("Số tiền bạn muốn rút là :");
        Integer tmp = sc.nextInt();
        sc.nextLine();
       // Bank bank = new Bank(userName, balance);
        
        AccountDAOImpl accountDAOImpl = new AccountDAOImpl();
        
        if(accountDAOImpl.CheckAccount(userName)){
            if(bankDAOImpl2.CheckTaiKhoanRutTien(userName, matKhau)){
            //System.out.println("Rút tiền thành công");
            bankDAOImpl2.RutTien(userName, tmp);
            
            }
        }
        else System.out.println("Tài khoản bạn chưa tồn tại");
    }
}
