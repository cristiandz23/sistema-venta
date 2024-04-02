package com.mycompany.sistemaventas.Persistencia;

import com.mycompany.sistemaventas.Logica.Proveedor;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;


public class ProveedorPersis {
    
    private Connection con;
    private Conexion cn = new Conexion();
    private PreparedStatement ps;
    private List <Proveedor> lista= null;
    private Proveedor pr;
    private ResultSet rs;
    
    public boolean registrarPorveedor(Proveedor pr){
        String sql = "INSERT INTO proveedor (cuil,nombre,telefono,direccion,razon) VALUES(?,?,?,?,?)";
        try{
        con = cn.getConnection();
        ps = con.prepareStatement(sql);
        ps.setInt(1, Integer.parseInt(pr.getCuil()));
        ps.setString(2, pr.getNombre());
        ps.setString(3, pr.getTelefono());
        ps.setString(4,pr.getDireccion());
        ps.setString(5,pr.getRazon());
        
        return ps.execute();
            
        }catch(SQLException e){
            System.out.println(e);
            return true;
        }finally{
            try{
                con.close();
            }catch(SQLException e ){
                System.out.println(e);
            }
            
        }
        
    }
    
    public List listarProveedor(){
        String sql = "SELECT * FROM proveedor";
        lista = new ArrayList();
        try{
            
            con = cn.getConnection();
            ps = con.prepareStatement(sql);
            rs = ps.executeQuery();
            while(rs.next()){
                pr = new Proveedor();
                pr.setCuil(String.valueOf(rs.getInt("cuil")));
                pr.setDireccion(rs.getString("direccion"));
                pr.setNombre(rs.getString("nombre"));
                pr.setRazon(rs.getString("razon"));
                pr.setTelefono(String.valueOf(rs.getInt("telefono")));
                pr.setId(rs.getInt("id"));       
                lista.add(pr);  
            }
            return lista;
            
        }catch(SQLException e ){
            System.out.println(e);
            return null;
        }finally{
            try{
                con.close();
            }catch(SQLException e){
                System.out.println(e);
            }
        }
        
    }

    public boolean eliminarProveedor(int id) {
        String sql = "DELETE FROM proveedor WHERE id=?";
        try{
            con = cn.getConnection();
            ps = con.prepareStatement(sql);
            ps.setInt(1, id);
            boolean es = ps.execute();
            System.out.println(es);
            return es;
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

    boolean editarProveedor(Proveedor pr) throws SQLException {
        String sql = "UPDATE proveedor SET cuil=?, nombre=?, telefono=?, direccion=?, razon=? WHERE id=?";
        try{
            con = cn.getConnection();
            ps = con.prepareStatement(sql);
            ps.setString(1, pr.getCuil());
            ps.setString(2, pr.getNombre());
            ps.setString(3, pr.getTelefono());
            ps.setString(4, pr.getDireccion());
            ps.setString(5, pr.getRazon());
            ps.setInt(6, pr.getId());
            return ps.execute();
            
        }catch(SQLException e){
            System.out.println(e);
            return true;
        }finally{
            con.close();
        }
    }

    
    public boolean verificarProveedor(String cuil){
        String sql = "SELECT * FROM proveedor WHERE cuil=?";
        try{
            con = cn.getConnection();
            ps = con.prepareStatement(sql);
            ps.setString(1,cuil);
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
