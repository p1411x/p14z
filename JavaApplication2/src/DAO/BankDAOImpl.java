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
import model.Bank;

/**
 *
 * @author SAD
 */
public class BankDAOImpl implements BankDAO {

    Connection conn = null;
    PreparedStatement ps = null;
    ResultSet rs = null;

    @Override
    public void NapTien(Bank bank)  {
        String sql = "INSERT INTO [dbo].[Bank]\n"
                + "           ([userName]\n"
                //   + "             , []\n"
                + "           ,[balance])\n"
                + "     VALUES (?,?)";
        try {
 
             conn = new DBContext().getConnection();
             ps = conn.prepareStatement(sql);
            ps.setString(1, bank.getUserName());
            ps.setInt(2, bank.getBalance());

            ps.executeUpdate();
        } catch (SQLException e) {
   //         e.printStackTrace();
        } catch (Exception ex) {
            Logger.getLogger(BankDAOImpl.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

   public void RutTien(String userName, int temp)   {
    String selectSql = "SELECT balance FROM [dbo].[Bank] WHERE [userName] = ?";
    String updateSql = "UPDATE [dbo].[Bank] SET [balance] = ? WHERE [userName] = ?";
    try {
        conn = new DBContext().getConnection();
        
        // Thực hiện truy vấn SQL để lấy giá trị balance
        ps = conn.prepareStatement(selectSql);
        ps.setString(1, userName);
        rs = ps.executeQuery();
        
        if (rs.next()) {
            int balance = rs.getInt("balance");
            int newBalance = balance - temp;
            if(newBalance >0){
            // Thực hiện truy vấn SQL để cập nhật số dư mới
            ps = conn.prepareStatement(updateSql);
            ps.setInt(1, newBalance);
            ps.setString(2, userName);
            ps.executeUpdate();
                System.out.println("Rút tiền thành công");
            }
            else System.out.println("Không thể rút tiền vì số dư không đủ");
        }
        
        // Đóng tất cả các tài nguyên
//        rs.close();
//        ps.close();
//        conn.close();
    }    catch (Exception ex) {
            Logger.getLogger(BankDAOImpl.class.getName()).log(Level.SEVERE, null, ex);
        }
}


    public void NapThemTien(String userName, int temp) {
         String selectSql = "SELECT balance FROM [dbo].[Bank] WHERE [userName] = ?";
         String updateSql = "UPDATE [dbo].[Bank] SET [balance] = ? WHERE [userName] = ?";
    try {
        conn = new DBContext().getConnection();
        
        // Thực hiện truy vấn SQL để lấy giá trị balance
        ps = conn.prepareStatement(selectSql);
        ps.setString(1, userName);
        rs = ps.executeQuery();
        
        if (rs.next()) {
            int balance = rs.getInt("balance");
            int newBalance = balance +temp;
            if(newBalance >0){
            // Thực hiện truy vấn SQL để cập nhật số dư mới
            ps = conn.prepareStatement(updateSql);
            ps.setInt(1, newBalance);
            ps.setString(2, userName);
            ps.executeUpdate();
                System.out.println("Nạp thêm tiền thành công");
            }
            //else System.out.println("");
        }
        
        // Đóng tất cả các tài nguyên
//        rs.close();
//        ps.close();
//        conn.close();
    }    catch (Exception ex) {
            Logger.getLogger(BankDAOImpl.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public boolean CheckTaiKhoanNapTien(String userName) {

        String sql = "SELECT * FROM Bank WHERE userName ='" +userName+ "'";
        try {

            conn = new DBContext().getConnection();//mo ket noi voi sql
            ps = conn.prepareStatement(sql);
            rs = ps.executeQuery();
            while (rs.next()) {
                if (userName.equals(rs.getString("userName"))) {
                    
                    return true;
                }

            }
        //conn.close();
        } catch (Exception ex) {
        }
        
        return false;
    }
}
