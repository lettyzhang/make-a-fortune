package com.letty;

import java.sql.*;

public class ConnectDatabase {
    public void connectMysql() throws ClassNotFoundException, SQLException {
        Class.forName("com.mysql.jdbc.Driver");
        Connection connection = DriverManager.getConnection(
                "jdbc:mysql://192.168.17.1:3306/make_a_fortune",
                "root",
                "root"
        );
        String sql = "select * from course";
        PreparedStatement preparedStatement = connection.prepareStatement(sql);
        ResultSet resultSet = preparedStatement.executeQuery();
        System.out.println("id" + "\t" + "title"+ "\t" + "description" + "\t" + "submission_date" + "\t" + "updated_date" + "\t" + "learn_status" );
        while (resultSet.next()) {
            System.out.print(resultSet.getString("id") + "\t");
            System.out.print(resultSet.getString("title") + "\t");
            System.out.print(resultSet.getString("description") + "\t");
            System.out.print(resultSet.getString("updated_date") + "\t");
            System.out.print(resultSet.getString("submission_date") + "\t");
            System.out.println(resultSet.getString("learn_status"));
        }
    }
}
