package model;

import java.sql.Connection;
import java.sql.DriverManager;

public class ConnectDB implements DatabaseInfo {
    public static Connection getConnection() {
        Connection connection = null;

        try {
            Class.forName(driverName);
            connection = DriverManager.getConnection(dbURL, dbUser, dbPass);
            System.out.println("Connect database successful");
        } catch (Exception e) {
            System.out.println("Failure");
            e.printStackTrace();
        }

        return connection;
    }
}
