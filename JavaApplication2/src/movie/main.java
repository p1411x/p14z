package movie;

import DAO.MovieDAOImpl;
import controller.DangKy;
import controller.DangNhap;
import controller.MovieControl;
import java.util.Scanner;
import model.Movie;

public class main {

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

    public static void start() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập tùy chọn bạn muốn: ");
        System.out.println("1. Xem danh sách chức năng phim");
        
        int tuychon = sc.nextInt();
        switch (tuychon) {
            case 1:
                caseMovie();
                break;
            default:
                System.out.println("Nhập sai tùy chọn, vui lòng nhập lại");
                pressAnyKey();
                break;
        }
    }

    public static void caseMovie() {
        Scanner sc = new Scanner(System.in);
        System.out.println("1. Thêm phim");
        System.out.println("2. Xóa phim theo id ");
        System.out.println("3.Tất cả các phim đang có");
        System.out.println("4. Tìm kiếm theo id ");
        System.out.println("Nhập tùy chọn bạn muốn: ");
        int tuychon = sc.nextInt();
        switch (tuychon) {
            case 1: // thêm phim
                MovieControl moviecontrol = new MovieControl();
                moviecontrol.addMovie();
                break;
            case 2 :// xóa phim
                MovieControl movieControl = new MovieControl();
                movieControl.deleteMovie();
                break;
            case 3 : // show tất cả phim
                 MovieDAOImpl movieDAOImpl = new MovieDAOImpl();
                
                 movieDAOImpl.showAllMovie();
                 break;
            case 4 : // tìm kiếm phim theo 
                MovieControl movieControl4 = new MovieControl();
                movieControl4.searchMovieById();
            default:
                System.out.println("Nhập sai tùy chọn, vui lòng nhập lại");
                pressAnyKey();
                break;
        }
    }

    public static void pressAnyKey() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("\n\nNhấn phím bất kỳ để tiếp tục...");
        scanner.nextLine(); // Đọc một dòng từ bàn phím, chờ người dùng nhấn Enter
        clearScreen();
    }

    public static void clearScreen() {
        System.out.print("\033[H\033[2J"); // Xóa màn hình
        System.out.flush(); // Flush để đảm bảo màn hình được xóa ngay lập tức
    }
}
