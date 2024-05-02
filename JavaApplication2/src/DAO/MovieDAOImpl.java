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
import java.util.logging.Level;
import java.util.logging.Logger;
import model.Movie;

public class MovieDAOImpl implements MovieDAO {

    Connection conn = null;
    PreparedStatement ps = null;
    ResultSet rs = null;

    @Override
    public void addMovie(Movie movie) {
      String sql=
              "INSERT INTO [dbo].[Movie]\n"
                + "           ([idMovie]\n"
                + "           ,[nameMovie]\n"
                + "           ,[priceMovie]\n"
                + "           ,[idRoomMovie]\n"
                + "           ,[director])\n"
                + "     VALUES (?,?,?,?,?)";

        try {
            conn = new DBContext().getConnection();
            PreparedStatement ps = conn.prepareStatement(sql);
            ps.setString(1, movie.getIdMovie());
            ps.setString(2, movie.getNameMovie());
            ps.setString(3, movie.getPriceMovie());            
            ps.setString(4, movie.getIdRoomMovie());
            ps.setString(5, movie.getDirector());
            ps.executeUpdate();
        } catch (Exception e) {
             e.printStackTrace();
        }
    }

    @Override
    public void deleteMovieById(String idMovie) {
        String sql = "DELETE FROM [dbo].[Movie] WHERE [idMovie] = ?";

        try {
            conn = new DBContext().getConnection();
            PreparedStatement ps = conn.prepareStatement(sql);
            ps.setString(1,idMovie);
            ps.executeUpdate();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @Override
    public boolean CheckMovie(String idMovie, String idRoomMovie) {
        String sql = "SELECT * FROM Movie WHERE idMovie ='" + idMovie + "'or idRoomMovie='" + idRoomMovie + "'";
        try {

            conn = new DBContext().getConnection();//mo ket noi voi sql
            ps = conn.prepareStatement(sql);
            rs = ps.executeQuery();
            while (rs.next()) {
                if (idMovie.equals(rs.getString(1)) || idRoomMovie.equals(rs.getString(2))) {

                    return true;
                }

            }

        } catch (Exception e) {    
            e.printStackTrace();
        }
        return false;
    }
    @Override
    public boolean CheckMovie(String idMovie) {
        String sql = "SELECT * FROM Movie WHERE idMovie ='" + idMovie +"'";
        try {

            conn = new DBContext().getConnection();//mo ket noi voi sql
            ps = conn.prepareStatement(sql);
            
            rs = ps.executeQuery();
            while (rs.next()) {
                if (idMovie.equals(rs.getString(1)) ) {

                    return true;
                }

            }

        } catch (Exception e) {
                 e.printStackTrace();
        }
        return false;
    }

    @Override
    public void showAllMovie() {
       String sql = "SELECT * FROM Movie";
            try {
            conn = new DBContext().getConnection();//mo ket noi voi sql
            ps = conn.prepareStatement(sql);
            rs = ps.executeQuery();
            while(rs.next()){
                System.out.println(new Movie(rs.getString(1), rs.getString(2), rs.getString(3), rs.getString(4), rs.getString(5)));
            }
        } catch (Exception e) {
                 e.printStackTrace();   
        }
    }

    @Override
    public void searchMovieById(String idMovie) {
        String sql = "SELECT * FROM [dbo].[Movie] WHERE [idMovie] = ?";

        try {
            conn = new DBContext().getConnection();//mo ket noi voi sql
            ps = conn.prepareStatement(sql);
            ps.setString(1,idMovie);
            rs = ps.executeQuery();
            while(rs.next()){
                System.out.println(new Movie(rs.getString(1), rs.getString(2), rs.getString(3), rs.getString(4), rs.getString(5)));
            }
        }  catch (Exception ex) {
                 ex.printStackTrace();
        }
    }

    @Override
    public void deXuat() {
         String sql = "SELECT top(1) * FROM [dbo].[Movie] order by [idMovie] desc ";
         try {
            conn = new DBContext().getConnection();//mo ket noi voi sql
            ps = conn.prepareStatement(sql);
          //  ps.setString(1,idMovie);
            rs = ps.executeQuery();
            while(rs.next()){
                System.out.println("Tên phim : "+ rs.getString("nameMovie"));
            }
        }  catch (Exception ex) {
            Logger.getLogger(MovieDAOImpl.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    
}
