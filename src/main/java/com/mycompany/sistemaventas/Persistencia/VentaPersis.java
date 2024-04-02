
package com.mycompany.sistemaventas.Persistencia;

import com.mycompany.sistemaventas.Logica.Cliente;
import com.mycompany.sistemaventas.Logica.DetalleVenta;
import com.mycompany.sistemaventas.Logica.Login;
//import com.mycompany.sistemaventas.Logica.Producto;
import com.mycompany.sistemaventas.Logica.Venta;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import org.jfree.data.general.DefaultPieDataset;

public class VentaPersis {
    //private DetalleVenta detalle = new DetalleVenta();
    private Login vendedor=null;
    private Cliente cliente=null;
    private Venta venta = new Venta();
    private Connection con;
    private Conexion cn = new Conexion();
    private PreparedStatement ps;
    private ResultSet rs;
    //REGISTRAR UNA VENTA
    public boolean registrarVenta(Venta venta){
        String sql = "INSERT INTO ventas (total,id_cliente,id_vendedor,fecha) VALUES(?,?,?,?)";
        try{
            con = cn.getConnection();
            ps = con.prepareStatement(sql);
            ps.setDouble(1, venta.getTotal());
            ps.setInt(2, venta.getCliente().getId());
            ps.setInt(3, venta.getVendedor().getId());
            ps.setString(4, venta.getFecha());
            return ps.execute()==false;
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
    
    public int obtenerIdUltimaVenta(){
        int idMax;
        String sql = "SELECT MAX(id) FROM ventas";
        try{
            con = cn.getConnection();
            ps = con.prepareStatement(sql);
            rs = ps.executeQuery();
            if(rs.next()){
                idMax=rs.getInt(1);
                return idMax;
            }
        }catch(SQLException e){
            System.out.println("es"+e);
            return 0;
        }finally{
            try{
                con.close();
            }catch(SQLException e){
                System.out.println(e);
            }
        }
        return 0;
        
    }
  
    public boolean registrarDetalle(DetalleVenta detalle) {
        String sql="INSERT INTO detalle (cod_pro,cantidad,id_venta) VALUES (?,?,?)";
        try{
            con = cn.getConnection();
            ps = con.prepareStatement(sql);
            ps.setInt(1, detalle.getProducto().getCodigo());
            ps.setInt(2, detalle.getCanttidad());
            ps.setInt(3, detalle.getVenta().getId());
            return ps.execute();
        }catch(SQLException e){
            System.out.println("esete"+e);
            return true;
        }finally{
            try{
                con.close();
            }catch(SQLException e){
                System.out.println(e);
            }
        }
    }
    
    public List listarTablaVentas(){
        List<Venta> listaVentas = new ArrayList();
        String sql = "SELECT ventas.id,clientes.nombre AS cliente,usuarios.nombre AS vendedor,ventas.total FROM "
                + "ventas JOIN clientes JOIN usuarios ON id_cliente=clientes.id AND id_vendedor=usuarios.id;";
        try{
            con = cn.getConnection();
            ps = con.prepareCall(sql);
            rs = ps.executeQuery();
            while(rs.next()){
            venta = new Venta();
            cliente = new Cliente();
            vendedor = new Login();
            venta.setId(rs.getInt(1));
            cliente.setNombre(rs.getString(2));
            vendedor.setNombre(rs.getString(3));
            venta.setTotal(rs.getDouble(4));
            venta.setVendedor(vendedor);
            venta.setCliente(cliente);
            listaVentas.add(venta); 
            }
            return listaVentas;
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
    
    public DefaultPieDataset datasetVentas(String fecha){
        String sql = "SELECT total FROM ventas WHERE fecha=?";
        try{
            DefaultPieDataset dataSet = new DefaultPieDataset(); 
            con = cn.getConnection();
            ps = con.prepareStatement(sql);
            ps.setString(1, fecha);
            rs = ps.executeQuery();
            dataSet=null;
            while(rs.next()){
                dataSet.setValue(rs.getString("total"), rs.getDouble("total"));
            }
            return dataSet;
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
    
}
