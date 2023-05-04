package org.example;

import com.letty.ConnectDatabase;

import java.sql.*;

public class Main {
    public static void main(String[] args) throws ClassNotFoundException, SQLException {
        ConnectDatabase connectDatabase = new ConnectDatabase();
        connectDatabase.connectMysql();
    }
}