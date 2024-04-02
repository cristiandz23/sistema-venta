
package com.mycompany.sistemaventas.Persistencia;

import com.mycompany.sistemaventas.Logica.Producto;
import com.mycompany.sistemaventas.Logica.Proveedor;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;


public class ProductoPersis {
    
    private Connection con;
    private Conexion cn = new Conexion();
    private PreparedStatement ps;
    private ResultSet rs;
    private Producto producto  = null;
    Proveedor proveedor = null;
    //GUARDAR PRODUCTO
    public boolean guardarProducto(Producto pro){
        String sql = "INSERT INTO productos (codigo,descripcion,id_proveedor,stock,precio) VALUES (?,?,?,?,?)";
        try{
            con = cn.getConnection();
            ps = con.prepareCall(sql);
            ps.setInt(1, pro.getCodigo());
            ps.setString(2, pro.getDescripcion());
            ps.setInt(3, pro.getProveedor().getId());
            ps.setInt(4, pro.getStock());
            ps.setDouble(5, pro.getPrecio());
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
    //LISTAR PRODUCTO
    public List listarProducto(){
        List<Producto> productos = new ArrayList();
        
        String sql = "SELECT prov.id,prov.cuil,prov.nombre as nombre_proveedor,prov.telefono,"
                + "prov.direccion,prov.razon,prod.id,   prod.codigo,prod.descripcion as nombre_producto,"
                + "prod.stock,prod.precio FROM productos prod JOIN proveedor prov ON prov.id=prod.id_proveedor;";
        try{
            con = cn.getConnection();
            ps = con.prepareStatement(sql);
            rs = ps.executeQuery();
            while (rs.next()){
                proveedor = new Proveedor();
                producto = new Producto();
                proveedor.setId(rs.getInt(1));
                proveedor.setCuil(rs.getString(2));
                proveedor.setNombre(rs.getString(3));  
                proveedor.setTelefono(rs.getString(4));
                proveedor.setDireccion(rs.getString(5));
                proveedor.setRazon(rs.getString(6));
                producto.setId(rs.getInt(7));
                producto.setCodigo(rs.getInt(8));
                producto.setDescripcion(rs.getString(9));
                producto.setStock(rs.getInt(10));
                producto.setPrecio(rs.getDouble(11));               
                producto.setProveedor(proveedor);
                productos.add(producto);
               
            }     
            return productos;
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
    }
    //EDITAR PRODUCTO
    public boolean editarProducto(Producto prod){
        String sql = "UPDATE productos SET codigo=?,descripcion=?,stock=?,precio=?,id_proveedor=? WHERE id=?";
        try{
            con = cn.getConnection();
            ps = con.prepareStatement(sql);
            ps.setInt(1, prod.getCodigo());
            ps.setString(2, prod.getDescripcion());
            ps.setInt(3, prod.getStock());
            ps.setDouble(4, prod.getPrecio());
            ps.setInt(5, prod.getProveedor().getId());
            ps.setInt(6, prod.getId());
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
    //BUSCAR PRODUCTO POR CODIGO
    public Producto buscarProducto(int codigo){
        producto = new Producto();
        System.out.println(producto);
        String sql = "SELECT * FROM productos WHERE codigo=?";
        try{
            con = cn.getConnection();
            ps = con.prepareStatement(sql);
            ps.setInt(1, codigo);
            rs = ps.executeQuery();
            if(rs.next()){
                producto.setId(rs.getInt("id"));
                producto.setCodigo(rs.getInt("codigo"));
                producto.setDescripcion(rs.getString("descripcion"));
                producto.setPrecio(rs.getDouble("precio"));
                producto.setStock(rs.getInt("stock"));
            }
            return producto;
        }catch(SQLException e){
            System.out.println(e);
            return null;
        }finally{
            try{
                con.close();
            }catch(SQLException e){
                System.out.println(e.toString());
            }
        }
        
    }
    //ELIMINAR PRODUCTO
    void eliminarProducto(int id) {
        String sql = "DELETE FROM productos WHERE id=?";
        try{
            con = cn.getConnection();
            ps = con.prepareStatement(sql);
            ps.setInt(1, id);
            ps.execute();
        }catch(SQLException e){
            System.out.println(e);
        }finally{
            try{
                con.close();
            }catch(SQLException e){
                System.out.println(e);
            }
        }
    } 
    //ACTUALIZAR STOCK DE PRODUCTO
    public boolean actualizarStock(Producto pro){
        String sql = "UPDATE productos SET stock=?  WHERE codigo=?";
        try{
            con = cn.getConnection();
            ps = con.prepareStatement(sql);
            ps.setInt(1, pro.getStock());
            ps.setInt(2, pro.getCodigo());
            return ps.execute();
        }catch(SQLException e){
            System.out.println(e);
            return true;
        }finally{
            try{
                con.close();
            }catch(SQLException e){
                System.out.println(e);
            }
        }
    }
    
}
