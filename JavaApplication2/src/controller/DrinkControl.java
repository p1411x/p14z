/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controller;

import DAO.DrinkDAOImpl;
import DAO.MovieDAOImpl;
import java.util.Scanner;
import model.Drinks;
import model.Movie;

/**
 *
 * @author SAD
 */
public class DrinkControl {
    public void addDrink() {
        DrinkDAOImpl drinkDAOImpl = new DrinkDAOImpl();
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập tên đồ uống bạn muốn thêm : ");
        String nameDrink = sc.nextLine();
        System.out.println("Nhập giá tiền đồ uống");
        Float priceDrink = sc.nextFloat();
        Drinks dr = new Drinks(nameDrink,priceDrink);
        
        if(drinkDAOImpl.checkDrink(nameDrink)){
            System.out.println("Đồ uống đã có sẵn ");
        }
        else{
            drinkDAOImpl.addDrink(dr);
            System.out.println("Thêm đồ uống thành công");
        }
    }
    public void deleteDrink(){
        DrinkDAOImpl drinkDAOImpl1 = new DrinkDAOImpl();
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Nhập đồ uống bạn muốn xóa ");
        String nameDrink = sc.nextLine();
        
        if(drinkDAOImpl1.checkDrink(nameDrink)){
            drinkDAOImpl1.deleteDrink(nameDrink);
            System.out.println("Đồ uống đã được xóa ");
        }
        else{
            drinkDAOImpl1.deleteDrink(nameDrink);
            System.out.println("Không có đồ uống này");
        }
    }
   public void showAllDrink(){
        DrinkDAOImpl drinkDAOImpl1 = new DrinkDAOImpl();
        System.out.println("Đồ uống hiện có là :");
        drinkDAOImpl1.showAllDrink();
   }
   public void updateDrink(){
       DrinkDAOImpl drinkDAOImpl2 = new DrinkDAOImpl();
       Scanner sc = new Scanner(System.in);
       System.out.println("Nhập đồ uống bạn muốn cập nhật");
       String nameDrink = sc.nextLine();
       System.out.println("Nhập giá tiền sau khi cập nhật");
       Float priceDrink = sc.nextFloat();
       Drinks drinks = new Drinks(nameDrink,priceDrink);
      
       if(!drinkDAOImpl2.checkDrink(nameDrink)){
           drinkDAOImpl2.updateDrink(drinks);
           System.out.println("Cập nhật thành công");
       }
       else System.out.println("Không có đồ uống như bạn đề cập");
   }
}
