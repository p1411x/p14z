package movie;

import DAO.MovieDAOImpl;
import controller.DangKy;
import controller.DangNhap;
import controller.DanhGiaControl;
import controller.DrinkControl;
import controller.MovieControl;
import controller.TicketControl;
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
        System.out.println("2. Xem danh sách chức năng của đồ uống");
        System.out.println("3. Xem danh sách chức năng của vé");
        System.out.println("4. Đánh giá ");
        int tuychon = sc.nextInt();
        switch (tuychon) {
            case 1:
                caseMovie();
                break;
            case 2:
                caseDrink();
                break;
            case 3:
                caseTicket();
                break;
            case 4:
                caseDanhGia();
                break;
            
//            case :
//                System.exit(0);
            default:
                System.out.println("Nhập sai tùy chọn, vui lòng nhập lại");
                pressAnyKey();
                break;
        }
    }

    public static void caseDanhGia() {
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

    public static void caseTicket() {
        Scanner sc = new Scanner(System.in);

        System.out.println("1. Đặt vé");
        System.out.println("2. Xem các vé đã được mua");

        System.out.println("Nhập chức năng bạn muốn");
        int tuychon = sc.nextInt();
        switch (tuychon) {
            case 1: // đặt vé
                TicketControl ticketControl = new TicketControl();
                ticketControl.DatVe();
                break;
            case 2: //crud các vé đã đặt
                TicketControl ticketControl2 = new TicketControl();
                ticketControl2.showAllTicket();
                break;
            default:
                System.out.println("Nhập sai tùy chọn, vui lòng nhập lại");
                pressAnyKey();
                break;
        }

    }

    public static void caseDrink() {
        Scanner sc = new Scanner(System.in);

        System.out.println("1.Thêm Đồ uống ");
        System.out.println("2.Xóa Đồ uống theo tên ");
        System.out.println("3. Tất cả đồ uống hiện có ");
        System.out.println("4. Cập nhật đồ uống ");

        System.out.println("Nhập chức năng bạn muốn");
        int tuychon = sc.nextInt();
        switch (tuychon) {
            case 1: // thêm nước
                DrinkControl drinkControl = new DrinkControl();
                drinkControl.addDrink();
                break;
            case 2: // xóa nước
                DrinkControl drinkControl2 = new DrinkControl();
                drinkControl2.deleteDrink();
                break;
            case 3: // tất cả nước đang có
                DrinkControl drinkControl3 = new DrinkControl();
                drinkControl3.showAllDrink();
                break;
            case 4: // cập nhật nước
                DrinkControl drinkControl4 = new DrinkControl();
                drinkControl4.updateDrink();
                break;

//           case :
//                    System.exit(0);
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
            case 2:// xóa phim
                MovieControl movieControl = new MovieControl();
                movieControl.deleteMovie();
                break;
            case 3: // show tất cả phim
                MovieDAOImpl movieDAOImpl = new MovieDAOImpl();
                movieDAOImpl.showAllMovie();
                break;
            case 4: // tìm kiếm phim theo id
                MovieControl movieControl4 = new MovieControl();
                movieControl4.searchMovieById();
                break;
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
