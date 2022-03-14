
package com.unab.DAO;

import com.unab.DB.ConnectMySql;
import com.unab.Entidades.Estudiante;
import java.sql.*;
import java.util.*;
import javax.swing.JOptionPane;


public class Estudiantes {

    ConnectMySql con = new ConnectMySql();
    Connection conexion = con.getConnection();

    public ArrayList<Estudiante> listar() /*throws SQLException*/ {

        ArrayList<Estudiante> listado = null;

        try {
            listado = new ArrayList<Estudiante>();
            CallableStatement cd = conexion.prepareCall("Select * from Estudiante");
            ResultSet resultado = cd.executeQuery();

            while (resultado.next()) {
                Estudiante es = new Estudiante();
                es.setNombre(resultado.getString("Nombre"));
                es.setApellido(resultado.getString("Apellido"));
                listado.add(es);
            }

        } 
        catch (Exception e) {
            System.out.println(e.toString());
        }
        
        return listado;

    }
    
    public void AddStudent(Estudiante est){
        
        try{
            CallableStatement cb = conexion.prepareCall("insert into "+"estudiante (Nombre,Apellido) values('"+est.getNombre()+"','"+est.getApellido()+"')");       
            cb.execute();
                  
            JOptionPane.showMessageDialog(null, "Estudiante Agregado","Mensaje sistema",1);
        }
        catch(Exception ex){
            
            JOptionPane.showMessageDialog(null, "Error" + ex.toString());
        }
    }
}