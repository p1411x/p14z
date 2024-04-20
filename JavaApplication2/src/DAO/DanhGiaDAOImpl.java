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
import model.DanhGia;


public class DanhGiaDAOImpl implements DanhGiaDAO{

    Connection conn = null;
    PreparedStatement ps = null;
    ResultSet rs = null;
    public boolean checkDanhGia(String id) {

        String sql = "SELECT * FROM Movie WHERE id ='" + id + "'";
        try {

            conn = new DBContext().getConnection();//mo ket noi voi sql
            ps = conn.prepareStatement(sql);
            rs = ps.executeQuery();
            while (rs.next()) {
                if (id.equals(rs.getString(1))) {
                    return true;
                }

            }

        } catch (Exception ex) {
        }
        return false;
    }
    
    
    
    @Override
    public void addDanhGia(DanhGia danhGia) {
          String sql
                = "INSERT INTO [dbo].[DanhGia]\n"
                + "           ([id]\n"
                + "            ,[binhLuan]\n"
                + "           ,[rate])\n"
                + "     VALUES (?,?,?)";

        try {
            //conn = new DBContext().getConnection();
            //PreparedStatement ps = conn.prepareStatement(sql);
             conn = new DBContext().getConnection();
        ps = conn.prepareStatement(sql);
            ps.setString(1, danhGia.getId());
            ps.setString(2, danhGia.getBinhLuan());
            ps.setString(3, danhGia.getRate());
            ps.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        } catch (Exception ex) {
            Logger.getLogger(DanhGiaDAOImpl.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    @Override   
    public void deleteDanhGiaById(String id) {
        
        String sql = "DELETE FROM [dbo].[DanhGia] WHERE [id] = ?";

        try {
           conn = new DBContext().getConnection();
        ps = conn.prepareStatement(sql);
            ps.setString(1, id);
            ps.executeUpdate();
        } catch (SQLException e) {
            
        } catch (Exception ex) {
            Logger.getLogger(DanhGiaDAOImpl.class.getName()).log(Level.SEVERE, null, ex);
        }
    
    }
    public void showAllDanhGia() {
      String sql = "SELECT * FROM DanhGia";
            try {
            conn = new DBContext().getConnection();//mo ket noi voi sql
            ps = conn.prepareStatement(sql);
            rs = ps.executeQuery();
            while(rs.next()){
                System.out.println(new DanhGia(rs.getString(1), 
                                    rs.getString(2),
                                    rs.getString(3)));
            }
        } catch (Exception e) {
        }
    }

    
    public void updateDanhGia(DanhGia danhGia) {
         String sql = "UPDATE [dbo].[DanhGia]\n"
                + "  SET     "
                + "           [binhLuan] = ?\n"
                + "            [rate]    =?\n"
                + "    Where [id] = ?";
              try {
           // conn = new DBContext().getConnection();
            conn = new DBContext().getConnection();
        ps = conn.prepareStatement(sql);
            ps.setString(1, danhGia.getBinhLuan());
            ps.setString(2, danhGia.getRate());
            ps.setString(3, danhGia.getId());
            ps.executeUpdate();
        }  catch (Exception ex) {
            Logger.getLogger(DanhGiaDAOImpl.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
}
