
package com.unab.DAO;

import com.unab.DB.ConnectMySql;
import com.unab.Entidades.Nota;
import java.sql.*;
import java.util.*;
import javax.swing.JOptionPane;

public class NotaDAO {
    
    ConnectMySql conexion = new ConnectMySql();
    Connection con = conexion.getConnection();
    
    public ArrayList<Nota> ListNota(){
        
        var list = new ArrayList<Nota>();
        String query = "{call SP_S_MOSTRARNOTA()}";
        
        try {
            CallableStatement cs = con.prepareCall(query);
            ResultSet rs = cs.executeQuery();
            
            while(rs.next()){
                Nota n = new Nota();
                n.setNombre(rs.getString("Nombre"));
                n.setApellido(rs.getString("Apellido"));
                n.setNombreMateria(rs.getString("NombreMateria"));
                n.setNota(rs.getString("nota"));
                list.add(n);
            }
        } catch (Exception ex) {
            
            JOptionPane.showMessageDialog(null, "Error" + ex.toString());
        }
        
        return list;
    }
}
