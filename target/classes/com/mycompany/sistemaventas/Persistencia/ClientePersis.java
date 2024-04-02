
package com.mycompany.sistemaventas.Persistencia;

import com.mycompany.sistemaventas.Logica.Cliente;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;


public class ClientePersis {
    
    Conexion cn = new Conexion();
    Connection con;
    PreparedStatement ps;
    ResultSet rs;
    
    public boolean registrarCliente(Cliente cli){
        String sql = "INSERT INTO clientes (dni, nombre, telefono, direccion, razon) VALUES (?,?,?,?,?)";
        try{
            con = cn.getConnection();
            ps = con.prepareStatement(sql);            
            ps.setInt(1, Integer.parseInt(cli.getDni()));
            ps.setString(2,cli.getNombre());
            ps.setString(3,cli.getTelefono());
            ps.setString(4,cli.getDireccion());
            ps.setString(5,cli.getRazon());
            ps.execute();
            return true;
        }catch(SQLException e){
            System.out.println(e);
            return false;
        }finally{
            try{
                con.close();
            }catch(SQLException e){
                System.out.println(e);
            }
        }
    }
    
    public List listarClientes(){   
        List <Cliente> listaCliente = new ArrayList();        
        String sql = "SELECT * FROM clientes";
        try{
            con = cn.getConnection();
            ps = con.prepareStatement(sql);
            rs = ps.executeQuery();
            while(rs.next()){
                Cliente cl= new Cliente();
                cl.setId(rs.getInt("id"));
                cl.setDni(String.valueOf(rs.getInt("dni")));
                cl.setNombre(rs.getString("nombre"));
                cl.setTelefono(String.valueOf(rs.getString("telefono")));
                cl.setDireccion(rs.getString("direccion"));
                cl.setRazon(rs.getString("razon"));
                
                listaCliente.add(cl);
            }
            
        }catch(SQLException e){
            System.out.println(e);
        }finally{
            try{
                con.close();
            }catch(SQLException e){
                System.out.println(e);
            }
        }
        
        return (List)listaCliente;
    }
    
    public boolean eliminarCliente(int id){
        String sql = "DELETE FROM clientes WHERE `clientes`.`id` = ?";
        try{
            con = cn.getConnection();
            ps = con.prepareStatement(sql);           
            ps.setInt(1, id);
            ps.execute();
            return true;
        }catch(SQLException e){
            System.out.println(e);
            return false;
        }finally{
            try{
                con.close();
            }catch(SQLException e){
                System.out.println(e);
                return false;
            }
        }
    }
    
    public boolean editarCliente(Cliente cl){
        String sql = "UPDATE clientes SET dni=?, nombre=?, direccion=?, telefono=?, razon=? WHERE id=?";
        try{
            con = cn.getConnection();
            ps = con.prepareStatement(sql);
            ps.setInt(1, Integer.parseInt(cl.getDni()));
            ps.setString(2, cl.getNombre());
            ps.setString(3, cl.getDireccion());
            ps.setString(4,cl.getTelefono());
            ps.setString(5, cl.getRazon());
            ps.setInt(6, cl.getId());
            return ps.execute();
        }catch(SQLException e){
            System.out.println(e);
            return false;
        }finally{
            try{
                con.close();
            }catch(SQLException e){
                System.out.println(e);
            }
        }  
    }
    
    public Cliente buscarCliente(String dni){
        String sql = "SELECT * FROM clientes WHERE dni=?";
        Cliente cl = new Cliente();
        try{
            con = cn.getConnection();
            ps = con.prepareStatement(sql);
            ps.setInt(1, Integer.parseInt(dni));
            rs = ps.executeQuery();
            if(rs.next()){
               cl.setId(rs.getInt("id"));
               cl.setNombre(rs.getString("nombre"));
               cl.setTelefono(rs.getString("telefono"));
               cl.setDireccion(rs.getString("direccion"));
               cl.setRazon(rs.getString("razon"));
               return cl;
            }
        }catch(SQLException e){
            System.out.println(e);
            return null;
        }finally{
            try{
                con.close();
            }catch(SQLException e){
                System.out.println(e);
            }
        }
        return null;
    }
    public boolean verificarCliente(String dni){
        String sql = "SELECT * FROM clientes WHERE dni=?";
        try{
            con = cn.getConnection();
            ps = con.prepareStatement(sql);
            ps.setString(1,dni);
            rs = ps.executeQuery();
            if(rs.next()){
               return true;
            }
        }catch(SQLException e){
            System.out.println(e);
            return false;
        }finally{
            try{
                con.close();
            }catch(SQLException e){
                System.out.println(e);
            }
        }
        return false;
    }
}
