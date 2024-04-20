/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controller;

import DAO.DanhGiaDAOImpl;
import java.util.Scanner;
import model.DanhGia;

/**
 *
 * @author SAD
 */
public class DanhGiaControl {
    public void addDanhGia() {
        DanhGiaDAOImpl danhGiaDAOImpl = new DanhGiaDAOImpl();
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập id");
        String id = sc.nextLine();
        System.out.println("Nhập nhận xét :");
        String binhLuan = sc.nextLine();   
        System.out.println("Số sao bạn cho (1-5) :");
        String rate = sc.nextLine();
  
        DanhGia danhGia = new DanhGia(id, binhLuan, rate);
        if(!danhGiaDAOImpl.checkDanhGia(id)){
            System.out.println("thêm đánh giá thành công");
        danhGiaDAOImpl.addDanhGia(danhGia);
        }
        else System.out.println("Trùng id mới bạn nhập id khác");
    }
    public void deleteDanhGiaById(){
        DanhGiaDAOImpl danhGiaDAOImpl1 = new DanhGiaDAOImpl();
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập id muốn xóa");
        String id = sc.nextLine();
        if(danhGiaDAOImpl1.checkDanhGia(id)){
            System.out.println("Xóa thành công");
        danhGiaDAOImpl1.deleteDanhGiaById(id);
        }
        else System.out.println("Đánh giá trên không tồn tại");
    }
    public void updateDanhGia(){
        DanhGiaDAOImpl danhGiaDAOImpl2 = new DanhGiaDAOImpl();
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập id bạn muốn sửa");
        String id = sc.nextLine();
        System.out.println("Nhập nhận xét :");
        String binhLuan = sc.nextLine();   
        System.out.println("Số sao bạn cho :");
        String rate = sc.nextLine();
  
        DanhGia danhGia1 = new DanhGia(id, binhLuan, rate);
         if(danhGiaDAOImpl2.checkDanhGia(id)){
        danhGiaDAOImpl2.updateDanhGia(danhGia1);
         }
         else System.out.println("Không có id đánh giá trên");
    }
    public void showAllDanhGia(){
        DanhGiaDAOImpl danhGiaDAOImpl3 = new DanhGiaDAOImpl();
        System.out.println("Tất cả các đánh giá");
        danhGiaDAOImpl3.showAllDanhGia();
    }
}
