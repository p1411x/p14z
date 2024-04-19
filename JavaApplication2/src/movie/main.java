package movie;

import controller.DangKy;
import controller.DangNhap;
import java.util.*;
import model.Movie;

/**
 *
 * @author SAD
 */
public class main {

    private static boolean checkLogin = false;

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        while (true) {
            System.out.println("Chào các bạn");
            System.out.println("1. Đăng ký");
            System.out.println("2. Đăng nhập");
            System.out.println("3. Kết thúc chương trình");
            System.out.println("Nhập tùy chọn bạn muốn: ");
            int tuychon = sc.nextInt();
            switch (tuychon) {
                case 1: // đăng ký
                    DangKy dangKy = new DangKy();
                    dangKy.DangKy();
                    start();
                    pressAnyKey();
                    break;
                case 2: // đăng nhập
                    DangNhap dangNhap = new DangNhap();
                    dangNhap.DangNhap();
                    start();
                    pressAnyKey();
                    break;
                case 3:
                    System.exit(0);
                default:
                    System.out.println("Nhập sai tùy chọn, vui lòng nhập lại");
                    pressAnyKey();
                    break;
            }
        }
    }
public static void start(){
    
}
    public static void pressAnyKey() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("\n\nNhấn phím bất kỳ để tiếp tục...");
        scanner.nextLine(); // Đọc một dòng1 từ bàn phím, chờ người dùng nhấn Enter
        clearScreen();
    }

    public static void clearScreen() {
        System.out.print("\033[H\033[2J"); // Xóa màn hình
        System.out.flush(); // Flush để đảm bảo màn hình được xóa ngay lập tức
    }

}
