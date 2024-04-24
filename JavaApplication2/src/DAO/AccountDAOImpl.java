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

import model.Account;

/**
 *
 * @author SAD
 */
public class AccountDAOImpl implements AccountDAO {

    Connection conn = null;
    PreparedStatement ps = null;
    ResultSet rs = null;
    
    @Override
    public boolean CheckAccount(String userName ,String passWord) {
        String sql="SELECT * FROM Account WHERE userName ='"+userName+"'and passWord='"+passWord+"'" ;
        try {
            
            conn = new DBContext().getConnection();//mo ket noi voi sql
            ps = conn.prepareStatement(sql);
            rs = ps.executeQuery();
            while (rs.next()) {
                if(userName.equals(rs.getString(1)) && passWord.equals(rs.getString(2))){
                   
                    return true;
                }
              
            }

        } catch (Exception ex) {

        }
        return false;
    }
    public boolean CheckAccount(String userName ) {
        String sql="SELECT userName FROM Account WHERE userName ='"+userName+"'" ;
        try {
//            PreparedStatement ps = cons.prepareStatement(sql);
//            ResultSet rs = ps.executeQuery();
            conn = new DBContext().getConnection();//mo ket noi voi sql
            ps = conn.prepareStatement(sql);
            rs = ps.executeQuery();
            while (rs.next()) {
                if(userName.equals(rs.getString(1))){
                    return true;
                }
                
            }

        } catch (Exception ex) {
            Logger.getLogger(MovieDAOImpl.class.getName()).log(Level.SEVERE, null, ex);
        }
        return false;
    }

    
    @Override
    public void AddAccount(Account acc) {
        String sql = "INSERT INTO [dbo].[Account]\n"
                + "           ([userName]\n"
                + "           ,[passWord])\n"
                + "     VALUES (?,?)";
       
        try {
            PreparedStatement ps = conn.prepareStatement(sql);
            ps.setString(1, acc.getUserName());
            ps.setString(2, acc.getPassWord()) ;
            ps.executeUpdate();
        } catch (SQLException e) {
            
        }
    }

}
