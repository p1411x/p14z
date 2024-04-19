///*
// * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
// * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
// */
//package DAO;
//
//import connect.DBContext;
//import java.sql.Connection;
//import java.sql.PreparedStatement;
//import java.sql.ResultSet;
//import java.sql.SQLException;
//import model.Movie;
//
//public class MovieDAOImpl implements MovieDAO {
//
//    Connection conn = null;
//    PreparedStatement ps = null;
//    ResultSet rs = null;
//
//    @Override
//    public void addMovie(Movie movie) {
//        String sql = "INSERT INTO [dbo].[Movie]\n"
//                + "           ([idMovie]\n"
//                + "           ,[nameMovie])\n"
//                + "     VALUES (?,?)";
//
//        try {
//            PreparedStatement ps = conn.prepareStatement(sql);
//            ps.setString(1, movie.getIdMovie());
//            ps.setString(2, movie.getNameMovie());
//            ps.executeUpdate();
//        } catch (SQLException e) {
//
//        }
//    }
//
//    public void deleteMovieById(int id) {
//        String sql = "DELETE FROM [dbo].[Movie] WHERE [idMovie] = ?";
//
//        try {
//            PreparedStatement ps = conn.prepareStatement(sql);   
//            ps.setInt(1, id);
//            ps.executeUpdate();
//        } catch (SQLException e) {
//
//        }
//    }
//
//    public boolean CheckMovie(String idMovie, String nameMovie) {
//        String sql = "SELECT * FROM Movie WHERE idMovie ='" + idMovie + "'and nameMovie='" + nameMovie + "'";
//        try {
////            PreparedStatement ps = cons.prepareStatement(sql);
////            ResultSet rs = ps.executeQuery();
//            conn = new DBContext().getConnection();//mo ket noi voi sql
//            ps = conn.prepareStatement(sql);
//            rs = ps.executeQuery();
//            while (rs.next()) {
//                if (idMovie.equals(rs.getString(1)) && nameMovie.equals(rs.getString(2))) {
//
//                    return true;
//                }
//
//            }
//
//        } catch (Exception ex) {
//
//        }
//        return false;
//    }
//}
