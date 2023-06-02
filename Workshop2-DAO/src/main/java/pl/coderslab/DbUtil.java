package pl.coderslab;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DbUtil {
    private static final String DB_URL = "jdbc:mysql://localhost:3306/";

    private static final String DB_PARAMS = "?useSSL=false&characterEncoding=utf8&serverTimezone=UTC";
    private static final String DEFAULT_DB_NAME = "worksho2";
    private static final String DB_USER = "root";
    private static final String DB_PASSWORD = "coderslab";

    public static Connection connect() throws SQLException {
        return connect(DEFAULT_DB_NAME);

    }

    public static Connection connect(String dbName) throws SQLException {
        String fullUrl = DB_URL + dbName + DB_PARAMS;

        return DriverManager.getConnection(
                fullUrl,
                DB_USER,
                DB_PASSWORD
        );
    }
}
