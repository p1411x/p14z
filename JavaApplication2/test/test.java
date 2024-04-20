
import DAO.MovieDAOImpl;
import controller.DanhGiaControl;
import controller.MovieControl;
import java.util.Scanner;
import static movie.main.pressAnyKey;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author SAD
 */
public class test {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("1. Đánh giá ");
        System.out.println("2. Xóa đánh giá ");
        System.out.println("3. Sửa đánh giá ");
        System.out.println("4. Hiển thị tất cả các đánh giá");
        System.out.println("Nhập chức năng bạn muốn");
        int tuychon = sc.nextInt();
        switch (tuychon) {
            case 1 :
                DanhGiaControl danhGiaControl = new DanhGiaControl();
                danhGiaControl.addDanhGia();
                break;
            case 2 :
                DanhGiaControl danhGiaControl2 = new  DanhGiaControl();
                danhGiaControl2.deleteDanhGiaById();
                break;
            case 3 :
                DanhGiaControl danhGiaControl3 = new DanhGiaControl();
                danhGiaControl3.updateDanhGia();
                break;
            case 4 :
                DanhGiaControl danhGiaControl4 = new DanhGiaControl();
                danhGiaControl4.showAllDanhGia();
                break;
                
            default:
                System.out.println("Nhập sai tùy chọn, vui lòng nhập lại");
                pressAnyKey();
                break;
        }
    }
}
