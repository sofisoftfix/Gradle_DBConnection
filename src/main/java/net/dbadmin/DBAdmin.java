package net.dbadmin;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

/**
 * @user bizadmin
 */
public class DBAdmin {

    public static String getDBValue(){
        String value = null;
        Statement statement = null;
        ResultSet resultSet = null;

        try
        {
            statement = DBConnect.getInstance().getSQLConnection().createStatement();
            String selectSql = "SELECT TOP 20 tranid, dbo.stshortdescr(catid) from initialtransaction group by idtran, catid";
            resultSet = statement.executeQuery(selectSql);
            while (resultSet.next()) {
                System.out.println(resultSet.getString(1) + " " + resultSet.getString(2));
            }
        }
        catch (SQLException e) {
            e.printStackTrace();
        }

        return value;
    }

    public static void main(String[] args) throws Exception {
        DBAdmin instance = new DBAdmin();
        instance.getDBValue();
    }
}
