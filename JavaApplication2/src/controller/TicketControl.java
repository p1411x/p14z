/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controller;


import DAO.TicketDAOImpl;
import java.util.Scanner;
import model.Movie;
import model.Tickets;


/**
 *
 * @author SAD
 */
public class TicketControl {
    public void DatVe(){
     TicketDAOImpl ticketDAOImpl = new TicketDAOImpl();
     Scanner sc = new Scanner(System.in);
        System.out.println("Nhập id bộ phim bạn muốn xem");
        String idMovie = sc.nextLine();
        
        
        Movie movie = new Movie();
        movie.setNameMovie(ticketDAOImpl.getNameMovie(idMovie).getNameMovie());
        
        System.out.println("Nhập ghế bạn muốn ngồi");
        String seat = sc.nextLine();
        Tickets tickets = new Tickets(movie, seat , idMovie);
        
        if(ticketDAOImpl.KiemTraVe(idMovie, seat)){
            System.out.println("Vé đã được đặt hôặc không có phim ");
        }
        else {
            ticketDAOImpl.DatVe(tickets);
            System.out.println("Đặt vé thành công");
        }
    }
    public void showAllTicket(){
         TicketDAOImpl ticketDAOImpl = new TicketDAOImpl();
         System.out.println("Tất cả các vé đã được mua là ");
         ticketDAOImpl.showAllTicket();
    
    
    }
}
