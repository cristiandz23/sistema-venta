
package com.mycompany.sistemaventas.Persistencia;

import com.mycompany.sistemaventas.Logica.Cliente;
import com.mycompany.sistemaventas.Logica.DetalleVenta;
import com.mycompany.sistemaventas.Logica.Empresa;
import com.mycompany.sistemaventas.Logica.Login;
import com.mycompany.sistemaventas.Logica.Producto;
import com.mycompany.sistemaventas.Logica.Proveedor;
import com.mycompany.sistemaventas.Logica.Venta;
import java.sql.SQLException;
import java.util.List;
import org.jfree.data.general.DefaultPieDataset;

    
    
public class ControladoraPersistencia {
    ClientePersis cliPersis = new ClientePersis();
    LoginPersis login = new LoginPersis();
    ProveedorPersis proPersis = new ProveedorPersis();
    ProductoPersis prodPersis = new ProductoPersis();
    VentaPersis ventaPersis = new VentaPersis();
    EmpresaPersis emprePersis = new EmpresaPersis();
    
    public ControladoraPersistencia() {
    }
    //LOGEAR
    public Login log(String correo, String pass) {
        return login.log(correo, pass);
    }
    //REIGSTRAR USUARIO
    public boolean registrarUsuario(Login log){
        return login.registrarUsuario(log);
    }
    //CRUD PARA CLIENTE
    public boolean registrarCliente(Cliente cli) {
        return cliPersis.registrarCliente(cli);
    }
    
    public boolean eliminarCliente(int id){
        return cliPersis.eliminarCliente(id);
    }
    
    public boolean editarCliente(Cliente cl){
        return cliPersis.editarCliente(cl);
    }
    
    public List listarClientes(){
        return  cliPersis.listarClientes();
    }
    public boolean verificarCliente(String dni){
        return cliPersis.verificarCliente(dni);
    }
    
    //CRUD PARA PROVEEDOR
    public boolean registrarProveedor(Proveedor pr){
        return proPersis.registrarPorveedor(pr);
    }
    
    public List listarProveedor(){
        return proPersis.listarProveedor();
    }

    public boolean eliminarProveedor(int id) {
        return proPersis.eliminarProveedor(id);
    }

    public boolean editarProveedor(Proveedor pr) throws SQLException {
        return proPersis.editarProveedor(pr);
    }
    public boolean verificarProveedor(String cuil){
        return proPersis.verificarProveedor(cuil);
    }
    
    
    //CRUD PARA PRODUCTOS
    
    public boolean guardarProducto(Producto pro){
        return prodPersis.guardarProducto(pro);
    }
    public List listarProductos(){
        return prodPersis.listarProducto();    
    }
     public boolean editarProducto(Producto prod){
        return prodPersis.editarProducto(prod);
    }

    public Producto buscarProducto(int codigo) {
        return prodPersis.buscarProducto(codigo);
    }

    public void eliminarProducto(int id) {
        prodPersis.eliminarProducto(id);
    }
    
    
    public Cliente buscarCliente(String dni){
        return cliPersis.buscarCliente(dni);
    }

    public boolean registrarVenta(Venta venta) {
        return ventaPersis.registrarVenta(venta);
    }

    public boolean registrarDetalle(DetalleVenta detalle) {
        return ventaPersis.registrarDetalle(detalle);
    }

    public int obtenerIdUltimaVenta() {
        return ventaPersis.obtenerIdUltimaVenta();
    }

    public boolean actualizarProducto(Producto producto) {
        return prodPersis.actualizarStock(producto);
    }

    public List<Venta> listarTablaVentas() {
        return ventaPersis.listarTablaVentas();
    }
    
    public DefaultPieDataset datasetVentas(String fecha){
        return ventaPersis.datasetVentas(fecha);
    }

    public void editarEmpresa(Empresa empresa) {
        emprePersis.editarEmpresa(empresa);
    }
    
}
