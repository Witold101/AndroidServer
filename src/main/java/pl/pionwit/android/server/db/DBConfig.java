package pl.pionwit.android.server.db;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DBConfig {

    private static final String URL_JDBC = "jdbc:mysql://localhost:3306/pionwit_db?useSSL=false";
    private static final String PASWORD = "wertywerty101";
    private static final String USER = "root";

    private static Connection connection;

    public static Connection init() throws SQLException, ClassNotFoundException, IllegalAccessException, InstantiationException {
        Class.forName("com.mysql.jdbc.Driver").newInstance();
        connection = DriverManager.getConnection(URL_JDBC,USER,PASWORD);
        return connection;
    }

    public static void close() throws SQLException {
        if (connection!=null) {
            connection.close();
        }
    }

}
