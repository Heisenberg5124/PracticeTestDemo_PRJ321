package model;

import java.sql.*;
import java.util.ArrayList;

public class MagazineDB {
    public MagazineDB() {
    }
    
    public Magazine getMagazine(String mazID) {
        Magazine magazine = null;
        try {
            Connection connection = ConnectDB.getConnection();
            String sql = "SELECT * FROM Magazine_DE140062 WHERE MazID = '" + mazID + "'";
            Statement statement = connection.createStatement();
            ResultSet resultSet = statement.executeQuery(sql);

            if (resultSet.next()) {
                String id = resultSet.getString(1);
                String title = resultSet.getString(2);
                String publisher = resultSet.getString(3);
                double price = resultSet.getDouble(4);

                magazine = new Magazine(id, title, publisher, price);
            }

            connection.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        
        return magazine;
    }

    public ArrayList<Magazine> getAll() {
        ArrayList<Magazine> magazines = new ArrayList<>();
        try {
            String sql = "SELECT * FROM Magazine_DE140062";
            Connection connection = ConnectDB.getConnection();
            Statement statement = connection.createStatement();
            ResultSet resultSet = statement.executeQuery(sql);

            while (resultSet.next()) {
                String mazID = resultSet.getString(1);
                String mazTitle = resultSet.getString(2);
                String publisher = resultSet.getString(3);
                float price = resultSet.getFloat(4);

                magazines.add(new Magazine(mazID, mazTitle, publisher, price));
            }

            connection.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }

        return magazines;
    }

    public int newMagazine(String mazID, String mazTitle, String publisher, double price) {
        int rc = 0;
        try {
            String sql = "INSERT INTO Magazine_DE140062 (MazID, MagazineTitle, Publisher, Price) VALUES (?, ?, ?, ?)";

            Connection connection = ConnectDB.getConnection();
            PreparedStatement preparedStatement = connection.prepareStatement(sql);
            preparedStatement.setString(1, mazID);
            preparedStatement.setString(2, mazTitle);
            preparedStatement.setString(3, publisher);
            preparedStatement.setDouble(4, price);
            rc = preparedStatement.executeUpdate();
            connection.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return rc;
    }
}
