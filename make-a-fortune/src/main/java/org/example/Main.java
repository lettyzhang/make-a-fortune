package org.example;

import com.letty.processor.ConnectDatabase;
import com.letty.ui.HomePage;

import java.io.IOException;
import java.sql.*;

public class Main {
    public static void main(String[] args) throws ClassNotFoundException, SQLException, IOException {
        HomePage homePage = new HomePage();
        homePage.generateHomePage();
    }
}