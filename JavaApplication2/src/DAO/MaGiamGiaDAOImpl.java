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
import model.MaGiamGia;

/**
 *
 * @author SAD
 */
public class MaGiamGiaDAOImpl implements MaGiamGiaDAO{
  Connection conn = null;
    PreparedStatement ps = null;
    ResultSet rs = null;
    public boolean checkMaGiamGia(String rateGiamGia) {

        String sql = "SELECT * FROM MaGiamGia WHERE rateGiamGia ='" +rateGiamGia+ "'";
        try {

            conn = new DBContext().getConnection();//mo ket noi voi sql
            ps = conn.prepareStatement(sql);
            rs = ps.executeQuery();
            while (rs.next()) {
                if (rateGiamGia.equals(rs.getString("rateGiamGia"))) {
                    
                    return true;
                }

            }
        //conn.close();
        } catch (Exception ex) {
        }
        
        return false;
    }
    public void addMaGiamGia(MaGiamGia maGiamGia) {
       String sql
                = "INSERT INTO [dbo].[MaGiamGia]\n"
            //   + "           ([stt]\n"   
               + "           ([rateGiamGia]\n"
                + "           ,[soLuong])\n"
                + "     VALUES (?,?)";

        try {
            //conn = new DBContext().getConnection();
            //PreparedStatement ps = conn.prepareStatement(sql);
             conn = new DBContext().getConnection();
             ps = conn.prepareStatement(sql);
         //   ps.setString(1, maGiamGia.getStt());
            ps.setString(1, maGiamGia.getRateGiamGia());
            ps.setInt(2 , maGiamGia.getSoLuong());
            ps.executeUpdate();
        }  catch (Exception ex) {
            Logger.getLogger(DanhGiaDAOImpl.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    @Override
    public void deleteMaGiamGia(String rateGiamGia) {
        String sql = "DELETE FROM [dbo].[MaGiamGia] WHERE [rateGiamGia] = ?";

        try {
           conn = new DBContext().getConnection();
        ps = conn.prepareStatement(sql);
            ps.setString(1, rateGiamGia);
            ps.executeUpdate();
        } catch (SQLException e) {
            
        } catch (Exception ex) {
            Logger.getLogger(DanhGiaDAOImpl.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    @Override
    public void updateMaGiamGia(MaGiamGia maGiamGia) { // cập nhật số lượng vé giảm giá
      String sql = "UPDATE [dbo].[MaGiamGia]\n"
                + "  SET     "
//                + "           [stt] = ?\n"
                + "           [soLuong] = ?\n"
                + "    Where [rateGiamGia] = ?";
              try {
           // conn = new DBContext().getConnection();
            conn = new DBContext().getConnection();
            ps = conn.prepareStatement(sql);
            ps.setInt(1, maGiamGia.getSoLuong());
            ps.setString(2, maGiamGia.getRateGiamGia());
           
            ps.executeUpdate();
        }  catch (Exception ex) {
            Logger.getLogger(DanhGiaDAOImpl.class.getName()).log(Level.SEVERE, null, ex);
        }
    
    }

    @Override
    public void showAllMaGiamGia() {
      String sql = "SELECT * FROM MaGiamGia";
            try {
            conn = new DBContext().getConnection();//mo ket noi voi sql
            ps = conn.prepareStatement(sql);
            rs = ps.executeQuery();
            while(rs.next()){
                System.out.println(new MaGiamGia(
                                    rs.getString(1)
                                    ,rs.getInt(2)));
            }
        } catch (Exception e) {
        }
    }
    
}
