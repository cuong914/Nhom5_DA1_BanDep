package utility;

import java.sql.*;


public class DBConnect {
  static String url = "jdbc:sqlserver://;serverName=NGUYENHIEP;databaseName=DuAn1";
    static String username = "sa";
    static String password = "hien";

    public static Connection getConnection() throws SQLException {
        return DriverManager.getConnection(url, username, password);
    }

    public static void main(String[] args) throws SQLException {
        getConnection();
    }

}
