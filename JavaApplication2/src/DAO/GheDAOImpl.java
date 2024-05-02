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
public class GheDAOImpl implements  GheDAO{

    Connection conn = null;
    PreparedStatement ps = null;
    ResultSet rs = null;

    public boolean checkGhe(String maSoGhe) {

        String sql = "SELECT * FROM Ghe WHERE maSoGhe ='" + maSoGhe + "'";
        try {

            conn = new DBContext().getConnection();//mo ket noi voi sql
            ps = conn.prepareStatement(sql);
            rs = ps.executeQuery();
            while (rs.next()) {
                if (maSoGhe.equals(rs.getString(1))) {

                    return true;
                }

            }

        } catch (Exception e) {
            e.printStackTrace();
        }
        return false;
    }

    public void addGhe(String maSoGhe) {
        String sql
                = "INSERT INTO [dbo].[Ghe]\n"
                + "           ([maSoGhe])\n"
                + "     VALUES (?)";

        try {
            //conn = new DBContext().getConnection();
            PreparedStatement ps = conn.prepareStatement(sql);
            ps.setString(1, maSoGhe);

            ps.executeUpdate();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void deleteGhe(String maSoGhe) {
        String sql = "DELETE FROM [dbo].[Ghe] WHERE [maSoGhe] = ?";

        try {
            PreparedStatement ps = conn.prepareStatement(sql);
            ps.setString(1, maSoGhe);
            ps.executeUpdate();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

}
