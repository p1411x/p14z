package DAO;

import connect.DBContext;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import model.Drinks;

/**
 *
 * @author SAD
 */
public class DrinkDAOImpl implements DrinkDAO {

    Connection conn = null;
    PreparedStatement ps = null;
    ResultSet rs = null;

    @Override
    public boolean checkDrink(String nameDrink) {

        String sql = "SELECT * FROM Movie WHERE idMovie ='" + nameDrink + "'";
        try {

            conn = new DBContext().getConnection();//mo ket noi voi sql
            ps = conn.prepareStatement(sql);
            rs = ps.executeQuery();
            while (rs.next()) {
                if (nameDrink.equals(rs.getString(1))) {

                    return true;
                }

            }

        } catch (Exception ex) {
        }
        return false;
    }

    @Override
    public void addDrink(Drinks drink) {
        String sql
                = "INSERT INTO [dbo].[Drink]\n"
                + "           ([nameDrink]\n"
                + "           ,[priceDrink])\n"
                + "     VALUES (?,?)";

        try {
            //conn = new DBContext().getConnection();
            PreparedStatement ps = conn.prepareStatement(sql);
            ps.setString(1, drink.getNameDrink());
            ps.setFloat(2, drink.getPriceDrink());
            ps.executeUpdate();
        } catch (SQLException e) {

        }
    }

    public void deleteDrink(String nameDrink) {
        String sql = "DELETE FROM [dbo].[Drink] WHERE [nameDrink] = ?";

        try {
            PreparedStatement ps = conn.prepareStatement(sql);
            ps.setString(1, nameDrink);
            ps.executeUpdate();
        } catch (SQLException e) {

        }
    }

    @Override
    public void showAllDrink() {
      String sql = "SELECT * FROM Drink";
            try {
            conn = new DBContext().getConnection();//mo ket noi voi sql
            ps = conn.prepareStatement(sql);
            rs = ps.executeQuery();
            while(rs.next()){
                System.out.println(new Drinks(rs.getString(1), rs.getFloat(2)));
            }
        } catch (Exception e) {
        }
    }

    @Override
    public void updateDrink(Drinks drinks) {
         String sql = "UPDATE [dbo].[Drink]\n"
                + "  SET     "
                + "           [priceDrink] = ?\n"
                + "    Where [nameDrink] = ?";
              try {
            //conn = new DBContext().getConnection();
            PreparedStatement ps = conn.prepareStatement(sql);
            ps.setString(2, drinks.getNameDrink());
            ps.setFloat(1, drinks.getPriceDrink());
            ps.executeUpdate();
        } catch (SQLException e) {

        }
    }
}
