package com.unab.DB;

import java.sql.*;
import javax.swing.*;

public class ConnectMySql {

    private static Connection ConnectionDB = null;

    public Connection getConnection() {

        try {
            String url = "jdbc:mysql://localhost:3306/BD";
            String user = "root";
            String password = "root";
            
            ConnectionDB = DriverManager.getConnection(url,user,password);

        } catch (Exception ex) {

            JOptionPane.showMessageDialog(null, "Error " + ex.toString());
        }

        return ConnectionDB; 
    }

}
