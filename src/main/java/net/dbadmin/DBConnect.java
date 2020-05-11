package net.dbadmin;


import java.sql.Connection;
import java.util.Objects;

/**
 * @user bizadmin
 */
public class DBConnect {
    private static DBConnect instance;

    public Connection getSQLConnection()
    {
        SqlDatabase sqldb = new SqlDatabase();
        return sqldb.Connect();

    }

    public static DBConnect getInstance() {
       instance = new DBConnect();
        return instance;
    }
}
