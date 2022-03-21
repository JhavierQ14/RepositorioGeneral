package com.unab.DB;

import java.sql.*;
import javax.swing.*;

public class ConnectMySql {

    private static Connection ConnectionDB = null;

    public Connection getConnection() {

        try {
            String url = "jdbc:mysql://localhost:3306/clase";
            String user = "Vasquez";
            String password = "root";
            
            ConnectionDB = DriverManager.getConnection(url,user,password);
            System.out.println("successful connect");

        } catch (Exception ex) {

            JOptionPane.showMessageDialog(null, "Error " + ex.toString());
        }

        return ConnectionDB; 
    }

    public CallableStatement prepareCall(String call_SP_S_MOSTRARNOTAS) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

}
