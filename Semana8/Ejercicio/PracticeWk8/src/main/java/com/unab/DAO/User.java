/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.unab.DAO;
import com.unab.DB.ConnectMySql;
import com.unab.Entidades.Estudiante;
import java.sql.*;
import javax.swing.JOptionPane;
import javax.swing.text.StyledEditorKit;

public class User {
    
    ConnectMySql con = new ConnectMySql();
    Connection conexion = con.getConnection();
    
    boolean com = false;
    
    public boolean Acceso(Estudiante student){
        
        String consulta =  "{call clase.Validacion(?,?)}";
        
        try {
            CallableStatement Consul = conexion.prepareCall(consulta);
             Consul.setString("PUser", student.getUsername());
            Consul.setString("Ppass",  student.getPass());
            
            ResultSet rs = Consul.executeQuery();
            if (rs.next()) {
                
                com = true;
                return  com;
            }
            
        } catch (Exception ex) {
            
            JOptionPane.showMessageDialog(null, "Error" + ex.toString());
        }
        return com;
    }
            
}
