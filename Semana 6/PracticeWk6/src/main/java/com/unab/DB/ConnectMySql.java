package com.unab.DB;

import java.sql.*;
import javax.swing.*;

public class ConnectMySql {

    private static Connection ConnectionDB = null;

    public Connection getConnection() {

        try {
            String url = "jdbc:mysql://localhost:3306/clase";
            String user = "crobert";
            String password = "root";
            
            ConnectionDB = DriverManager.getConnection(url,user,password);
            System.out.println("successful connect");

        } catch (Exception ex) {

            JOptionPane.showMessageDialog(null, "Error " + ex.toString());
        }

        return ConnectionDB; 
    }

}
