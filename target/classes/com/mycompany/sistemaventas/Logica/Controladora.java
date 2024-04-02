package com.mycompany.sistemaventas.Logica;

import com.mycompany.sistemaventas.Persistencia.ControladoraPersistencia;
import java.sql.SQLException;
import java.util.List;
import org.jfree.chart.ChartFactory;
import org.jfree.chart.ChartFrame;
import org.jfree.chart.JFreeChart;
import org.jfree.data.general.Dataset;

public class Controladora {

    ControladoraPersistencia controlPersis = new ControladoraPersistencia();

    //MANEJADOR DEL LOGUIN
    public Login log(String correo, String pass) {
        return controlPersis.log(correo, pass);
    }
    //REGISTRAR USUARIO
    public boolean registrarUsuario(Login log){
        return controlPersis.registrarUsuario(log);
    }

    //MANEJADOR DE CLIENTE
    public boolean registrarCliente(Cliente cli) {
        return controlPersis.registrarCliente(cli);
    }

    public boolean eliminarCliente(int id) {
        return controlPersis.eliminarCliente(id);
    }

    public boolean editarCliente(Cliente cl) {
        return controlPersis.editarCliente(cl);
    }

    public List listarClientes() {
        return controlPersis.listarClientes();
    }
    public boolean verificarCliente(String dni){
        return controlPersis.verificarCliente(dni);
    }

    //FUNCIONES DE PROVEEDOR
    public boolean registrarProveedor(Proveedor pr) {
        return controlPersis.registrarProveedor(pr);
    }

    public List listarProveedor() {
        return controlPersis.listarProveedor();
    }

    public boolean eliminarProveedor(int id) {
        return controlPersis.eliminarProveedor(id);
    }

    public boolean editarProveedor(Proveedor pr) throws SQLException {
        return controlPersis.editarProveedor(pr);
    }

    public boolean verificarProveedor(String cuil){
        return controlPersis.verificarProveedor(cuil);
    }
    //FUNCIONES PRODUCTOS
    public boolean guardarProductos(Producto pro) {
        return controlPersis.guardarProducto(pro);
    }

    public List listarProducto() {
        return controlPersis.listarProductos();
    }

    public boolean editarProducto(Producto prod) {
        return controlPersis.editarProducto(prod);
    }

    public void eliminarProducto(int id) {
        controlPersis.eliminarProducto(id);
    }

    public Producto buscarProducto(int codigo) {
        return controlPersis.buscarProducto(codigo);
    }
    
    public boolean verificarProducto(int codigo){
        if(controlPersis.buscarProducto(codigo).getCodigo()!=0){
            return true;//retorna true si el producto ya existe en base de datos
        }else{
            return false;//retorna false si el producto no esta en base de datos
        }
    }

    public Cliente buscarCliente(String dni) {
        return controlPersis.buscarCliente(dni);
    }

    public boolean registrarVenta(Venta venta) {
        return controlPersis.registrarVenta(venta);
    }

    public void registrarDetalle(DetalleVenta detalle) {
        controlPersis.registrarDetalle(detalle);
    }

    public int obtenerIdUltimaVenta() {
        return controlPersis.obtenerIdUltimaVenta();
    }

    public boolean actualizarStock(Producto producto) {
        return controlPersis.actualizarProducto(producto);
    }

    public List<Venta> listarTablaVentas() {
        return controlPersis.listarTablaVentas();
    }

    public boolean graficoVentas(String fecha) {
        Dataset datos = controlPersis.datasetVentas(fecha);
        if (datos != null) {
            JFreeChart jf = ChartFactory.createPieChart("Reporte de Ventas", controlPersis.datasetVentas(fecha), true, true, true);
            ChartFrame f = new ChartFrame("Total de ventas por dia", jf);
            f.setSize(1000, 500);
            f.setLocationRelativeTo(null);
            f.setVisible(true);
            return true;
        }else{
            return false;
        }

    }

    public void editarEmpresa(Empresa empresa) {
        controlPersis.editarEmpresa(empresa);
    }

}
