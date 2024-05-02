/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tesst2;

import controller.AdminControl;
import controller.DangNhap;
import java.util.Scanner;

/**
 *
 * @author SAD
 */
public class tesst {

    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập tài khoản :");
        String userName = sc.nextLine();
        System.out.println("Nhập mật khẩu : ");
        String passWord = sc.nextLine();

        DangNhap dangNhap = new DangNhap();
        if (dangNhap.DangNhap(userName, passWord)) {
            AdminControl adminControl = new AdminControl();
            System.out.println(adminControl.Admin(userName, passWord));

        } else {
            System.out.println("Mời bạn đăng nhập lại");

        }
    }
}
