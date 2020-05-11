package net.dbadmin;

import java.sql.Connection;
import java.sql.DriverManager;

/**
 * @user bizadmin
 */
public class SqlDatabase {
    private java.sql.Connection con = null;
    private final String url = "jdbc:sqlserver://";
    private final String serverName = "DESKTOP5354";
    private final String portNumber = "1433";
    private final String databaseName = "LOCALBANK";
    private final String userName = "user1";
    private final String password = "qwerty";

    public SqlDatabase() {
    }

    private String getConnectionUrl() {

        return url + serverName + ":" + portNumber + ";databaseName=" + databaseName;
    }

    private java.sql.Connection getConnection() {
        try {
            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
            con = java.sql.DriverManager.getConnection(getConnectionUrl(), userName, password);
            if (con != null) {
                System.out.println("Connection Successful!");
            }
        } catch (Exception e) {
            e.printStackTrace();
            System.out.println("Error Trace in getConnection() : " + e.getMessage());
        }
        return con;
    }

    public void Disconnect() {
        try {
            if (con != null) {
                con.close();
            }
          con = null;
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public Connection Connect()
    {
       return this.getConnection();
    }
}