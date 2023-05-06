package com.letty.processor;

import java.sql.*;

public class ConnectDatabase {
    public ResultSet connectMysql(String sql) throws ClassNotFoundException, SQLException {
        Class.forName("com.mysql.jdbc.Driver");
        Connection connection = DriverManager.getConnection(
                "jdbc:mysql://192.168.17.1:3306/make_a_fortune",
                "root",
                "root"
        );
        PreparedStatement preparedStatement = connection.prepareStatement(sql);
        ResultSet resultSet = preparedStatement.executeQuery();
        return resultSet;
    }

}
