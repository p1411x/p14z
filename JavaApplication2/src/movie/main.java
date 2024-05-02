package movie;

import DAO.AccountDAOImpl;
import DAO.MovieDAOImpl;
import controller.AdminControl;
import controller.BankControl;
import controller.DangKy;
import controller.DangNhap;
import controller.DanhGiaControl;
import controller.DrinkControl;
import controller.MaGiamGiaControl;
import controller.MovieControl;
import controller.ThanhToanControl;
import controller.TicketControl;
import java.util.Scanner;
import model.Movie;

public class main {

    //  private static boolean checkLogin = false;
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        while (true) {
            System.out.println("Chào các bạn đến với hệ thống của chúng mình : ");
            System.out.println("");
            System.out.println("1. Đăng ký");
            System.out.println("2. Đăng nhập");
            System.out.println("3. Kết thúc chương trình");
            System.out.println("Nhập tùy chọn bạn muốn: ");
            int tuychon = sc.nextInt();

            switch (tuychon) {
                case 1: // đăng ký
                    //   if(!checkLogin){
                    DangKy dangKy = new DangKy();

                    if (dangKy.DangKy()) {
                        startUser();
                        pressAnyKey();
                    } else {
                        System.out.println("Mời bạn đăng ký lại");
                        pressAnyKey();
                    }

//                    checkLogin = true;
//                    }
//                        else{
//                        checkLogin = false;
//                    }
                    break;
                case 2: // đăng nhập
//                    DangNhap dangNhap = new DangNhap();
//                    if(dangNhap.DangNhap()){                                            
//                    start();
//                    pressAnyKey();
//                  //  checkLogin = true;
//                    }
//                    else{
//                        System.out.println("Mời bạn đăng nhập lại");
//                        pressAnyKey();
//                    }

                    DangNhap();
                    
//                    System.out.println("Nhập tài khoản :");
//                    String userName = sc.nextLine();
//                    System.out.println("Nhập mật khẩu : ");
//                    String passWord = sc.nextLine();
//
//                    DangNhap dangNhap = new DangNhap();
//                    if (dangNhap.DangNhap(userName, passWord)) {
//                        AdminControl adminControl = new AdminControl();
//                        if (adminControl.Admin(userName, passWord)) {
//                            start();
//                            pressAnyKey();
//                        } else {
//                            startUser();
//                            pressAnyKey();
//                        }
//
//                    } else {
//                        System.out.println("Mời bạn đăng nhập lại");
//
//                    }

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

    public static void DangNhap() throws Exception {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập tài khoản :");
        String userName = sc.nextLine();
        System.out.println("Nhập mật khẩu : ");
        String passWord = sc.nextLine();

        DangNhap dangNhap = new DangNhap();
        if (dangNhap.DangNhap(userName, passWord)) {
            AdminControl adminControl = new AdminControl();
            if (adminControl.Admin(userName, passWord)) {
                start();
                pressAnyKey();
            } else {
                startUser();
                pressAnyKey();
            }

        } else {
            System.out.println("Mời bạn đăng nhập lại");
            pressAnyKey();
        }
    }

    public static void start() throws Exception {
        Scanner sc = new Scanner(System.in);

        System.out.println("1. Xem danh sách chức năng phim");
        System.out.println("2. Xem danh sách chức năng của đồ uống");
        System.out.println("3. Xem danh sách chức năng của vé");
        System.out.println("4. Đánh giá ");
        System.out.println("5. Mã giảm giá");
        System.out.println("6.Đề xuất phim");
        System.out.println("7. Tài khoản thanh toán (Nạp rút tiền)");
        System.out.println("8. Thanh Toán");
        System.out.println("9. Đăng Xuất");
        System.out.println("Nhập tùy chọn bạn muốn: ");
        int tuychon = sc.nextInt();
        // boolean check = true;
        switch (tuychon) {
            case 1:
                caseMovie();
                // pressAnyKey();
                break;
            case 2:
                caseDrink();
                //pressAnyKey();
                break;
            case 3:
                caseTicket();
                //  pressAnyKey();
                break;
            case 4:
                caseDanhGia();
                //   pressAnyKey();
                break;
            case 5:
                caseMaGiamGia();
                // pressAnyKey();
                break;
            case 6:
                MovieControl movieControl7 = new MovieControl();
                movieControl7.deXuatMovie();
                start();
                //pressAnyKey();
                break;
            case 7:
                caseBank();
                break;
            case 8:
                ThanhToanControl thanhToanControl = new ThanhToanControl();
                thanhToanControl.ThanhToan();
                start();
                break;
            case 9: // đăng xuất
                // checkLogin = false;
                // check = false;
                System.out.println("Đang đăng xuất...");
                // pressAnyKey();

                break;

//            case :
//                System.exit(0);
            default:
                System.out.println("Nhập sai tùy chọn, vui lòng nhập lại");
                pressAnyKey();
                break;
        }
    }

    public static void startUser() throws Exception {
        Scanner sc = new Scanner(System.in);
        System.out.println("-----------------------------------------");
        System.out.println("1.Tìm kiếm phim ");
        System.out.println("2.Xem danh sách phim đang có ");
        System.out.println("3.Xem menu đồ uống ");
        System.out.println("4.Đặt vé ");
        System.out.println("5.Thanh Toán");
        System.out.println("Nhập tùy chọn bạn muốn: ");

        int tuychon = sc.nextInt();
        // boolean check = true;
        switch (tuychon) {
            case 1:
                MovieControl movieControl4 = new MovieControl();
                movieControl4.searchMovieById();
                pressAnyKey();
                startUser();
                break;
            case 2:
                MovieDAOImpl movieDAOImpl = new MovieDAOImpl();
                movieDAOImpl.showAllMovie();
                pressAnyKey();
                startUser();
                break;
            case 3:
                DrinkControl drinkControl3 = new DrinkControl();
                drinkControl3.showAllDrink();
                pressAnyKey();
                startUser();
                break;

            case 4:
                TicketControl ticketControl = new TicketControl();
                ticketControl.DatVe();
                pressAnyKey();
                startUser();
                break;
            case 5: //Thanh tooán
                ThanhToanControl thanhToanControl = new ThanhToanControl();
                thanhToanControl.ThanhToan();
                pressAnyKey();
                startUser();
                break;
            default:
                System.out.println("Nhập sai tùy chọn, vui lòng nhập lại");
                pressAnyKey();
                break;
        }

    }

    public static void caseMaGiamGia() throws Exception {
        Scanner sc = new Scanner(System.in);
        System.out.println("1. thêm mã giảm giá ");
        System.out.println("2. Xóa mã đánh giá ");
        System.out.println("3. Sửa số lượng mã giảm giá ");
        System.out.println("4. Hiển thị tất cả các mã giảm giá");
        System.out.println("5. Quay lại");
        System.out.println("Nhập chức năng bạn muốn");
        int tuychon = sc.nextInt();
        switch (tuychon) {
            case 1:
                MaGiamGiaControl maGiamGiaControl = new MaGiamGiaControl();
                maGiamGiaControl.addMaGiamGia();
                pressAnyKey();
                start();
                break;
            case 2:
                MaGiamGiaControl maGiamGiaControl2 = new MaGiamGiaControl();
                maGiamGiaControl2.deleteMaGiamGia();
                pressAnyKey();
                start();
                break;
            case 3:
                MaGiamGiaControl maGiamGiaControl3 = new MaGiamGiaControl();
                maGiamGiaControl3.updateMaGiamGia();
                pressAnyKey();
                start();
                break;
            case 4:
                MaGiamGiaControl maGiamGiaControl4 = new MaGiamGiaControl();
                maGiamGiaControl4.addMaGiamGia();
                pressAnyKey();
                start();
                break;
            case 5:
                start();
                break;
            default:
                System.out.println("Nhập sai tùy chọn, vui lòng nhập lại");
                caseMaGiamGia();
                pressAnyKey();
                break;
        }
    }

    public static void caseBank() throws Exception {
        Scanner sc = new Scanner(System.in);
        System.out.println("1. Nạp tiền ");
        System.out.println("2. Rút tiền");
        System.out.println("3. Quay lại");
        System.out.println("Nhập chức năng bạn muốn");
        int tuychon = sc.nextInt();
        switch (tuychon) {
            case 1:
                BankControl bankControl = new BankControl();
                bankControl.NapTien();
                pressAnyKey();
                start();
                break;
            case 2:
                BankControl bankControl2 = new BankControl();
                bankControl2.RutTien();
                pressAnyKey();
                start();
                break;

            case 3:
                start();
                break;
            default:
                System.out.println("Nhập sai tùy chọn, vui lòng nhập lại");
                pressAnyKey();
                break;
        }
    }

    public static void caseDanhGia() throws Exception {
        Scanner sc = new Scanner(System.in);
        System.out.println("1. Đánh giá ");
        System.out.println("2. Xóa đánh giá ");
        System.out.println("3. Sửa đánh giá ");
        System.out.println("4. Hiển thị tất cả các đánh giá");
        System.out.println("5 .Quay lại");
        System.out.println("Nhập chức năng bạn muốn");
        int tuychon = sc.nextInt();
        switch (tuychon) {
            case 1:
                DanhGiaControl danhGiaControl = new DanhGiaControl();
                danhGiaControl.addDanhGia();
                pressAnyKey();
                start();
                break;
            case 2:
                DanhGiaControl danhGiaControl2 = new DanhGiaControl();
                danhGiaControl2.deleteDanhGiaById();
                pressAnyKey();
                start();
                break;
            case 3:
                DanhGiaControl danhGiaControl3 = new DanhGiaControl();
                danhGiaControl3.updateDanhGia();
                pressAnyKey();
                start();
                break;
            case 4:
                DanhGiaControl danhGiaControl4 = new DanhGiaControl();
                danhGiaControl4.showAllDanhGia();
                pressAnyKey();
                start();
                break;
            case 5:
                start();
                break;
            default:
                System.out.println("Nhập sai tùy chọn, vui lòng nhập lại");
                pressAnyKey();
                break;
        }
    }

    public static void caseTicket() throws Exception {
        Scanner sc = new Scanner(System.in);

        System.out.println("1.Đặt vé");
        System.out.println("2.Xem các vé đã được mua");
        System.out.println("3.Hủy vé");
        System.out.println("4. Quay lại");
        System.out.println("Nhập chức năng bạn muốn");
        int tuychon = sc.nextInt();
        switch (tuychon) {
            case 1: // đặt vé
                TicketControl ticketControl = new TicketControl();
                ticketControl.DatVe();
                pressAnyKey();
                start();
                break;
            case 2: // các vé đã đặt
                TicketControl ticketControl2 = new TicketControl();
                ticketControl2.showAllTicket();
                pressAnyKey();
                start();
                break;
            case 3:
                TicketControl ticketControl3 = new TicketControl();
                ticketControl3.HuyVe();
                pressAnyKey();
                start();
                break;
            case 4:
                start();
                break;
            default:
                System.out.println("Nhập sai tùy chọn, vui lòng nhập lại");
                pressAnyKey();
                break;
        }

    }

    public static void caseDrink() throws Exception {
        Scanner sc = new Scanner(System.in);

        System.out.println("1.Thêm Đồ uống ");
        System.out.println("2.Xóa Đồ uống theo tên ");
//        System.out.println("3. Tất cả đồ uống hiện có ");
        System.out.println("3. Cập nhật đồ uống ");
        System.err.println("4. Quay lại");
        System.out.println("Nhập chức năng bạn muốn");
        int tuychon = sc.nextInt();
        switch (tuychon) {
            case 1: // thêm nước
                DrinkControl drinkControl = new DrinkControl();
                drinkControl.addDrink();
                pressAnyKey();
                start();
                break;
            case 2: // xóa nước
                DrinkControl drinkControl2 = new DrinkControl();
                drinkControl2.deleteDrink();
                pressAnyKey();
                start();
                break;
//            case 3: // tất cả nước đang có
//                DrinkControl drinkControl3 = new DrinkControl();
//                drinkControl3.showAllDrink();
//                pressAnyKey();
//                start();
//                break;
            case 3: // cập nhật nước
                DrinkControl drinkControl4 = new DrinkControl();
                drinkControl4.updateDrink();
                pressAnyKey();
                start();
                break;
            case 4:
                start();
                break;
//           case :
//                    System.exit(0);
            default:
                System.out.println("Nhập sai tùy chọn, vui lòng nhập lại");
                pressAnyKey();
                break;
        }
    }

    public static void caseMovie() throws Exception {
        Scanner sc = new Scanner(System.in);
        System.out.println("1. Thêm phim");
        System.out.println("2. Xóa phim theo id ");
//        System.out.println("3.Tất cả các phim đang có");
//        System.out.println("4. Tìm kiếm theo id ");
        System.out.println("3. Quay lại");
        System.out.println("Nhập tùy chọn bạn muốn: ");
        int tuychon = sc.nextInt();
        switch (tuychon) {
            case 1: // thêm phim
                MovieControl moviecontrol = new MovieControl();
                moviecontrol.addMovie();
                pressAnyKey();
                start();
                break;
            case 2:// xóa phim
                MovieControl movieControl = new MovieControl();
                movieControl.deleteMovie();
                pressAnyKey();
                start();
                break;
//            case 3: // show tất cả phim
//                MovieDAOImpl movieDAOImpl = new MovieDAOImpl();
//                movieDAOImpl.showAllMovie();
//                pressAnyKey();
//                start();
//                break;
//            case 4: // tìm kiếm phim theo id
//                MovieControl movieControl4 = new MovieControl();
//                movieControl4.searchMovieById();
//                pressAnyKey();
//                start();
//                break;
            case 3:
                start();
                break;
            default:
                System.out.println("Nhập sai tùy chọn, vui lòng nhập lại");
                pressAnyKey();
                break;
        }
    }

    public static void pressAnyKey() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("\n\nNhấn phím số kỳ để tiếp tục...");
        scanner.nextLine(); // Đọc một dòng từ bàn phím, chờ người dùng nhấn Enter
        //     clearScreen();
    }

//    public static void clearScreen() {
//        System.out.print("\033[H\033[2J"); // Xóa màn hình
//        System.out.flush(); // Flush để đảm bảo màn hình được xóa ngay lập tức
//    }
}
