/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controller;

import DAO.BankDAOImpl;
import DAO.MovieDAOImpl;
import DAO.TicketDAOImpl;
import java.util.Scanner;
import model.Movie;

/**
 *
 * @author SAD
 */
public class ThanhToanControl {

    public void ThanhToan() throws Exception {
        BankDAOImpl bankDAOImpl = new BankDAOImpl();
        Scanner sc = new Scanner(System.in);
        // bankDAOImpl.RutTien(userName, temp);
        System.out.println("Nhập tài khoản thanh toán của bạn (trùng với tên đăng nhập) : ");
        String userName = sc.nextLine();
        System.out.println("Nhập mật khẩu thanh toán");
        String passWord = sc.nextLine();
        if (bankDAOImpl.CheckTaiKhoanRutTien(userName, passWord)) {
            Movie movie = new Movie();

            TicketDAOImpl ticketDAOImpl = new TicketDAOImpl();

            System.out.println("Nhập ghế bạn muốn thanh toán");       ///update chuyển thành dựa vào mã vé 
            String seat = sc.nextLine();                               ///
            System.out.println("Nhập id phim bạn muốn thanh tooán");   ///dựa vào mã vé lấy ra idMovie
            String idMovie = sc.nextLine();                            // 
            if (ticketDAOImpl.KiemTraVe(idMovie, seat)) {

                movie.setPriceMovie(ticketDAOImpl.getPriceMovie(idMovie).getPriceMovie());
                String k = movie.getPriceMovie();
                System.out.println("giá của vé là : " + Integer.parseInt(k));
                bankDAOImpl.RutTien(userName, Integer.parseInt(k));
                ticketDAOImpl.updateTicket(seat, idMovie); // cập nhật tình trạng ghế
                 // System.out.println("Thanh toán thành công");
            }
            else System.out.println("Vé chưa được đặt");
           
        }
//        TicketDAOImpl ticketDAOImpl = new TicketDAOImpl();
//         Scanner sc = new Scanner(System.in);
//         System.out.println("Nhập ghế bạn muốn thanh toán");
//         String seat = sc.nextLine();
//         System.out.println("Nhập id phim bạn muốn thanh tooán");
//         Integer idMovie = sc.nextInt();
//         sc.nextLine();
//         ticketDAOImpl.updateTicket(seat, idMovie);
    }
}
