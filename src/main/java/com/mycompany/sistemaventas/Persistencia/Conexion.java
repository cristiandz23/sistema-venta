
package com.mycompany.sistemaventas.Persistencia;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;


public class Conexion {
    
    Connection con;
    public Connection getConnection(){
        try{
            String myDB = "jdbc:mysql://localhost:3306/sistemaventa?serverTimeZone=utc";
            con = DriverManager.getConnection(myDB,"root","");
            return con;
        }catch(SQLException e){
            System.out.println(e.toString());
        }
        return null;
    }
    
}
