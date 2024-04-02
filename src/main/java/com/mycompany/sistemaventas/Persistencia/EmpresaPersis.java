package com.mycompany.sistemaventas.Persistencia;

import com.mycompany.sistemaventas.Logica.Empresa;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class EmpresaPersis {

    private Empresa empresa= null;
    private Conexion cn;
    private Connection con;
    private PreparedStatement ps;
    private ResultSet rs;
    
    public boolean editarEmpresa(Empresa emp){
        String sql = "UPDATE config SET nombre=?, cuil=?,telefono=?,direccion=?,razon=? WHERE id=1";
        try{
            con = cn.getConnection();
            ps = con.prepareStatement(sql);
            ps.setString(1,emp.getNombre() );
            ps.setString(2, emp.getCuil());
            ps.setString(3, emp.getTelefono());
            ps.setString(4, emp.getDireccion());
            ps.setString(5, emp.getRazonSocial());
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
    
    public Empresa obtenerEmpresa(){
        String sql = "SELECT * FROM config WHERE id=1";
        try{
            con = cn.getConnection();
            ps = con.prepareStatement(sql);
            rs = ps.executeQuery();
            if(rs.next()){
                empresa = new Empresa();
                empresa.setCuil(rs.getString("cuil"));
                empresa.setNombre(rs.getString("nombre"));
                empresa.setDireccion(rs.getString("direccion"));
                empresa.setTelefono(rs.getString("telefono"));
                empresa.setRazonSocial(rs.getString("razon"));
            }
            return empresa;
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
