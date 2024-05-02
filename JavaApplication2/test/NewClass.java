
import DAO.TicketDAOImpl;
import static com.sun.org.apache.xalan.internal.lib.ExsltDatetime.date;
import java.util.Date;
import java.util.Scanner;
import model.Movie;
import model.Tickets;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author SAD
 */
public class NewClass {
    public static void main(String[] args) {
       TicketDAOImpl ticketDAOImpl = new TicketDAOImpl();
     Scanner sc = new Scanner(System.in);
        System.out.println("Nhập id bộ phim bạn muốn xem");
        
        String idMovie = sc.nextLine();
                
        Movie movie = new Movie();
        movie.setNameMovie(ticketDAOImpl.getNameMovie(idMovie).getNameMovie());
        
        System.out.println("Mời bạn cung cấp ghế bạn ngồi : ");
        String seat = sc.nextLine();
         if (ticketDAOImpl.KiemTraVe(idMovie, seat)) {
        ticketDAOImpl.HuyVe(seat, idMovie);
        }
         else System.out.println("Vé của bạn chưa được đặt");
        
    }
}
