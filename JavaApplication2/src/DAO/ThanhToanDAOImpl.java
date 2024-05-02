/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DAO;

import connect.DBContext;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

/**
 *
 * @author SAD
 */
public class ThanhToanDAOImpl {
        Connection conn = null;
    PreparedStatement ps = null;
    ResultSet rs = null;
    public boolean checkTinhTrangThanhToan(String seat,String idMovie) {

        String sql = "SELECT * FROM Tickets WHERE seat ='" +seat+ "'and idMovie ='" +idMovie+"' ";
        try {

            conn = new DBContext().getConnection();//mo ket noi voi sql
            ps = conn.prepareStatement(sql);
            rs = ps.executeQuery();
            while (rs.next()) {
                Integer isPresent =rs.getInt("isPresent");
                if(isPresent == 1){
                    return true;
                }
            }
        //conn.close();
        } catch (Exception ex) {
        }
        
        return false;
    }
}
