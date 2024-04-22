
import DAO.MaGiamGiaDAOImpl;
import java.util.Scanner;
import model.MaGiamGia;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author SAD
 */
public class test2 {
    public static void main(String[] args) {
//         MaGiamGiaDAOImpl maGiamGiaDAOImpl = new MaGiamGiaDAOImpl();
//        Scanner sc = new Scanner(System.in);
////        System.out.println("Nhập số thứ tự");
////        String stt = sc.nextLine();
//        System.out.println("Nhập mã giảm giá");
//        String rateGiamGia = sc.nextLine();
//        System.out.println("Nhập số lượng :"); 
//        Integer soLuong = sc.nextInt();
//        sc.nextLine();
//       MaGiamGia maGiamGia = new MaGiamGia(rateGiamGia,soLuong);
//       if(maGiamGiaDAOImpl.checkMaGiamGia(rateGiamGia)){    
//           System.out.println("Cập nhật thành công");
//           maGiamGiaDAOImpl.updateMaGiamGia(maGiamGia);
//        }
//       else System.out.println("Mã giảm giá không tồn tại");
     MaGiamGiaDAOImpl maGiamGiaDAOImpl = new MaGiamGiaDAOImpl();
        Scanner sc = new Scanner(System.in);
//        System.out.println("Nhập số thứ tự");
//        String stt = sc.nextLine();
        System.out.println("Nhập mã giảm giá");
        String rateGiamGia = sc.nextLine();
        System.out.println("Nhập số lượng :"); 
        Integer soLuong = sc.nextInt();
        sc.nextLine();
       MaGiamGia maGiamGia = new MaGiamGia(rateGiamGia,soLuong);
       if(!maGiamGiaDAOImpl.checkMaGiamGia(rateGiamGia)){    
           System.out.println("Thêm mã thành công");
        maGiamGiaDAOImpl.addMaGiamGia(maGiamGia);
        }
       else System.out.println("Mã giảm giá đã tồn tại");      ;
    }
}
