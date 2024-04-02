
package com.mycompany.sistemaventas.Persistencia;

import com.mycompany.sistemaventas.Logica.Login;
import com.mycompany.sistemaventas.Persistencia.Conexion;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;


public class LoginPersis {

    public LoginPersis() {
    }
    
    Connection con;
    PreparedStatement ps ;
    ResultSet rs;
    Conexion cn= new Conexion();
    public Login log(String correo,String pass){
        Login l= new Login();
        String sql="SELECT * FROM usuarios WHERE correo = ? AND pass =?";
        try{
            con=cn.getConnection();
            ps = con.prepareStatement(sql);
            ps.setString(1,correo);
            ps.setString(2,pass);
            rs = ps.executeQuery();
            if(rs.next()){
                l.setId(rs.getInt("id"));
                l.setCorreo(rs.getString("correo"));
                l.setNombre(rs.getString("nombre"));
                l.setPass(rs.getString("pass"));
                l.setRol(rs.getString("rol"));
            }
            return l;
        }catch(SQLException e){
            System.out.println(e.toString());
            return null;
        }finally{
            try{
                con.close();
            }catch(SQLException e){
                System.out.println(e);
            }
        }
        
    }
    
    public boolean registrarUsuario(Login log){
        String sql = "INSERT INTO usuarios (nombre,correo,pass,rol) VALUES (?,?,?,?)";
        try{
            con = cn.getConnection();
            ps = con.prepareStatement(sql);
            ps.setString(1, log.getNombre());
            ps.setString(2, log.getCorreo());
            ps.setString(3, log.getPass());
            ps.setString(4, log.getRol());
            ps.execute();
            return true;
        }catch(SQLException e){
            System.out.println(e);
            return false;
        }
    }
    
}

