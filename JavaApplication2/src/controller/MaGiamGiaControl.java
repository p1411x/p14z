
package controller;

import DAO.MaGiamGiaDAOImpl;
import java.util.Scanner;
import model.MaGiamGia;

/**
 *
 * @author SAD
 */
public class MaGiamGiaControl {
    public void addMaGiamGia(){
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
       else System.out.println("Mã giảm giá đã tồn tại");        
    }
    public void deleteMaGiamGia(){
        MaGiamGiaDAOImpl maGiamGiaDAOImpl2 = new MaGiamGiaDAOImpl();
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập mã giảm giá");
        String rateGiamGia = sc.nextLine();
        if(maGiamGiaDAOImpl2.checkMaGiamGia(rateGiamGia)){    
           System.out.println("Xóa thành công");
        maGiamGiaDAOImpl2.deleteMaGiamGia(rateGiamGia);
        }
       else System.out.println("Mã giảm giá không tồn tại"); 
    }
    public void updateMaGiamGia(){
        MaGiamGiaDAOImpl maGiamGiaDAOImpl3 = new MaGiamGiaDAOImpl();
        Scanner sc = new Scanner(System.in);
//        System.out.println("Nhập số thứ tự");
//        String stt = sc.nextLine();
        System.out.println("Nhập mã giảm giá");
        String rateGiamGia = sc.nextLine();
        System.out.println("Nhập số lượng :"); 
        Integer soLuong = sc.nextInt();
        sc.nextLine();
       MaGiamGia maGiamGia = new MaGiamGia(rateGiamGia,soLuong);
       if(maGiamGiaDAOImpl3.checkMaGiamGia(rateGiamGia)){    
           System.out.println("Cập nhật thành công");
        maGiamGiaDAOImpl3.updateMaGiamGia(maGiamGia);
        }
       else System.out.println("Mã giảm giá không tồn tại");
    }
    public void showAllMaGiamGia(){
        MaGiamGiaDAOImpl maGiamGiaDAOImpl4 = new MaGiamGiaDAOImpl();
        //Scanner sc = new Scanner(System.in);
        System.out.println("Các mã giảm giá đang có là :");
        maGiamGiaDAOImpl4.showAllMaGiamGia();
    }
}

