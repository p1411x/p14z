/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controller;


import DAO.GheDAOImpl;
import java.util.Scanner;

/**
 *
 * @author SAD
 */
public class GheControl {
    public void AddGhe(){
        Scanner sc = new Scanner(System.in);
        GheDAOImpl gheDAOImpl = new GheDAOImpl();
        
        System.out.println("Nhập số ghế bạn muốn thêm :");
        String maSoGhe = sc.nextLine();
        if(!gheDAOImpl.checkGhe(maSoGhe)){
            System.out.println("Thêm ghế thành công");
        
            gheDAOImpl.addGhe(maSoGhe);
        }
        else System.out.println("Ghế đã có sẵn : ");
    }
    public void DeleteGhe(){
        Scanner sc = new Scanner(System.in);
        GheDAOImpl gheDAOImpl = new GheDAOImpl();
        
        System.out.println("Nhập số ghế bạn muốn thêm :");
        String maSoGhe = sc.nextLine();
        if(!gheDAOImpl.checkGhe(maSoGhe)){
            System.out.println("Không có ghế này");
        }
        else{
            gheDAOImpl.addGhe(maSoGhe);
            System.out.println("Xóa ghế thành công");
        }
    }
}
