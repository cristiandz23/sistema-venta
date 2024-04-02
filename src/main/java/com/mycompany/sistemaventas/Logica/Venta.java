
package com.mycompany.sistemaventas.Logica;


public class Venta {
    private int id;
    private Login vendedor;
    private Cliente cliente;
    private double total;
    private String fecha;

    public Venta(int id, Login vendedor, Cliente cliente, double total, String fecha) {
        this.id = id;
        this.vendedor = vendedor;
        this.cliente = cliente;
        this.total = total;
        this.fecha = fecha;
    }

    public Venta() {
    }

    
    
    
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Login getVendedor() {
        return vendedor;
    }

    public void setVendedor(Login vendedor) {
        this.vendedor = vendedor;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public double getTotal() {
        return total;
    }

    public void setTotal(double total) {
        this.total = total;
    }

    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    
}
