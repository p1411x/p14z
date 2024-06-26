 /*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DAO;

import connect.DBContext;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Random;
import model.Movie;
import model.Tickets;

/**
 *
 * @author SAD
 */
public class TicketDAOImpl implements TicketDAO{
    Connection conn = null;
    PreparedStatement ps = null;
    ResultSet rs = null;
    @Override
    public boolean KiemTraVe(String idMovie, String seat) {
      MovieDAOImpl movieDAOImpl = new MovieDAOImpl();
      if(movieDAOImpl.CheckMovie(idMovie)){
      String sql = "SELECT * FROM Tickets WHERE idMovie ='" + idMovie + "'and seat='" + seat + "'";
        try {

            conn = new DBContext().getConnection();//mo ket noi voi sql
            ps = conn.prepareStatement(sql);
            rs = ps.executeQuery();
            while (rs.next()) {
                if (idMovie.equals(rs.getString("idMovie")) && seat.equals(rs.getString("seat"))) {
                    
                    return true;
                }

            }

        } catch (Exception e) {
             e.printStackTrace();
        }
        return false;
        }
      else {
         // System.out.println("Phim này hiện không chiếu");
          return false;
      }
    }

    @Override
    public void DatVe(Tickets tickets) {
        String sql
                = "INSERT INTO [dbo].[Tickets]\n"
                + "           ([movie]\n"
                + "             , [seat]\n"
                + "           ,[idMovie]\n"
                + "           ,[isPresent])\n"
        //         + "           ,[maVe])\n"
                + "     VALUES (?,?,?,?)";
         try {
            conn = new DBContext().getConnection();
            PreparedStatement ps = conn.prepareStatement(sql);
            ps.setString(1, tickets.getMovie().getNameMovie());
            ps.setString(2, tickets.getSeat());
            ps.setString(3, tickets.getIdMovie());
            ps.setBoolean(4, false);
            
//            Random generator = new Random(); 
//            Integer value =generator.nextInt(1000000) +1 ;
//            ps.setInt(5 , value);
            
            ps.executeUpdate();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    
    public Movie getNameMovie(String idMovie) {
       String sql="SELECT nameMovie FROM Movie WHERE idMovie ='"+idMovie+"'" ;
       
        try {
            conn = new DBContext().getConnection();//mo ket noi voi sql
            ps = conn.prepareStatement(sql);
            rs = ps.executeQuery();
            while(rs.next()){
                Movie movie = new Movie();
                movie.setNameMovie(rs.getString("nameMovie"));
//                movie.setDirector(rs.getString("director"));
//                movie.setIdMovie(rs.getString("idMovie"));
//                movie.setIdRoomMovie(rs.getString("idRoomMovie"));
//                movie.setPriceMovie(rs.getString("priceMovie"));
                return movie;
            }
        } catch (Exception e) {
             e.printStackTrace();
        }
        return null;
    }
    
    public Movie getPriceMovie(String idMovie) {
       String sql="SELECT priceMovie FROM Movie WHERE idMovie ='"+idMovie+"'" ;
       
        try {
            conn = new DBContext().getConnection();//mo ket noi voi sql
            ps = conn.prepareStatement(sql);
            rs = ps.executeQuery();
            while(rs.next()){
                Movie movie = new Movie();
                movie.setPriceMovie(rs.getString("priceMovie"));
                
                return movie;
            }
        } catch (Exception e) {
             e.printStackTrace();
        }
        return null;
    }
    
    
    
    public void showAllTicket() {
        
       // ticketDAOImpl.getNameMovie(idMovie).getNameMovie()
      String sql = "SELECT * FROM Tickets ";
            try {
                TicketDAOImpl ticketDAOImpl = new TicketDAOImpl();
            conn = new DBContext().getConnection();//mo ket noi voi sql
            ps = conn.prepareStatement(sql);
            rs = ps.executeQuery();
            while(rs.next()){
                Movie movie = new Movie();
                movie.setNameMovie(ticketDAOImpl.getNameMovie(rs.getString("idMovie")).getNameMovie());
                System.out.println(new Tickets( movie , rs.getString("seat"),
                        rs.getString("idMovie"),rs.getBoolean("isPresent") ));
            }
        } catch (Exception e) {
             e.printStackTrace();
        }
    }
    
    public void updateTicket(String seat,String  idMovie) { // cập nhật tình trạng vé
      String sql = "UPDATE [dbo].[Tickets]\n"
                + "  SET     "
//                + "           [stt] = ?\n"
                + "           [isPresent] = ?\n"
                + "    Where [seat] = ? and [idMovie] = ? ";
      
              try {
            
            conn = new DBContext().getConnection();
            ps = conn.prepareStatement(sql);
            ps.setBoolean(1, true);
            ps.setString(2, seat);
            ps.setString(3, idMovie);
            
            ps.executeUpdate();
        }  catch (Exception e) {
            e.printStackTrace();
        }
    
    }
     public void HuyVe(String seat,String idMovie)  {
        String sql = "DELETE FROM [dbo].[Tickets] WHERE [seat] = ? and [idMovie]= ? ";

        try {
            conn = new DBContext().getConnection();
            PreparedStatement ps = conn.prepareStatement(sql);
            ps.setString(1,seat);
            ps.setString(2,idMovie);
            ps.executeUpdate();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
  
}
